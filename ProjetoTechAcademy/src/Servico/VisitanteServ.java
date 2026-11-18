package Servico;

import DAO.VisitanteDAO;
import Dominio.Visitante;
import java.util.ArrayList;

public class VisitanteServ extends AbsGenericServ<Visitante> {

    private VisitanteDAO dao;

    public VisitanteServ() {
        this.dao = new VisitanteDAO();
    }

    @Override
    public Visitante adicionar(Visitante obj) {
        return this.dao.create(obj);
    }

    @Override
    public ArrayList<Visitante> listar() {
        return this.dao.readAll();
    }

    @Override
    public Visitante buscar(int codigo) {
        return this.dao.readOne(codigo);
    }

    @Override
    public Visitante editar(Visitante obj) {
        return this.dao.update(obj);
    }

    @Override
    public Visitante excluir(int codigo) {
        return this.dao.deletePorID(codigo);
    }
}
