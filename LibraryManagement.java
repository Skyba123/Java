import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;

    public Book(String title, String author, String isbn, int publicationYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }
     public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

        public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Year of publication: " + publicationYear;
    }

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }

    public void showAllBooks() {
        System.out.println("Library Catalog:");
        for (Book book : books) {
            System.out.println(book);
        }
    }




}
