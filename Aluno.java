public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;

    }

    @Override
    public void exibirDados() {
        System.out.println("Pessoa:" + this.getNome() +" CPF:" + this.getCpf() +" matricula: " + this.matricula+ ".");
    }
}
