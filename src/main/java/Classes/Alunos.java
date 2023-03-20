
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
    
    public void excluir(String cpf){
      for (Aluno aluno : alunos) {
        if (aluno.getCpf().equals(cpf)) {
            JOptionPane.showMessageDialog(null, "O aluno " + aluno.getNome() + " com CPF " + aluno.getCpf() + "Foi ecluido da nossa lista");
            alunos.remove(aluno);
        }
      }
    }

    public void busca(String cpf){
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpf)) {
                JOptionPane.showMessageDialog(null, "Nome: " + aluno.getNome() + "\nCPF: " + aluno.getCpf() + "\nContato: " + aluno.getContato());           
                return; // encerra a busca após encontrar o aluno
            }
        }
        JOptionPane.showMessageDialog(null, "Aluno não encontrado");
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

