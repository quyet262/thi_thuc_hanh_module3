package com.example.outcamp_module3.module;

import java.sql.Date;

public class MatBangDTO {
    private int id;
    private String maMatBang;
    private String TrangThai;
    private float dienTich;
    private  int tang;
    private boolean loaiMatBang;
    private double giaTien;
    private java.sql.Date ngayBatDau;
    private java.sql.Date ngayKetthuc;

    public MatBangDTO() {
    }

    public MatBangDTO(String maMatBang, String trangThai, float dienTich, int tang,
                      boolean loaiMatBang, double giaTien, Date ngayBatDau, Date ngayKetthuc) {
        this.maMatBang = maMatBang;
        TrangThai = trangThai;
        this.dienTich = dienTich;
        this.tang = tang;
        this.loaiMatBang = loaiMatBang;
        this.giaTien = giaTien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetthuc = ngayKetthuc;
    }

    public MatBangDTO(int id, String maMatBang, String trangThai, float dienTich, int tang,
                      boolean loaiMatBang, double giaTien, Date ngayBatDau, Date ngayKetthuc) {
        this.id = id;
        this.maMatBang = maMatBang;
        TrangThai = trangThai;
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

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
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

    @Override
    public String toString() {
        return "MatBangDTO{" +
                "id=" + id +
                ", maMatBang='" + maMatBang + '\'' +
                ", TrangThai='" + TrangThai + '\'' +
                ", dienTich=" + dienTich +
                ", tang=" + tang +
                ", loaiMatBang=" + loaiMatBang +
                ", giaTien=" + giaTien +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetthuc=" + ngayKetthuc +
                '}';
    }
}
