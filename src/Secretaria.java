import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Secretaria implements FuncoesFuncionario {
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

    public void cadastrarMatriculaAluno(Aluno aluno, int matricula) {
        aluno.setMatricula(matricula);
    }


    @Override
    public void darAdvertencia(Aluno aluno) {
        System.out.println("O aluno " + aluno.getNome() + " está recebendo advertência!");
    }

    public void ligarPai(Aluno aluno, PaiOuResponsavel paiOuResponsavel) {
        System.out.println("Ligando para o pai ou responsável do aluno " + aluno.getNome());
        System.out.println("Estamos ligando para " + aluno.getPaiOuResponsavel());
        System.out.println("Ligando para o número " + paiOuResponsavel.getNumeroTelefone());
    }

    public void emitirDiploma (Aluno aluno) {
        if (aluno.isAprovado() ==  true ) {
            System.out.println("O diploma do aluno " + aluno.getNome() + " foi emitido e agora o mesmo encontra-se formado.");
            aluno.setFormado(true);
        } else {
            System.out.println("O aluno não foi aprovado, por isso não poderá se formar.");
        }

    }

    public Secretaria() {
    }

    Cadastro cadastro = new Cadastro();

}
