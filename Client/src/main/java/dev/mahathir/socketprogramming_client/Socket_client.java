package dev.mahathir.socketprogramming_client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import protoClass.RequestOuterClass;
import protoClass.ResponseOuterClass;


import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

@SpringBootApplication
public class Socket_client {

	public static void main(String[] args) {
		String hostname = "localhost";
		int port = 8300;
		try (Socket socket = new Socket(hostname, port)) {
			ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

			// Create and send request to server
			RequestOuterClass.Request request = RequestOuterClass.Request.newBuilder()
					.setCallingNumber("01747424468")
					.setCalledNumber("01847424468")
					.setCallerIp("103.98.66.5")
					.setCallId("11211747424468")
					.build();
			output.writeObject(request.toByteArray());
			System.out.println("Sent request: " + request);

			// Received response from server
			byte[] responseBytes = (byte[]) input.readObject();
			ResponseOuterClass.Response response = ResponseOuterClass.Response.parseFrom(responseBytes);

			System.out.println("Call Rate = " + response.getCallRate() + " Taka");

		} catch (UnknownHostException ex) {
			System.out.println("Server not found: " + ex.getMessage());
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("I/O error: " + ex.getMessage());
		}
	}
}