import Modelo.Endereco;
import Modelo.Pessoa;

public class Professor extends Pessoa implements FuncoesFuncionario, Funcionario {
    private Double salario;
    private Disciplinas disciplinas;

    public Professor(String nome, int idade, String rg, String cpf, Endereco endereco) {
        super(nome, idade, rg, cpf, endereco);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Disciplinas getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplinas disciplinas) {
        this.disciplinas = disciplinas;
    }


    @Override
    public void darAdvertencia(Aluno aluno) {
        System.out.println("Aluno(a) " + aluno.getNome() + " recebeu uma advertência.");
        System.out.println(" ");
    }

    @Override
    public void lancarNota(Aluno aluno, Double nota) {
        aluno.setNota(nota);
    }

    @Override
    public void aprovarAluno(Aluno aluno) {
        if (aluno.getNota() >=7 ) {
            aluno.setAprovado(true);
            System.out.println("O(a) aluno(a) " + aluno.getNome() + " foi aprovado");
            System.out.println(" ");
        } else {
            aluno.setAprovado(false);
            System.out.println("O(a) aluno(a) " + aluno.getNome() + " não foi aprovado(a) e terá que ir para a recuperação");
            System.out.println(" ");
        }
    }

    @Override
    public void consultarSalario(Funcionario funcionario) {
        System.out.println("O salário do(a) funcionário(a) " + this.getNome() +" é R$" + this.getSalario());
    }

    @Override
    public void pedirDesligamento(Funcionario funcionario) {
        System.out.println("Eu, professor(a), " + this.getNome() + " estou pedindo desligamento da escola.");
        RH.professoresContratados.remove(funcionario);
        this.setSalario(0.0);
    }


}
