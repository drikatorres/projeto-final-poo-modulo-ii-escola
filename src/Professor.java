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
        System.out.println("Aluno " + aluno.getNome() + " vá para a secretaria pois você está recebendo uma advertência.");
    }



    /*public void pedirDesligamento(Professor professor) {
        System.out.println("Eu, professor, " + professor.getNome() + "estou pedindo desligamento da escola.");
        RH.professoresContratados.remove(professor);
    } */


    @Override
    public void lancarNota(Aluno aluno, Double nota) {
        aluno.setNota(nota);
    }

    @Override
    public void aprovarAluno(Aluno aluno) {
        if (aluno.getNota() >=7 ) {
            aluno.setAprovado(true);
        } else {
            aluno.setAprovado(false);
            System.out.println("O aluno não foi aprovado e terá que ir para a recuperação");
        }
    }

    @Override
    public Double consultarSalario(Funcionario funcionario) {
        return this.salario;
    }

    @Override
    public void pedirDesligamento(Funcionario funcionario) {
        System.out.println("Eu, professor, " + this.getNome() + " estou pedindo desligamento da escola.");
        RH.professoresContratados.remove(funcionario);

    }


}
