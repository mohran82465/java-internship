package com.library.service;

public interface LabraryService<T> {
    void add(T entity);
    Boolean update(T entity );
    T readById(Integer id);
    void delete (T entity);

}
