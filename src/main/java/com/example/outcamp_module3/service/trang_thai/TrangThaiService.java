package com.example.outcamp_module3.service.trang_thai;

import com.example.outcamp_module3.module.TrangThai;
import com.example.outcamp_module3.repository.trang_thai.TrangThaiRepository;

import java.util.Collections;
import java.util.List;

public class TrangThaiService implements ITrangThaiService{
    TrangThaiRepository trangThaiRepository = new TrangThaiRepository();

    @Override
    public List<TrangThai> findAll() {
        return trangThaiRepository.findAll();
    }

    @Override
    public TrangThai findById(int id) {
        return null;
    }

    @Override
    public void save(TrangThai object) {

    }

    @Override
    public void update(int id, TrangThai object) {

    }

    @Override
    public void delete(int id) {

    }
}
