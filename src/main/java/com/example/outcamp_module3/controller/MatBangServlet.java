package com.example.outcamp_module3.controller;


import com.example.outcamp_module3.module.MatBang;
import com.example.outcamp_module3.module.MatBangDTO;
import com.example.outcamp_module3.module.TrangThai;
import com.example.outcamp_module3.service.mat_bang_DTO.MatBangServiceDTO;
import com.example.outcamp_module3.service.trang_thai.TrangThaiService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "matBangServlet", value = "/matbang")
public class MatBangServlet extends HttpServlet {
    MatBangServiceDTO matBangServiceDTO = new MatBangServiceDTO();
    TrangThaiService trangThaiService = new TrangThaiService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "edit":
                showFormUpdate(request, response);
                break;
            case "delete":
                showFormDelete(request, response);
            default:
                showListMatBang(request, response);
                break;
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
            List<TrangThai> trangThaiList = trangThaiService.findAll();


            request.setAttribute("trangThaiList", trangThaiList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void showFormUpdate(HttpServletRequest request, HttpServletResponse response) {

    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {

    }

    private void showListMatBang(HttpServletRequest request, HttpServletResponse response) {
        List<MatBangDTO> matBangDTOS = matBangServiceDTO.findAll();

        request.setAttribute("matBangDTOS", matBangDTOS);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createMatBang(request, response);
                break;
        }
    }

    private void createMatBang(HttpServletRequest request, HttpServletResponse response) {

        String maMatBang = request.getParameter("maMatBang");
        int idtrangThai = Integer.parseInt(request.getParameter("idtrangthai"));
        float dienTich = Float.parseFloat(request.getParameter("dienTich"));
        int tang = Integer.parseInt(request.getParameter("tang"));
        boolean loaiMatBang = Boolean.parseBoolean(request.getParameter("loaiMatBang"));
        double giaTien = Double.parseDouble(request.getParameter("giaTien"));
        Date ngayBatDau = Date.valueOf(LocalDate.parse(request.getParameter("ngayBatDau")));
        Date ngayKetThuc = Date.valueOf(LocalDate.parse(request.getParameter("ngayKetThuc")));


       MatBang matBang = new MatBang(maMatBang,idtrangThai,dienTich,tang,loaiMatBang,giaTien,ngayBatDau,ngayKetThuc);

        String error = null;


        if (matBangServiceDTO.findByMaMatBang(maMatBang) != null) {
            error = "Mã mặt bằng vừa thêm đã tồn tại";
        }

        long diffInMillies = Math.abs(ngayKetThuc.getTime() - ngayBatDau.getTime());
        long diffInMonths = diffInMillies / (1000 * 60 * 60 * 24 * 30L);
        if (diffInMonths < 6) {
            error = "Ngày bắt đầu phải nhỏ hơn ngày kết thúc ít nhất 6 tháng";
        }

        if (error != null) {
            request.setAttribute("error", error);
            showFormCreate(request, response);
        } else {
            matBangServiceDTO.saveMatBang(matBang);
            try {
                response.sendRedirect("matbang");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
