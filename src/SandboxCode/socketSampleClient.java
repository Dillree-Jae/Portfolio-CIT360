package SandboxCode;

import java.io.*;
import java.net.*;
public class socketSampleClient {
    public static void main(String[] args) {

        Socket socket = null;  
        DataOutputStream outputStream = null;
        DataInputStream inputStream = null;

// Initialization section: trying to get the connection established between server and client
        try {
            // Try to open a socket on port 1234
            socket = new Socket("hostname", 1234);
            
            // Try to open input and output streams
            outputStream = new DataOutputStream(socket.getOutputStream());
            inputStream = new DataInputStream(socket.getInputStream());
        } 
        catch (UnknownHostException e) {
            System.err.println("Don't know about host: hostname");
        } 
        catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: hostname");
        }
// write some data to the socket we have opened a connection to on port 1234 if
// the connection between sockets has been established
    if (socket != null && outputStream != null && inputStream != null) {
            try {
// The capital string before each colon has a special meaning to SMTP
// you may want to read the SMTP specification, RFC1822/3
        outputStream.writeBytes("Numbers from 1 to 10\n");  
        for(int i = 1; i <= 11; i++){
            outputStream.write(i);
        }
        
        
// keep on reading from/to the socket till we receive the "Ok" from SMTP,
// once we received that then we want to break.
                String responseLine;
                while ((responseLine = inputStream.readLine()) != null) {
                    System.out.println("Server: " + responseLine);
                    if (responseLine.indexOf("Ok") != -1) {
                      break;
                    }
                }

// close the output stream, the input stream, the socket
        outputStream.close();
                inputStream.close();
                socket.close();   
            } catch (UnknownHostException e) {
                System.err.println("Trying to connect to unknown host: " + e);
            } catch (IOException e) {
                System.err.println("IOException:  " + e);
            }
        }
    }           
}