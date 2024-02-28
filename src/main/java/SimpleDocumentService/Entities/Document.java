package SimpleDocumentService.Entities;

import SimpleDocumentService.Enums.ROLE;
import SimpleDocumentService.Services.DocumentService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Document implements DocumentService {
    Map<Integer, ROLE> userIdToRoleMap;
    private int documentId;
    private String documentName;
    private String content;

    public Document(int documentId, String docmentName, String content, int userId) {
        this.documentId = documentId;
        this.documentName = docmentName;
        this.content = content;
        userIdToRoleMap = new HashMap<>();
        userIdToRoleMap.put(userId, ROLE.OWNER);
    }

    private void setContent(String content) {
        this.content = content;
    }


    @Override
    public String getContent(Document document, User user) {
        if (document.getUserIdToRoleMap() != null && user != null && document.getUserIdToRoleMap().get(user.getUserId())!=null) {
            if (document.getUserIdToRoleMap().get(user.getUserId()).equals(ROLE.OWNER) || document.getUserIdToRoleMap().get(user.getUserId()).equals(ROLE.READ) || document.getUserIdToRoleMap().get(user.getUserId()).equals(ROLE.WRITE)) {
                return document.getContent();
            }
        }
        return "NO ACCESS";
    }

    @Override
    public void writeContent(Document document, User user, String content) {
        if (document.getUserIdToRoleMap() != null && user != null) {
            if (document.getUserIdToRoleMap().get(user.getUserId()).equals(ROLE.WRITE) || document.getUserIdToRoleMap().get(user.getUserId()).equals(ROLE.OWNER)) {
                document.setContent(content);
            }
        }
    }
}
