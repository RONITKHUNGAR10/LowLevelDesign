package ChatBot.Entitites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class GroupChatRoom extends ChatRoom {
    List<User> groupChatList;

    public void addUserToGroupChat(User user){
        if(groupChatList==null){
            groupChatList=new ArrayList<>();
        }
        groupChatList.add(user);
    }

    public void removeUserFromGroupChat(User user){
        if(groupChatList==null){
            groupChatList=new ArrayList<>();
        }
        groupChatList.remove(user);
    }
}
