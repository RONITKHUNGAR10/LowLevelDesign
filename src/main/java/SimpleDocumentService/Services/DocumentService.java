package SimpleDocumentService.Services;

import SimpleDocumentService.Entities.Document;
import SimpleDocumentService.Entities.User;

public interface DocumentService {

    String getContent(Document document, User user);

    void writeContent(Document document, User user, String content);

}
