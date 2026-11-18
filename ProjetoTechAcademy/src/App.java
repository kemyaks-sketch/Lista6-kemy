import Ferramentas.EgressoTest;
import Ferramentas.EstagiarioTest;
import Ferramentas.VisitanteTest;
import Visao.VisitanteMenu;

public class App {
    public static void main(String[] args) {
        EgressoTest.executar();
        System.out.println("=========================================");
        VisitanteTest.executar();
        System.out.println("=========================================");
        EstagiarioTest.executar();
        System.out.println("=========================================");

        VisitanteMenu menu = new VisitanteMenu();
        menu.exibirMenu();
    }
}
