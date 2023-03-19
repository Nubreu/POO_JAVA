
package Classes;

import java.util.*;
import javax.swing.*;
import Classes.*;

public class Alunos {
    private static Alunos instancia = null;
    private ArrayList<Aluno> alunos;

    private Alunos() {
        alunos = new ArrayList<Aluno>();
    }

    public static Alunos getInstancia() {
        if (instancia == null) {
            instancia = new Alunos();
        }
        return instancia;
    }

    public void adiciona(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    
    

   public void exibeNaTela(){
    StringBuilder mensagem = new StringBuilder();
    mensagem.append("O tamanho do vetor é: ").append(alunos.size()).append("\n\n");
    
    for (Aluno aluno : alunos) {
        mensagem.append("Nome: ").append(aluno.getNome()).append("\n");
        mensagem.append("Contato: ").append(aluno.getContato()).append("\n");
        mensagem.append("CPF: ").append(aluno.getCpf()).append("\n\n");
    }
    
    JOptionPane.showMessageDialog(null, mensagem.toString());
    }
   
}

