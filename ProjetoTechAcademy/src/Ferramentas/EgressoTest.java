package Ferramentas;

import Dominio.Egresso;
import Servico.EgressoServ;

public class EgressoTest {
    public static void executar() {
        System.out.println("=== TESTE CRUD EGRESSO ===");
        EgressoServ serv = new EgressoServ();

        System.out.println("--- 1. LISTAR INICIAL ---");
        for (Egresso e : serv.listar()) {
            e.exibir();
        }

        System.out.println("\n--- 2. ADICIONAR ---");
        Egresso novo = new Egresso(0, "Marcos Teste", "000.000.000-00", 2025, "TADS", "Mobile");
        serv.adicionar(novo);
        serv.buscar(novo.getCodigo()).exibir();

        System.out.println("\n--- 3. EDITAR ---");
        novo.setAreaAtuacao("Cloud Computing");
        serv.editar(novo);
        serv.buscar(novo.getCodigo()).exibir();

        System.out.println("\n--- 4. EXCLUIR ---");
        serv.excluir(novo.getCodigo());
        System.out.println("Total após exclusão: " + serv.listar().size());
    }
}
