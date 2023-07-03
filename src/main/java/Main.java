import util.Log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        Log.info("Logs from your program will appear here!");

        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        int port = 6379;

        Log.criticalInfo("Port number is "+port);

        try {
            serverSocket = new ServerSocket(port);
            serverSocket.setReuseAddress(true);

            Log.info("Server socket init");

            // Wait for connection from client.
            clientSocket = serverSocket.accept();

            Log.info("Client socket accepting now");

        } catch (IOException e) {
            Log.exception("IOException: " + e.getMessage());
        } finally {
            Log.info("Finally");
            try {
                if (clientSocket != null) {
                    clientSocket.close();
                    Log.info("Client socket closed");
                }
            } catch (IOException e) {
                Log.exception("IOException: " + e.getMessage());
            }
        }
    }
}
