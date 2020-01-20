
public class Client {

public static void main(String[] args) {
    System.out.println("this is the client programme");
    book b=new book();
    JournalPaper jp=new JournalPaper();
    Video v=new Video();
    CD c=new CD();

    b.DisplayDetails();b.getters();b.GettingDetails();b.setters();
    jp.getters();jp.setters();
    v.cDQuality();v.videoQuality();v.getters();v.setters();
    c.cDQuality();c.videoQuality();v.getters();v.setters();
}

} 
