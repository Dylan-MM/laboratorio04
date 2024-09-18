package com.example.prj_instituto.model.daos.impl;

import com.example.prj_instituto.model.daos.AdministradorDao;
import com.example.prj_instituto.model.daos.CursoDao;
import com.example.prj_instituto.util.Tipo;

public class DaoFactory {

    public static AdministradorDao getAdministradorDao(Tipo tipo){
        switch (tipo){
            case MEM:
                //return new AdministradorDaoMemory();
            case PST:
                //return new AdministradorDaoPreparedStatement();
            case CST:
                return new AdministradorDaoCallableStatement();
            default:
                return null;
        }
    }

    public static CursoDao getCursoDao(Tipo tipo){
        switch (tipo){
            case MEM:
               // return new CursoDaoMemory();
            case PST:
                //return new CursoDaoPreparedStatement();
            case CST:
                return new CursoDaoCallableStateMent();
            default:
                return null;
        }
    }
}
