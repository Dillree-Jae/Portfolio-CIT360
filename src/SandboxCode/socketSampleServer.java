package SandboxCode;

import java.io.*;
import java.net.*;
public class socketSampleServer {
    public static void main(String args[]) {
// declaration section:
// declare a server socket and a client socket for the server
// declare an input and an output stream
        ServerSocket serverSocket = null;
        String line;
        DataInputStream inputStream;
        DataOutputStream outputStream;
        Socket clientSocket = null;
// Try to open a server socket on port 9999
        try {
           serverSocket = new ServerSocket(9999);
        }
        catch (IOException e) {
           System.out.println(e);
        }   
// Create a socket object from the ServerSocket to listen and accept 
// connections.
    try {
           // this will be the listener socket
           clientSocket = serverSocket.accept();
           
           // Open input and output streams
           inputStream = new DataInputStream(clientSocket.getInputStream());
           outputStream = new DataOutputStream(clientSocket.getOutputStream());
// As long as we receive data, echo that data back to the client.
           while (true) {
             line = inputStream.readLine();
             outputStream.writeBytes(line); 
           }
        }   
    catch (IOException e) {
           System.out.println(e);
        }
    }
}