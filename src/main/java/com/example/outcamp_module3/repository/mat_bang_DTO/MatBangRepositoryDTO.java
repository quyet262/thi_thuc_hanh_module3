package com.example.outcamp_module3.repository.mat_bang_DTO;

import com.example.outcamp_module3.module.MatBangDTO;
import com.example.outcamp_module3.util.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatBangRepositoryDTO implements IMatBangRepositoryDTO{
    private static final String SHOW_ALL_LIST_MATBANG = "select id_mat_bang, ma_mat_bang, ten_trang_thai, dien_tich, tang, loai_mat_bang,gia_tien, ngay_bat_dau, ngay_ket_thuc from MatBang\n" +
            "join TrangThai on MatBang.trang_thai_id = TrangThai.id;";




    @Override
    public List<MatBangDTO> findAll() {
        List<MatBangDTO> matBangDTOS = new ArrayList<MatBangDTO>();

        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SHOW_ALL_LIST_MATBANG);
             ResultSet resultSet = preparedStatement.executeQuery()){
            while (resultSet.next()){
                MatBangDTO matBangDTO = new MatBangDTO();
                matBangDTO.setId(resultSet.getInt("id_mat_bang"));
                matBangDTO.setMaMatBang(resultSet.getString("ma_mat_bang"));
                matBangDTO.setTrangThai(resultSet.getString("ten_trang_thai"));
                matBangDTO.setDienTich(resultSet.getFloat("dien_tich"));
                matBangDTO.setTang(resultSet.getInt("tang"));
                matBangDTO.setLoaiMatBang(resultSet.getBoolean("loai_mat_bang"));
                matBangDTO.setGiaTien(resultSet.getDouble("gia_tien"));
                matBangDTO.setNgayBatDau(resultSet.getDate("ngay_bat_dau"));
                matBangDTO.setNgayKetthuc(resultSet.getDate("ngay_ket_thuc"));
                matBangDTOS.add(matBangDTO);

            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        return matBangDTOS;
    }

    @Override
    public MatBangDTO findById(int id) {
        return null;
    }

    @Override
    public void save(MatBangDTO object) {

    }

    @Override
    public void update(int id, MatBangDTO object) {

    }

    @Override
    public void delete(int id) {

    }
}
