package dev.mahathir.socket_programming;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.Request;
import service.Response;

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
				Request request = (Request) input.readObject();
				System.out.println("Received request: " + request);

				// Process request and prepare response
				double callRate = processRequest(request);

				// Send response to client
				Response response = new Response(callRate);
				output.writeObject(response);

				socket.close();
			}
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("Server exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	private static double processRequest(Request request) {
		//based on the request calculation select the callRate
		return 3.0;

	}
}
