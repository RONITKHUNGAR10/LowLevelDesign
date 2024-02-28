package ChatBot.Entitites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PrivateChatRoom extends ChatRoom{
    private User Sender;
    private User Receiver;
}
