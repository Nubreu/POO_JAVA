
package Classes;

import java.util.Scanner;

public class Professor extends Pessoa{
    Scanner scanner = new Scanner(System.in);
    public int codCurso;
    public Professor() {}

public Professor(String nome, String cpf, String contato) {
    super(nome, cpf, contato);
}

public void setCodCurso(int codCurso) {
    this.codCurso = codCurso;
}

public int getCodCurso() {
    return codCurso;
}

public void imprimirDados() {
    super.imprimirDados();
}

public void novosDados(String nome, String cpf, String contato) {
    super.setNome(nome);
    super.setCpf(cpf);
    super.setContato(contato);
}

public void preencherDadosProfessor() {
    System.out.println("[CADASTRO DE PROFESSORES]");
    System.out.print("Nome: ");
    String nome = scanner.nextLine();
    System.out.print("CPF: ");
    String cpf = scanner.nextLine();
    System.out.print("Contato: ");
    String contato = scanner.nextLine();
    
    super.setNome(nome);
    super.setCpf(cpf);
    super.setContato(contato);
    }
}
