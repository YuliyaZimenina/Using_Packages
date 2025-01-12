package protect_demo;
//Demonstration of the protected access modifier
public class ProtectDemo extends bookpack.Book{
    private String genre;

    public ProtectDemo(String t, String a, int d, String g){
        super(t, a, d);
        genre = g;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Genre: " + genre);
        System.out.println();
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String g){
        genre = g;
    }

    /*Allowed because the subclass has access to protected
    members of the class
     */
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        title = t;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String a){
        author = a;
    }
    public int getPublicationDate(){
        return publicationDate;
    }
    public void setPublicationDate(int p){
        publicationDate = p;
    }


}
