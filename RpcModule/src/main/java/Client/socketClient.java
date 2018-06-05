package Client;

import Entity.Request;
import Entity.Response;

import java.io.*;
import java.net.Socket;

public class socketClient {
    private Socket sock;

    public socketClient(){
    }

    public Object invoke(Request request, String Ip, int port) throws IOException {
        sock = new Socket(Ip,port);
        InputStream in = sock.getInputStream();
        OutputStream out = sock.getOutputStream();
        ObjectOutputStream objOut;
        ObjectInputStream objIn;
        Response response = null;
       try {
           objOut = new ObjectOutputStream(out);
           objOut.writeObject(request);
           objOut.flush();
           objIn = new ObjectInputStream(in);
           Object res = objIn.readObject();
           if (res instanceof Response) {
               response = (Response) res;
           } else {
               throw new RuntimeException("返回對象不正确!!!");
           }
       } catch (Exception e) {
           System.out.println("error:   " + e.getMessage());
       } finally {
           out.close();
           in.close();
           sock.close();
           return  response.getObj();
       }
    }
}
