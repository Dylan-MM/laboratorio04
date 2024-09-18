package com.example.prj_instituto.model.daos;
import com.example.prj_instituto.model.entities.Curso;
import java.util.List;

public interface CursoDao extends EntidadDao <Curso,String> {

    public List<Curso> findByRangeCreditos (int min, int max);
    public List<Curso> findByNome(String nombre);

}
