package com.example.prj_instituto.services.impl;

import com.example.prj_instituto.model.entities.Curso;
import com.example.prj_instituto.services.CursoService;

import java.util.List;

public class CursoServiceImpl implements CursoService {
    @Override
    public void grabar(Curso curso) {

    }

    @Override
    public Curso buscar(String id) {
        return null;
    }

    @Override
    public List<Curso> listar() {
        return List.of();
    }

    @Override
    public void actualizar(Curso curso) {

    }

    @Override
    public void borrar(String id) {

    }

    @Override
    public List<Curso> filterByCreditos(int min, int max) {
        return List.of();
    }
}
