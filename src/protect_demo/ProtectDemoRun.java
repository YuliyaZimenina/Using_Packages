package protect_demo;

public class ProtectDemoRun {
    public static void main(String[] args) {
        ProtectDemo [] usersBooks = new ProtectDemo[5];

        usersBooks[0] = new ProtectDemo("The Color of Magic","Terry Pratchett",1983,"Fantasy");
        usersBooks[1] = new ProtectDemo("The Chronicles of Narnia","Clive Staples Lewis",1950,"Fantasy");
        usersBooks[2] = new ProtectDemo("Moby Dick Or, The Whale","Herman Melville",1851,"Adventures");
        usersBooks[3] = new ProtectDemo("Salem's Lot","Stephen King",1975,"Horror");
        usersBooks[4] = new ProtectDemo("Ivanhoe","Walter Scott",1819,"Historical");

        for (int i = 0; i < usersBooks.length; i++) {
            usersBooks[i].showInfo();
        }

        // Search for a book by author
        System.out.println("All books by Walter Scott: ");
        for (int i = 0; i < usersBooks.length; i++) {
            if (usersBooks[i].getAuthor() == "Walter Scott")
                System.out.println(usersBooks[i].getTitle());
        }
    }
}
