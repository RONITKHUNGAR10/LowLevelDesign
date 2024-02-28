package ChatBot.Entitites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Message {
    private int messageId;
    private String content;
    private User sender;
    private Date date;
    private int roomId;

    public Message(int messageId,String content,User sender,Date date){
        this.messageId=messageId;
        this.content=content;
        this.sender=sender;
        this.date=date;
    }
}
