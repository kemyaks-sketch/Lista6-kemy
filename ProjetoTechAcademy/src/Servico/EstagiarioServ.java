package Servico;

import DAO.EstagiarioDAO;
import Dominio.Estagiario;
import java.util.ArrayList;

public class EstagiarioServ extends AbsGenericServ<Estagiario> {

    private EstagiarioDAO dao;

    public EstagiarioServ() {
        this.dao = new EstagiarioDAO();
    }

    @Override
    public Estagiario adicionar(Estagiario obj) {
        return this.dao.create(obj);
    }

    @Override
    public ArrayList<Estagiario> listar() {
        return this.dao.readAll();
    }

    @Override
    public Estagiario buscar(int codigo) {
        return this.dao.readOne(codigo);
    }

    @Override
    public Estagiario editar(Estagiario obj) {
        return this.dao.update(obj);
    }

    @Override
    public Estagiario excluir(int codigo) {
        return this.dao.deletePorID(codigo);
    }
}
