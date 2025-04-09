import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class test {

    public static void main(String[] args) {
        Socket socket;
        int c = 0;
        while (true) {
            System.out.println(++c);
            try {
                socket = new Socket("localhost", 6789);
                try (BufferedReader dis = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                    System.out.println(dis.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                finally {
                    socket = null;
                }

//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
////                        throw new RuntimeException(e);
//                    System.err.println(e.getMessage());
//                }
            } catch(IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}
