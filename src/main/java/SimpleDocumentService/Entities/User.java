package SimpleDocumentService.Entities;

import SimpleDocumentService.Enums.ROLE;
import SimpleDocumentService.Services.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class User implements UserService {
    private String userName;
    private int userId;
    private List<Document> documents;

    public User(String userNameme,int userId){
        this.userId=userId;
        this.userName=userNameme;
        documents=new ArrayList<>();
    }

    @Override
    public Document createDocument(int userId, int documentId, String documentName, String content) {
        Document doc = new Document(documentId, documentName, content, userId);
        documents.add(doc);
        return doc;
    }

    @Override
    public void grantReadAccess(User owner, Document document, User reader) {
        if (owner != null && document != null) {
            if (document.getUserIdToRoleMap() != null && document.getUserIdToRoleMap().get(owner.getUserId()).equals(ROLE.OWNER)) {
                document.getUserIdToRoleMap().put(reader.getUserId(), ROLE.READ);
            }

        }
    }

    @Override
    public void grantWriteAccess(User owner, Document document, User writer) {
        if (owner != null && document != null) {
            if (document.getUserIdToRoleMap() != null && document.getUserIdToRoleMap().get(owner.getUserId()).equals(ROLE.OWNER)) {
                document.getUserIdToRoleMap().put(writer.getUserId(), ROLE.WRITE);
            }

        }
    }

    @Override
    public void deleteDocument(User owner, Document document) {
        if (owner != null && document != null) {
            if (document.getUserIdToRoleMap() != null && document.getUserIdToRoleMap().get(owner.getUserId()).equals(ROLE.OWNER)) {
                document = null;
            }

        }
    }
}
