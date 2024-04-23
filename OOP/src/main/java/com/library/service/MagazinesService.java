package com.library.service;

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
        Magazine magazine = new Magazine();
        magazine.setId(0);
        for (Magazine tmp: magazines)
        {
            if(tmp.getId().equals(entity.getId()))
            {
                magazine = entity ;
                break;
            }
        }
        return (magazine.getId() == 0) ? false : true;
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

}
