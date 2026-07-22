package oopsjavapractice.scenariobased.librarymangementsystem;

public class LibraryMain {
    public void display() {
        Book book = new Book(
                "Dopamine Detox",
                "2021"
        );
        Author author = new Author(
                "Thibaut",
                "Male",
                book
        );

        Book book1 = new Book(
                "Metamorphosis",
                "1915"
        );

        Author author1 = new Author(
                "Franz Kafka",
                "Male",
                book1
        );

        System.out.println(author);
        System.out.println("-----------------------------------");
        System.out.println(author1);
    }

    public static void main(String[] args) {
        LibraryMain libraryMain = new LibraryMain();
        libraryMain.display();
    }
}
