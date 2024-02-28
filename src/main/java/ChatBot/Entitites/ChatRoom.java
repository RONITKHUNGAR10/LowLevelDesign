package ChatBot.Entitites;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ChatRoom {
    @Getter @Setter
    private int roomId;
    Map<User,Message> messageList=new HashMap<>();
    static int messageId = 1;

    void sendMessage(String content,User user){
        Message message = Message.builder().roomId(roomId).messageId(messageId++).content(content).sender(user).date(new Date()).build();
      messageList.put(user,message);
    }


}
