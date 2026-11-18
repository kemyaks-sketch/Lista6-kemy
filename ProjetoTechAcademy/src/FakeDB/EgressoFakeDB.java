package FakeDB;

import Dominio.Egresso;
import java.util.ArrayList;

public class EgressoFakeDB extends AbsGenericFakeDB<Egresso> {

    @Override
    protected void autoPreencher() {
        this.dados = new ArrayList<>();
        this.dados.add(new Egresso(1, "Carlos Silva", "111.111.111-11", 2022, "Ciência da Computação", "Desenvolvimento Web"));
        this.dados.add(new Egresso(2, "Mariana Souza", "222.222.222-22", 2023, "TADS", "Ciência de Dados"));
        this.dados.add(new Egresso(3, "João Pereira", "333.333.333-33", 2024, "Engenharia de Software", "Segurança da Informação"));
    }

    public EgressoFakeDB() {
        this.autoPreencher();
    }
}
