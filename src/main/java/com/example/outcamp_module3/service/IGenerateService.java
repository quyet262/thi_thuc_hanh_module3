package com.example.outcamp_module3.service;

import java.util.List;

public interface IGenerateService<T> {
    public List<T> findAll();
    public T findById(int id);
    public void save(T object);
    public void update(int id, T object);
    public void delete(int id);

}
