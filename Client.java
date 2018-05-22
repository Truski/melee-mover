import java.io.*;
import java.net.*;

public class Client {
  public static void main(String[] args){
    try {
      String ip = args[0];
      Socket socket = new Socket(ip, 55555);
      InputStream is = socket.getInputStream();
      FileOutputStream fos = new FileOutputStream("melee.iso");
      
      int count; // Number of bytes read
      byte[] buffer = new byte[4096]; // Buffer to store file in
      while((count = is.read(buffer)) > 0 ){ // Read from Peer into buffer
        fos.write(buffer, 0, count); // Write to file from buffer
      }

      // Release resources
      socket.close();
      fos.close();

    } catch (Exception e){
      e.printStackTrace();
    }
  }
}