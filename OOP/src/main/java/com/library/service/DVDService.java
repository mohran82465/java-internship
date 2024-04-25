package com.library.service;



import com.library.model.Book;
import com.library.model.DVD;

import java.util.ArrayList;
import java.util.List;

public class DVDService implements LabraryService<DVD>{
    public List<DVD> dvds = new ArrayList<>();
    static int counter= 1;
    @Override
    public void add(DVD entity) {
        entity.setId(counter);
        counter++;
        dvds.add(entity);
    }

    @Override
    public Boolean update(DVD entity) {

        Boolean isValid = false;

        for (DVD tmp: dvds)
        {

            if(tmp.getId().equals(entity.getId()))
            {
//                String title, String author, int publicationYear, String pand
//                tmp = entity ;
                tmp.setTitle(entity.getTitle());
                tmp.setAuthor(entity.getAuthor());
                tmp.setPublicationYear(entity.getPublicationYear());
                tmp.setPand(entity.getPand());
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    @Override
    public DVD readById(Integer id) {
        DVD dvd = new DVD();
        dvd.setId(0);
        for (DVD tmp: dvds)
        {
            if(tmp.getId().equals(id))
            {
                dvd = tmp ;
                break;
            }
        }

        return dvd;
    }

    @Override
    public void delete(DVD entity) {

        DVD dvd = readById(entity.getId());
        if (dvd.getId()!=0)
            System.out.println("deleting complete ");
        else
            System.out.println("idk something wrong or u enter wrong id");
    }
    @Override
    public Boolean isAvailable(String name) {
        for(DVD dvd : dvds )
        {
            if(dvd.getTitle().equals(name))
            {
                return true;
            }
        }
        return false;
    }
}
