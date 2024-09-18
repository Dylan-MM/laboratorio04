package com.example.prj_instituto.model.daos;


import com.example.prj_instituto.model.entities.Administrador;

public interface AdministradorDao {

    public Administrador validar(String nombre, String password) ;
}
