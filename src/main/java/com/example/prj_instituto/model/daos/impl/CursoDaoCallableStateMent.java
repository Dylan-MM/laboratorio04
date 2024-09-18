package com.example.prj_instituto.model.daos.impl;

import com.example.prj_instituto.model.daos.CursoDao;
import com.example.prj_instituto.model.entities.Administrador;
import com.example.prj_instituto.model.entities.Curso;
import com.example.prj_instituto.util.DBConn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoDaoCallableStateMent implements CursoDao {

    private Connection conn;
    private ResultSet rs;
    private CallableStatement cst;

    @Override
    public List<Curso> findByRangeCreditos(int min, int max) {
        return List.of();
    }

    @Override
    public List<Curso> findByNome(String nombre) {
        return List.of();
    }

    @Override
    public void create(Curso curso) {

    }

    @Override
    public Curso find(String id) {
        return null;
    }

    @Override
    public List<Curso> findAll() {

        return List.of();
    }

    @Override
    public void update(Curso curso) {

    }

    @Override
    public void delete(String id) {

    }
}
