package SimpleDocumentService;

import SimpleDocumentService.Entities.Document;
import SimpleDocumentService.Entities.User;
import com.sun.javadoc.Doc;

public class Main {

    public static void main(String[] args) {
        User ronit = new User("Ronit",1);
        User neeraj = new User("neeraj",2);
        User dolly = new User("dolly",3);

        Document document = new Document(1,"doc1","content1",neeraj.getUserId());
        neeraj.grantReadAccess(neeraj,document,ronit);
        System.out.println(document.getContent(document,ronit));
        System.out.println(document.getContent(document,dolly));

    }
}
