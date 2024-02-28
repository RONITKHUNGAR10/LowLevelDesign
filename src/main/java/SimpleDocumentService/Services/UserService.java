package SimpleDocumentService.Services;

import SimpleDocumentService.Entities.Document;
import SimpleDocumentService.Entities.User;

public interface UserService {
    Document createDocument(int userId, int documentId, String documentName, String content);

    void grantReadAccess(User user, Document document,User reader);

    void grantWriteAccess(User user, Document document,User reader);


    void deleteDocument(User user, Document document);

}
