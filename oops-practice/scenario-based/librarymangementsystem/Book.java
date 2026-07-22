package oopsjavapractice.scenariobased.librarymangementsystem;

public class Book {
    public String BookTitle;
    public String BookPublicationYear;

    public Book(String bookTitle, String bookPublicationYear) {
        this.BookTitle = bookTitle;
        this.BookPublicationYear = bookPublicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookTitle='" + BookTitle + '\'' +
                ", BookPublicationYear='" + BookPublicationYear + '\'' +
                '}';
    }
}
