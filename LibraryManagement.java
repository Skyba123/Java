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

     public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

      public void removeBookByIsbn(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
                System.out.println("Book with ISBN " + isbn + " has been removed from the library.");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in the library.");
    }
  }

}
