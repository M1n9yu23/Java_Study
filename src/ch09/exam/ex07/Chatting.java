package ch09.exam.ex07;

public class Chatting {
    class Chat{
        void start(){

        }
        void sendMessage(String message){
            System.out.println(message);
        }
    }

    void startChat(String chatId){
        String nickName = chatId;

        Chat chat = new Chat(){
            @Override
            public void start(){
                while(true){
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "]" + inputData;
                    sendMessage(message);
                }
            }
        };

        chat.start();
    }
}
