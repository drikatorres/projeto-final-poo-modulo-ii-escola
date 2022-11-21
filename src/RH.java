import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RH {

    static List<Professor> professoresContratados = new ArrayList<>();

    public void contratarProfessor (Disciplinas disciplinas, Double salario, Professor professor) {
        if (Objects.nonNull(professor)) {
            professor.setDisciplinas(disciplinas);
            professor.setSalario(salario);
            professoresContratados.add(professor);
            System.out.println("Professor, " + professor.getNome() + ", contratado com sucesso");
            System.out.println(" ");
        } else {
            System.out.println("Não foi possível contratar o professor. Por favor, verificar se todos os dados foram fornecidos.");
            System.out.println(" ");
        }
    }

    public void darAumentoProfessor (Professor professor, Double valorAumento) {
        Double novoSalario = professor.getSalario() + valorAumento;
        professor.setSalario(novoSalario);
        System.out.println("Aumento de R$" + valorAumento + "para o professor" + professor.getNome() +" concedido com sucesso.");
        System.out.println("O valor do novo sário é de R$" + professor.getSalario());
        System.out.println(" ");
    }

    static List<Tutor> tutoresContratados = new ArrayList<>();

    public void contrataTutor ( Tutor tutor, Double salario) {
        if (Objects.nonNull(tutor)) {
            tutoresContratados.add(tutor);
            tutor.setSalario(salario);
            System.out.println("Tutor, " + tutor.getNome() + " contratado com sucesso");
            System.out.println(" ");
        } else {
            System.out.println("Não foi possível contratar o tutor. Por favor, verificar se todos os dados foram fornecidos.");
            System.out.println(" ");
        }
    }

}
