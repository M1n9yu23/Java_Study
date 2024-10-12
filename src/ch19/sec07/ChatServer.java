/*
package ch19.sec07;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
        ServerSocket serverSocket;
        ExecutorService threadPool = Executors.newFixedThreadPool(100);
        Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());


        public void start() throws Exception{
            serverSocket = new ServerSocket(50001);
            System.out.println("[서버] 시작됨");

            Thread thread = new Thread(() -> {
                try{
                    while(true){
                        Socket socket = serverSocket.accept();
                        SocketClient sc = new SocketClient(this, socket);
                    }
                } catch(IOException e){

                }
            });
            thread.start();
        }

        public void addSocketClient(SocketClient socketClient){
            String key = socketClient.chatName + "@" + socketClient.clientIp;
            chatRoom.put(key, socketClient);
            System.out.println("입장: " + key);
            System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");

        }

        public void removeSocketClient(SocketClient socketClient){
            String key = socketClient.chatName + "@" + socketClient.clientIp;
            chatRoom.remove(key);
            System.out.println("나감: " + key);
            System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
        }


}*/
