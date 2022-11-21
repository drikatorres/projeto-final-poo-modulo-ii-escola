import Modelo.Endereco;
import Modelo.Pessoa;

public class Aluno extends Pessoa {
    private int matricula;
    private Double nota;
    private PaiOuResponsavel paiOuResponsavel;
    private boolean aprovado;
    private boolean formado;

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public boolean isFormado() {
        return formado;
    }


    public void setFormado(boolean formado) {
        this.formado = formado;
    }

    public Aluno(String nome, int idade, String rg, String cpf, Endereco endereco,PaiOuResponsavel paiOuResponsavel) {
        super(nome, idade, rg, cpf, endereco);
        this.paiOuResponsavel = paiOuResponsavel;
    }

    public Aluno(PaiOuResponsavel paiOuResponsavel) {
        this.paiOuResponsavel = paiOuResponsavel;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public PaiOuResponsavel getPaiOuResponsavel() {
        return paiOuResponsavel;
    }

    public void setPaiOuResponsavel(PaiOuResponsavel paiOuResponsavel) {
        this.paiOuResponsavel = paiOuResponsavel;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nAluno: " +
                "\nMatrícula: " + matricula +
                "\nNota:" + nota +
                "\nPai ou responsável:" + paiOuResponsavel.getNome() +
                "\nAprovado:" + aprovado +
                "\nFormado:" + formado;
    }
}
