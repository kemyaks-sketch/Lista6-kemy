package Ferramentas;

import Dominio.Visitante;
import Servico.VisitanteServ;

public class VisitanteTest {
    public static void executar() {
        System.out.println("\n=== TESTE CRUD VISITANTE ===");
        VisitanteServ serv = new VisitanteServ();

        System.out.println("--- 1. LISTAR INICIAL ---");
        for (Visitante v : serv.listar()) {
            v.exibir();
        }

        System.out.println("\n--- 2. ADICIONAR ---");
        Visitante novo = new Visitante(0, "Roberto Teste", "123.123.123-12", "rob@email.com", "6799999-0000", "Rua Teste, 1", "Palestra", 200, "Auditório");
        serv.adicionar(novo);
        serv.buscar(novo.getCodigo()).exibir();

        System.out.println("\n--- 3. EDITAR ---");
        novo.setSetorVisita("Laboratório 2");
        serv.editar(novo);
        serv.buscar(novo.getCodigo()).exibir();

        System.out.println("\n--- 4. EXCLUIR ---");
        serv.excluir(novo.getCodigo());
        System.out.println("Total após exclusão: " + serv.listar().size());
    }
}
