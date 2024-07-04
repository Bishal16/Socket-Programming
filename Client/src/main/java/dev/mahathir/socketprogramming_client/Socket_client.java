package dev.mahathir.socketprogramming_client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.Request;
import service.Response;

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
			String callingNumber ="01747424468";
			String calledNumber ="01847424468";
			String callerIp ="103.98.66.5";
			String callId ="11211747424468";

			Request request = new Request(callingNumber, calledNumber, callerIp, callId );
			output.writeObject(request);
			System.out.println("Sent request: " + request);

			// Received response from server
			Response response = (Response) input.readObject();
			System.out.println("Call Rate = " + response.getCallRate() + " Taka");

		} catch (UnknownHostException ex) {
			System.out.println("Server not found: " + ex.getMessage());
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("I/O error: " + ex.getMessage());
		}
	}

}
