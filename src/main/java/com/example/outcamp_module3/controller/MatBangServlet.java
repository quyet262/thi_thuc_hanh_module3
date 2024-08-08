package com.example.outcamp_module3.controller;


import com.example.outcamp_module3.module.MatBangDTO;
import com.example.outcamp_module3.service.mat_bang_DTO.MatBangServiceDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "matBangServlet", value = "/matbang")
public class MatBangServlet extends HttpServlet {
    MatBangServiceDTO matBangServiceDTO = new MatBangServiceDTO();

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
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
