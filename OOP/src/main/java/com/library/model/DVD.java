package com.library.model;

public class DVD extends LibraryModel{
    private String pand ;

    public DVD() {
    }

    public DVD(int id, String title, String author, int publicationYear, String pand) {
        super(id, title, author, publicationYear);
        this.pand = pand;
    }

    public String getPand() {
        return pand;
    }

    public void setPand(String pand) {
        this.pand = pand;
    }

    @Override
    public String toString() {
        return "DVD{" +
                super.toString()
                +
                "pand='" + pand + '\'' +
                '}';
    }
}
