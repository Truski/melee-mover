import java.io.*;
import java.net.*;

public class Server {
  public static void main(String[] args){
    try {
      int port = 55555;

      ServerSocket s = new ServerSocket(port);

      Socket socket = s.accept();

      OutputStream os = socket.getOutputStream();

      FileInputStream fis = new FileInputStream("melee.iso");

      int count; // Number of bytes read from file
      byte[] buffer = new byte[4096]; // Buffer to store file in
      while ((count = fis.read(buffer)) > 0){ // Read from file into buffer
        os.write(buffer, 0, count); // Write to Peer from Buffer
      }

      // Release resources
      socket.close();
      fis.close();

    } catch (Exception e){
      e.printStackTrace();
    }
  }
}