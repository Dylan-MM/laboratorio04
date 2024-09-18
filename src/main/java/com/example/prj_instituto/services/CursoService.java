package com.example.prj_instituto.services;

import com.example.prj_instituto.model.entities.Curso;

import java.util.List;

public interface CursoService {

    public void grabar(Curso curso);
    public Curso buscar(String id);
    public List<Curso> listar();
    public void actualizar(Curso curso);
    public void borrar(String id);
    public List<Curso> filterByCreditos(int min, int max);
}
