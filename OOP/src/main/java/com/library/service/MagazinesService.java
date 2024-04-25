package com.library.service;

import com.library.model.Book;
import com.library.model.Magazine;

import java.util.ArrayList;
import java.util.List;

public class MagazinesService implements LabraryService<Magazine> {
    public List<Magazine> magazines = new ArrayList<>();
    Integer counter= 1;
    @Override
    public void add(Magazine entity) {
        entity.setId(counter);
        counter++;
        magazines.add(entity);
    }

    @Override
    public Boolean update(Magazine entity) {
        Boolean isValid = false;
        for (Magazine tmp: magazines)
        {
            if(tmp.getId().equals(entity.getId()))
            {
//                String title, String author, int publicationYear, String organizations
                isValid = true;
//                tmp = entity ;
                tmp.setTitle(entity.getTitle());
                tmp.setAuthor(entity.getAuthor());
                tmp.setPublicationYear(entity.getPublicationYear());
                tmp.setOrganizations(entity.getOrganizations());
                break;
            }
        }
        return isValid;
    }

    @Override
    public Magazine readById(Integer id) {
        Magazine  magazine = new Magazine();
        magazine.setId(0);
        for (Magazine tmp: magazines)
        {
            if(tmp.getId().equals(id))
            {
                magazine = tmp ;
                break;
            }
        }

        return magazine;
    }

    @Override
    public void delete(Magazine entity) {

        Magazine magazine = readById(entity.getId());
        if (magazine.getId()!=0)
            System.out.println("deleting complete ");
        else
            System.out.println("idk something wrong or u enter wrong id");
    }
    @Override
    public Boolean isAvailable(String name) {
        for(Magazine magazine : magazines )
        {
            if(magazine.getTitle().equals(name))
            {
                return true;
            }
        }
        return false;
    }

}
