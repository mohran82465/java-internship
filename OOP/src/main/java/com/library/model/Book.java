package com.library.model;

public class Book extends LibraryModel{
    private String isbn ;
    private String publisher;

    public Book() {
    }

    public Book(int id, String title, String author, int publicationYear, String isbn, String publisher) {
        super(id, title, author, publicationYear);
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                super.toString()
                +
                "isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
