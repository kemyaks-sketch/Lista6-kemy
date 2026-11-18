package Dominio;

public class Estagiario extends AbsPrestador {
    private Double valorBolsa;
    private int cargaHorariaSemana;
    private String areaEstagio;

    public Double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(Double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    public int getCargaHorariaSemana() {
        return cargaHorariaSemana;
    }

    public void setCargaHorariaSemana(int cargaHorariaSemana) {
        this.cargaHorariaSemana = cargaHorariaSemana;
    }

    public String getAreaEstagio() {
        return areaEstagio;
    }

    public void setAreaEstagio(String areaEstagio) {
        this.areaEstagio = areaEstagio;
    }

    @Override
    public void exibir() {
        System.out.println("[ESTAGIÁRIO] Código: " + this.codigo);
        System.out.print("Nome: " + this.nome);
        System.out.print(" | CPF: " + this.cpf);
        System.out.print(" | E-mail: " + this.email);
        System.out.print(" | Telefone: " + this.telefone);
        System.out.println(" | Endereço: " + this.endereco);
        System.out.print("Área: " + this.areaEstagio);
        System.out.print(" | Carga Horária: " + this.cargaHorariaSemana + "h");
        System.out.println(" | Bolsa: R$ " + this.valorBolsa);
    }

    public Estagiario() {}

    public Estagiario(int codigo, String nome, String cpf, String email, String telefone, String endereco,
                      Double valorBolsa, int cargaHorariaSemana, String areaEstagio) {
        super(codigo, nome, cpf, email, telefone, endereco);
        this.valorBolsa = valorBolsa;
        this.cargaHorariaSemana = cargaHorariaSemana;
        this.areaEstagio = areaEstagio;
    }
}
