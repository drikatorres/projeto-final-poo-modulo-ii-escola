public interface Funcionario {
    public Double salario = null;
    public Double consultarSalario(Funcionario funcionario);
    public void pedirDesligamento(Funcionario funcionario);
    public void darAdvertencia(Aluno aluno);
    public void lancarNota(Aluno aluno, Double nota);

    public void aprovarAluno(Aluno aluno);

}
