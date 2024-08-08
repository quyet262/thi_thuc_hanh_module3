package com.example.outcamp_module3.module;

import java.sql.Date;

public class MatBang {
    private int id;
    private String maMatBang;
    private int idTrangThai;
    private float dienTich;
    private  int tang;
    private boolean loaiMatBang;
    private double giaTien;
    private java.sql.Date ngayBatDau;
    private java.sql.Date ngayKetthuc;

    public MatBang() {
    }

    public MatBang(int id, String maMatBang, int idTrangThai, float dienTich, int tang,
                   boolean loaiMatBang, double giaTien, Date ngayBatDau, Date ngayKetthuc) {
        this.id = id;
        this.maMatBang = maMatBang;
        this.idTrangThai = idTrangThai;
        this.dienTich = dienTich;
        this.tang = tang;
        this.loaiMatBang = loaiMatBang;
        this.giaTien = giaTien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetthuc = ngayKetthuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaMatBang() {
        return maMatBang;
    }

    public void setMaMatBang(String maMatBang) {
        this.maMatBang = maMatBang;
    }

    public int getIdTrangThai() {
        return idTrangThai;
    }

    public void setIdTrangThai(int idTrangThai) {
        this.idTrangThai = idTrangThai;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public boolean isLoaiMatBang() {
        return loaiMatBang;
    }

    public void setLoaiMatBang(boolean loaiMatBang) {
        this.loaiMatBang = loaiMatBang;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetthuc() {
        return ngayKetthuc;
    }

    public void setNgayKetthuc(Date ngayKetthuc) {
        this.ngayKetthuc = ngayKetthuc;
    }
}
