package bookpack;
public class Book {
    private String title;
    private String author;
    private int publicationDate;

    public Book(String t, String a, int p){
        title = t;
        author = a;
        publicationDate = p;
    }

    public void showInfo(){
        System.out.println("Title: " + title);
        System.out.println("Aythor: " + author);
        System.out.println("Publication data:" + publicationDate);
        System.out.println();
    }
}
