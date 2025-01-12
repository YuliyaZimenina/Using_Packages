package bookpack;

class BookDemo {
    public static void main(String[] args) {
        Book [] books = new Book[5];

        books[0] = new Book("White Fang","Jack London",1906);
        books[1] = new Book("Mysterious Island","Jules Verne",1875);
        books[2] = new Book("Countess de Monsoreau","Alexandre Dumas",1846);
        books[3] = new Book("American Tragedy","Theodore Deiser",1925);
        books[4] = new Book("The Martian Chronicles","Ray Bradbury",1950);

        for (int i = 0; i < books.length; i++) {
            books[i].showInfo();
        }
    }
}
