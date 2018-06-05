package RpcModule;

import static org.junit.Assert.assertTrue;

import Client.SocketClientProxy;
import Entity.Student;
import org.junit.Test;
import service.StudentService;
import Server.Server;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static void main(String [] arg){
        new Thread( () ->  {
            try {
                Server server = new Server(12000);
                server.start();
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        } ).start();

        SocketClientProxy proxy = new SocketClientProxy();
        StudentService studentService = proxy.getProxy(StudentService.class);
        Student student = studentService.getInfo();
        System.out.println(student.getName());
    }
}
