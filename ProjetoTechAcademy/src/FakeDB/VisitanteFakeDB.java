package FakeDB;

import Dominio.Visitante;
import java.util.ArrayList;

public class VisitanteFakeDB extends AbsGenericFakeDB<Visitante> {

    @Override
    protected void autoPreencher() {
        this.dados = new ArrayList<>();
        this.dados.add(new Visitante(1, "Ana Costa", "444.444.444-44", "ana@email.com", "6799999-1111", "Rua A, 10", "Reunião Coordenação", 101, "Bloco A"));
        this.dados.add(new Visitante(2, "Pedro Alves", "555.555.555-55", "pedro@email.com", "6799999-2222", "Rua B, 20", "Manutenção Rede", 102, "TI"));
        this.dados.add(new Visitante(3, "Lucas Lima", "666.666.666-66", "lucas@email.com", "6799999-3333", "Rua C, 30", "Entrega Documentos", 103, "Secretaria"));
    }

    public VisitanteFakeDB() {
        this.autoPreencher();
    }
}
