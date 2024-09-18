package com.example.prj_instituto.services.impl;

import com.example.prj_instituto.model.daos.AdministradorDao;
import com.example.prj_instituto.model.daos.impl.DaoFactory;
import com.example.prj_instituto.model.entities.Administrador;
import com.example.prj_instituto.services.AdministradorService;
import com.example.prj_instituto.util.Util;

public class AdministradorServiceImpl implements AdministradorService {
    private AdministradorDao dao;
    public AdministradorServiceImpl() {
        dao= DaoFactory.getAdministradorDao(Util.opc);
    }


    @Override
    public Administrador validar(String u, String p) {
        return dao.validar(u, p);
    }
}
