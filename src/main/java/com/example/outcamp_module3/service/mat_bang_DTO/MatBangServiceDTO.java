package com.example.outcamp_module3.service.mat_bang_DTO;

import com.example.outcamp_module3.module.MatBangDTO;
import com.example.outcamp_module3.repository.mat_bang_DTO.MatBangRepositoryDTO;

import java.util.Collections;
import java.util.List;

public class MatBangServiceDTO implements IMatBangServiceDTO{
    MatBangRepositoryDTO matBangRepositoryDTO = new MatBangRepositoryDTO();


    @Override
    public List<MatBangDTO> findAll() {
        return matBangRepositoryDTO.findAll();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, MatBangDTO object) {

    }

    @Override
    public void save(MatBangDTO object) {

    }

    @Override
    public MatBangDTO findById(int id) {
        return null;
    }
}
