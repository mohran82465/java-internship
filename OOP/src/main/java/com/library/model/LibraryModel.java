package com.library.model;

public class LibraryModel {
    private Integer id ;
    private String title ;
    private String author;
    private Integer publicationYear ;

    public LibraryModel() {
    }

    public LibraryModel(int id) {
        this.id = id;
    }

    public LibraryModel(Integer id, String title, String author, Integer publicationYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Id: "+ id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear ;
    }
}
