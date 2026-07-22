package oopsjavapractice.scenariobased.librarymangementsystem;

public class Author {
    public String AuthorName;
    public String AuthorBio;

    Book book;

    public Author (String authorName, String authorBio, Book book) {
        this.AuthorName = authorName;
        this.AuthorBio = authorBio;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "AuthorName='" + AuthorName + '\'' +
                ", AuthorBio='" + AuthorBio + '\'' +
                ", book=" + book +
                '}';
    }


}
