
package Classes;

import java.util.*;
import javax.swing.*;
import Classes.*;

public class Colecao {
    private static Colecao instancia = null;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Curso> cursos;
    
    

    private Colecao() {
        alunos = new ArrayList<Aluno>();
        professores = new ArrayList<Professor>();
        cursos = new ArrayList<Curso>();
    }

    public static Colecao getInstancia() {
        if (instancia == null) {
            instancia = new Colecao();
        }
        return instancia;
    }
          
    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void addProfessor(Professor professor) {
        professores.add(professor);
    }
    
    public void addCurso(Curso curso){
        cursos.add(curso);
    }
    
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    
    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    
    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    public void excluirAluno(String cpf){
      for (Aluno aluno : alunos) {
        if (aluno.getCpf().equals(cpf)) {
            JOptionPane.showMessageDialog(null, "O aluno " + aluno.getNome() + " com CPF " + aluno.getCpf() + "Foi ecluido da nossa lista");
            alunos.remove(aluno);
        }
      }
    }

    public void buscaAluno(String cpf){
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

