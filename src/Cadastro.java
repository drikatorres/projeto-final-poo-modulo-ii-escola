
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cadastro{

    static List<Aluno> alunosMatriculados = new ArrayList<>();

    public void matricularAlunos (Aluno aluno, int matricula) {
        if (Objects.nonNull(aluno) && Objects.nonNull((aluno.getPaiOuResponsavel()))) {
            aluno.setMatricula(matricula);
            alunosMatriculados.add(aluno);
            System.out.println("Matricula do aluno " + aluno.getNome() + " foi realizada com sucesso.");
        } else {
            System.out.println("Não foi possível matricular o aluno. Por favor, verificar se foi atribuido um pai ou responsável para o aluno");
        }
    }

    static List<PaiOuResponsavel> paiOuResponsavelCadastrado = new ArrayList<>();

    public void cadastrarPaiOuResponsavel (PaiOuResponsavel paiOuResponsavel) {
        if (Objects.nonNull(paiOuResponsavel)) {
            paiOuResponsavelCadastrado.add(paiOuResponsavel);
            System.out.println("Cadastri do " + paiOuResponsavel.getNome() + " foi realizada com sucesso.");
        } else {
            System.out.println("Não foi possível cadastrar o pai ou responsável. Por favor, verificar se todos os dados foram fornecidos.");
        }
    }
}
