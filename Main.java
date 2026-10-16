import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa matricula = new Pessoa("Pedro", "65456848.8");
        matricula.exibirDados();
        Aluno pedrinho = new Aluno("pedrinho", "123.1223", "787887");
        pedrinho.exibirDados();
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 1; i++) {
            System.out.println("Digite NESSA ORDEM, nome, cpf, matricula do aluninho.");

            Aluno aluninho = new Aluno(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());

            listaPessoas.add(aluninho);

            System.out.println("Digite NESSA ORDEM, nome, cpf, disciplina do professorinho.");

            Professor professorinho = new Professor(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            listaPessoas.add(professorinho);
            
        }

        for (int i = 0; i < listaPessoas.size(); i++) {
            Pessoa p = listaPessoas.get(i);

            System.out.println("-------A lista de pessoas cadastradas é:");
            System.out.println("");
            p.exibirDados();
        }
    }

}
