package com.example.prj_instituto.model.daos.impl;

import com.example.prj_instituto.model.daos.AdministradorDao;
import com.example.prj_instituto.model.entities.Administrador;
import com.example.prj_instituto.util.DBConn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministradorDaoCallableStatement implements AdministradorDao {

    private Connection con;
    private ResultSet rs;
    private CallableStatement cst;

    @Override
    public Administrador validar(String nombre, String password) {
        Administrador administrador = null;

        try(Connection con = DBConn.getConnection()) {
            cst = con.prepareCall("{call sp_login(?,?)}");
            cst.setString(1, nombre);
            cst.setString(2, password);
            rs = cst.executeQuery();


            if(rs.next()) {
                administrador = new Administrador();
                administrador.setCodigo(rs.getString(1));
                administrador.setLogin(rs.getString(2));
                administrador.setPassword(rs.getString(3));
                administrador.setNombres(rs.getString(4));
                administrador.setApellidos(rs.getString(5));
                System.out.println("Administrador encontrado: " + administrador.getLogin());
            } else {
                System.out.println("No se encontró ningún administrador con las credenciales proporcionadas.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return administrador;
    }

}
