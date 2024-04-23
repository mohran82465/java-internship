package com.library.model;

public class Magazine extends LibraryModel{

    private String organizations ;

    public Magazine() {

    }

    public Magazine(int id, String title, String author, int publicationYear, String organizations) {
        super(id, title, author, publicationYear);
        this.organizations = organizations;
    }

    public String getOrganizations() {
        return organizations;
    }

    public void setOrganizations(String organizations) {
        this.organizations = organizations;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                super.toString()
                +"organizations='" + organizations + '\'' +
                '}';
    }
}
