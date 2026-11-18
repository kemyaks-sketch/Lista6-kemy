package Servico;

import DAO.EgressoDAO;
import Dominio.Egresso;
import java.util.ArrayList;

public class EgressoServ extends AbsGenericServ<Egresso> {

    private EgressoDAO dao;

    public EgressoServ() {
        this.dao = new EgressoDAO();
    }

    @Override
    public Egresso adicionar(Egresso obj) {
        return this.dao.create(obj);
    }

    @Override
    public ArrayList<Egresso> listar() {
        return this.dao.readAll();
    }

    @Override
    public Egresso buscar(int codigo) {
        return this.dao.readOne(codigo);
    }

    @Override
    public Egresso editar(Egresso obj) {
        return this.dao.update(obj);
    }

    @Override
    public Egresso excluir(int codigo) {
        return this.dao.deletePorID(codigo);
    }
}
