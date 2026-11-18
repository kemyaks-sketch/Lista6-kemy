package Servico;

import java.util.ArrayList;

public abstract class AbsGenericServ<T> {
    public abstract T adicionar(T obj);
    public abstract ArrayList<T> listar();
    public abstract T buscar(int codigo);
    public abstract T editar(T obj);
    public abstract T excluir(int codigo);
}
