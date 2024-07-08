package dev.mahathir.socket_programming;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import protoGeneratedClasses.RequestOuterClass;
import protoGeneratedClasses.ResponseOuterClass;
//import service.Request;
//import service.Response;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@SpringBootApplication
public class Socket_server {

	public static void main(String[] args) {
		int port = 8300;
		try (ServerSocket serverSocket = new ServerSocket(port)) {
			System.out.println("Server is listening on port " + port);

			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("New client connected");

				ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
				ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());

				// Received request from client
				byte[] requestBytes = (byte[]) input.readObject();
				RequestOuterClass.Request request = RequestOuterClass.Request.parseFrom(requestBytes);
				System.out.println("Received request: " + request);

				// Process request and prepare response
				double callRate = processRequest(request);

				// Send response to client
				ResponseOuterClass.Response response = ResponseOuterClass.Response.newBuilder()
						.setCallRate(callRate)
						.build();
				output.writeObject(response.toByteArray());

				socket.close();
			}
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("Server exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	private static double processRequest(RequestOuterClass.Request request) {
		//based on the request calculation select the callRate
		return 3.0;
	}
}