public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String cpf, String disciplina) {
        super(nome, cpf);
        this.disciplina = disciplina;

    }

    @Override
    public void exibirDados() {
        System.out.println("Pessoa:" + this.getNome() +" CPF:" + this.getCpf() +" disciplina: " + this.disciplina+ ".");
    }
}
