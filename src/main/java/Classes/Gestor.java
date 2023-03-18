
package Classes;

import java.util.Scanner;


public class Gestor extends Pessoa{
    private String login;
    private String senha;
    boolean autorizado;
    
    public Gestor() {
    login = "123";
    senha = "123";
    autorizado = false;
}

public Gestor(String login, String senha) {
    this.login = login;
    this.senha = senha;
}

public boolean condicao() {
    return autorizado;
}

public void validacao() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\t[---- LOGIN ----]\nCaso seja aluno ou professor apenas digite \"Enter\"");
    System.out.print("\nLogin: ");
    String log = scanner.nextLine();
    System.out.print("Senha: ");
    String key = scanner.nextLine();
    if (log.equals(login) && key.equals(senha)) {
        autorizado = true;
    } else {
        autorizado = false;
    }
}
}
