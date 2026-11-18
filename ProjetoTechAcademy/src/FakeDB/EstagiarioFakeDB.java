package FakeDB;

import Dominio.Estagiario;
import java.util.ArrayList;

public class EstagiarioFakeDB extends AbsGenericFakeDB<Estagiario> {

    @Override
    protected void autoPreencher() {
        this.dados = new ArrayList<>();
        this.dados.add(new Estagiario(1, "Fernanda Rocha", "777.777.777-77", "fer@email.com", "6798888-1111", "Av. Afonso Pena, 100", 1200.00, 20, "Suporte Técnico"));
        this.dados.add(new Estagiario(2, "Gabriel Dias", "888.888.888-88", "gab@email.com", "6798888-2222", "Rua Ceará, 200", 1500.00, 30, "Desenvolvimento Java"));
        this.dados.add(new Estagiario(3, "Juliana Martins", "999.999.999-99", "ju@email.com", "6798888-3333", "Rua Bahia, 300", 1350.00, 25, "Banco de Dados"));
    }

    public EstagiarioFakeDB() {
        this.autoPreencher();
    }
}
