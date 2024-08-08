package com.example.outcamp_module3.repository.trang_thai;

import com.example.outcamp_module3.module.TrangThai;
import com.example.outcamp_module3.util.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrangThaiRepository implements ITrangThaiRepository {

    private static final String SHOW_ALL_LIST_TRANGTHAI = "select ten_trang_thai from TrangThai;";

    @Override
    public List<TrangThai> findAll() {
        List<TrangThai> trangThaiList = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SHOW_ALL_LIST_TRANGTHAI);
             ResultSet resultSet = preparedStatement.executeQuery()){
            while (resultSet.next()){
                TrangThai trangThai = new TrangThai();
                trangThai.setName(resultSet.getString("ten_trang_thai"));
                trangThaiList.add(trangThai);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return trangThaiList;
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
