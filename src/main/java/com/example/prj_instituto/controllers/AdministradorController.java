package com.example.prj_instituto.controllers;

import com.example.prj_instituto.model.entities.Administrador;
import com.example.prj_instituto.services.AdministradorService;
import com.example.prj_instituto.services.impl.AdministradorServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AdministradorController", urlPatterns = {"/sValidador", "/admin"})
public class AdministradorController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sUsuraio = request.getParameter("txtUsuario");
        String sPassword = request.getParameter("txtPassword");

        AdministradorService servicio = new AdministradorServiceImpl();

        Administrador adm = servicio.validar(sUsuraio, sPassword);

        if (adm != null) {
            request.getSession().setAttribute("eladministrador", adm);
            response.sendRedirect("principal.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }



    }
