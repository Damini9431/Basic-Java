package com.assignment;
import java.util.ArrayList;
class Book {
    private int bookId;
    private String bookName;
    private String authorName;
    
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }
}

public class BookCollection {
     public static void main(String[] args) {
        ArrayList<Book> b1 = new ArrayList<>();
        b1.add(new Book(1, "War and peace", "Leo Tolstoy"));
        b1.add(new Book(2, "Time Machine", "H.G Wells"));
        b1.add(new Book(3, "Romeo and Julliet", "William Shakespeare"));
        b1.add(new Book(4, "Pride and Prejudice", "Jane Austen"));
        b1.add(new Book(5, "Broken Wings", "Sarojini Naidu"));
        System.out.println("Book Details:");
        
        for (Book book : b1) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Author Name: " + book.getAuthorName());
            System.out.println("----------------------------");
        }
    }
}