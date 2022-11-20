import Modelo.Endereco;

public class Escola {
    public static void main(String[] args) {


        // Endereço genérico para testes
        Endereco enderecoGenerico = new Endereco("Rua Genérica", 3, "700000000", "Generico", "MG");
        //Endereço genérico que dá erro
        Endereco enderecoGenerico2 = new Endereco("Rua Genérica", 3, "700000000", "Generico", "SP");

        //Instanciando classes
        //Professor
        Professor lucas = new Professor("Lucas", 33, "888.888", "369.456.025-98", enderecoGenerico);

        //Tutor
        Tutor henrique = new Tutor("Henrique", 21, "777.777", "888.888.555-55", enderecoGenerico);

        //Pai
        Endereco enderecoMiguel = new Endereco("Rua Laranja", 25, "70882233", "Laranja", "MG");
        PaiOuResponsavel miguel = new PaiOuResponsavel("Miguel Carlos", 45, "255.555", "888.888.888-88", enderecoMiguel,
                "Farmacêutico", "(11) 98888-8888");
        //Aluno
        Aluno joao = new Aluno("João Carlos", 10, "555.555", "058.974.532-22", enderecoMiguel, miguel);

        //Setores da escola
        //RH
        RH recursosHumanos = new RH();
        //Secretaria
        Secretaria secretaria = new Secretaria();

        //Contratações
        //Professor
        recursosHumanos.contratarProfessor(Disciplinas.MATEMATICA, 5000.00,lucas);
        recursosHumanos.darAumentoProfessor(lucas, 50.00);
        lucas.getSalario();

        //tutor
        recursosHumanos.contrataTutor(henrique, 3000.00);

        //Matricular
        //Alunos
        secretaria.cadastro.matricularAlunos(joao, 565);
        //Cadastrar pai
        secretaria.cadastro.cadastrarPaiOuResponsavel(miguel);





        //Desligamento Funcionário
        lucas.pedirDesligamento(lucas);

        //




        //Mostrar lista com matriculas e cadastros
        TodosCadastros todosCadastros = new TodosCadastros();
        //Lista de professores contratados
        System.out.println("Professores contratados");
        todosCadastros.mostrarLista(RH.professoresContratados);
        //Lista de tutores contratados
        System.out.println("Tutores contratados");
        todosCadastros.mostrarLista(RH.tutoresContratados);
        //Lista de alunos matriculados
        System.out.println("Alunos matriculados");
        todosCadastros.mostrarLista(Cadastro.alunosMatriculados);
        //Lista de pais cadastrados
        System.out.println("Pais ou responsáveis contratados");
        todosCadastros.mostrarLista(Cadastro.paiOuResponsavelCadastrado);


    }
}