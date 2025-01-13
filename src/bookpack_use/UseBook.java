package bookpack_use;
import bookpack.Book;
// Using a class from another package
class UseBook {
    public static void main(String[] args) {
        Book[] books = new bookpack.Book[5];

        books[0] = new bookpack.Book("Nightfall","Isaac Asimov",1941);
        books[1] = new bookpack.Book("West of Eden","Harry Harrison",1981);
        books[2] = new bookpack.Book("The Great Book of Amber","Roger Zelazny",1970);
        books[3] = new bookpack.Book("A princess of Mars","Edgar Rice Burroughs",1911);
        books[4] = new bookpack.Book("The Lost World","Arthur Conan Doyle", 1912);

        for (int i = 0; i < books.length; i++) {
            books[i].showInfo();
        }
    }
}
