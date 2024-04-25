package com.library.service;


import com.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService implements LabraryService<Book>{
    public List<Book> books = new ArrayList<>();
    Integer counter= 1;
    @Override
    public void add(Book entity) {
        entity.setId(counter);
        counter++;
        books.add(entity);
    }

    @Override
    public Boolean update(Book entity) {
        Boolean isValid = false;

        for (Book tmp: books)
        {
            if(tmp.getId().equals(entity.getId()))
            {
//                int id, String title, String author, int publicationYear, String isbn, String publisher
                tmp.setTitle(entity.getTitle());
                tmp.setAuthor(entity.getAuthor());
                tmp.setPublicationYear(entity.getPublicationYear());
                tmp.setIsbn(entity.getIsbn());
                tmp.setPublisher(entity.getPublisher());
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    @Override
    public Book readById(Integer id) {
        Book book = new Book();
        book.setId(0);
        for (Book tmp: books)
        {
            if(tmp.getId().equals(id))
            {
                book = tmp ;
                break;
            }
        }

        return book;
    }

    @Override
    public void delete(Book entity) {

        Book book = readById(entity.getId());
        if (book.getId()!=0)
            System.out.println("deleting complete ");
        else
            System.out.println("idk something wrong or u enter wrong id");
    }

    @Override
    public Boolean isAvailable(String name) {
        for(Book book : books )
        {
            if(book.getTitle().equals(name))
            {
                return true;
            }
        }
        return false;
    }
}
