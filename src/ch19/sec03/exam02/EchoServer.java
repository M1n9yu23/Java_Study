package ch19.sec03.exam02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 서버
public class EchoServer {

    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("---------------------------------------------");

        startServer();

        Scanner scanner = new Scanner(System.in);
        while(true){
            String key = scanner.nextLine();
            if(key.toLowerCase().equals("q")){
                break;
            }
        }

        scanner.close();

        stopServer();
    }

    public static void startServer(){
        Thread thread = new Thread(){
            @Override
            public void run(){
                try{
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버] 시작됨");

                    while(true){
                        System.out.println("\n[서버] 연결 요청을 기다림\n");
                        Socket socket = serverSocket.accept(); // 연결 수락
                        // 클라이언트 정보를 얻기 위함.
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();

                        System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");

                        // 입력
                        InputStream is = socket.getInputStream(); // 소켓에서 스트림얻어줌
                        byte[] bytes = new byte[1024];
                        int readByteCount = is.read(bytes);
                        String message = new String(bytes, 0, readByteCount, "UTF-8");

                        // 출력
                        OutputStream os = socket.getOutputStream();
                        bytes = message.getBytes("UTF-8");
                        os.write(bytes);
                        os.flush();
                        System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);

                        socket.close();
                        System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");
                    }
                } catch(IOException e){
                    System.out.println("[서버] " + e.getMessage());
                }
            }
        };
        thread.start();
    }

    public static void stopServer(){
        try{
            serverSocket.close();
            System.out.println("[서버] 종료됨 ");
        } catch (IOException e1){

        }
    }
}
