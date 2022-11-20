import Modelo.Endereco;
import Modelo.Pessoa;

import java.util.Date;

public class Tutor extends Pessoa implements FuncoesFuncionario, Funcionario {
    Double salario;
    Date dataHoraAtual = new Date();

    public Tutor(String nome, int idade, String rg, String cpf, Endereco endereco) {
        super(nome, idade, rg, cpf, endereco);
    }

    public Tutor() {
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void darAdvertencia(Aluno aluno) {

    }

    @Override
    public void lancarNota(Aluno aluno, Double nota) {

    }

    @Override
    public void aprovarAluno(Aluno aluno) {

    }

    public void ajudarAluno(Aluno aluno) {
        System.out.println("Marcando monitoria com o aluno " + aluno.getNome() + " para " + dataHoraAtual);
    }

    @Override
    public Double consultarSalario(Funcionario funcionario) {
        return this.salario;
    }

    @Override
    public void pedirDesligamento(Funcionario funcionario) {
        System.out.println("Eu, tutor, " + this.getNome() + "estou pedindo desligamento da escola.");
        RH.tutoresContratados.remove(funcionario);
    }
}
