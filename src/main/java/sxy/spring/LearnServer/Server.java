package sxy.spring.LearnServer;

import org.apache.catalina.webresources.war.Handler;
import org.springframework.asm.Handle;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("server is running");
        while (true){
            Socket soc = ss.accept();
            System.out.println("connected from"+ soc.getRemoteSocketAddress());

//            Thread t = new Handler(soc);
//            t.start();
        }
    }
}
