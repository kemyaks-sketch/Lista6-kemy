package Ferramentas;

import Dominio.Estagiario;
import Servico.EstagiarioServ;

public class EstagiarioTest {
    public static void executar() {
        System.out.println("\n=== TESTE CRUD ESTAGIÁRIO ===");
        EstagiarioServ serv = new EstagiarioServ();

        System.out.println("--- 1. LISTAR INICIAL ---");
        for (Estagiario e : serv.listar()) {
            e.exibir();
        }

        System.out.println("\n--- 2. ADICIONAR ---");
        Estagiario novo = new Estagiario(0, "Camila Teste", "321.321.321-32", "cam@email.com", "6798888-0000", "Rua Nova, 50", 1400.00, 20, "Qualidade de Software");
        serv.adicionar(novo);
        serv.buscar(novo.getCodigo()).exibir();

        System.out.println("\n--- 3. EDITAR ---");
        novo.setValorBolsa(1600.00);
        serv.editar(novo);
        serv.buscar(novo.getCodigo()).exibir();

        System.out.println("\n--- 4. EXCLUIR ---");
        serv.excluir(novo.getCodigo());
        System.out.println("Total após exclusão: " + serv.listar().size());
    }
}
