
package Classes;

import java.util.ArrayList;

public class Curso {
    private int cod;
    private int alunos = 0;
    private String nome;
    private ArrayList<Integer> dias;
    private Professor professor;
    private int alocado = 0;
    
    //construtores
    public Curso(){
        this.cod = 0;
        this.nome = "Nome indefindo";
    }
    public Curso(int cod, String nome){
        this.cod = cod;
        this.nome = nome;
    }
    
    //getters and setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }
    public String getCpfProfessor(){
        return professor.getCpf();
    }
    public int getNumeroAlunos(){
        return alunos;
    }
    public ArrayList<Integer> getDias(){
        return this.dias;
    }
    public void setNumeroAlunos(int i){
        this.alunos += i;
        
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNomeECod(String nome, int cod){
        this.nome = nome;
        this.cod = cod;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    
    public void imprimirDados() {
    System.out.println("Curso: " + getNome());
    System.out.println("Codigo: " + getCod());
    System.out.println("Professor: " + professor.getNome());

    for (int i = 0; i < dias.size(); i++) {
        System.out.print(retornaDiaDaSemana(dias.get(i) + 1) + " | ");
    }
    System.out.println();
}
    
    //Funçoes ------------------------------------------------
    public String retornaDiaDaSemana(int dia)
    {
      switch (dia)
      {
      case 1:
        return "Segunda-Feira";
      case 2:
        return "Terça-Feira";
      case 3:
        return "Quarta-Feira";
      case 4:
        return "Quinta-Feira";
      case 5:
        return "Sexta-Feira";
      default:
        return "indefinido";
      }
    }
    
    public void adicionaCursoProfessor(Professor professor, ArrayList<Professor> professores) {
        this.setProfessor(professor);
        professor.setCodCurso(this.getCod());
    }
    
    public void imprimirNomeECod(){
        System.out.println("Nome" + nome + "| Cod: " + cod);
    }
    public int verificaAlocacao(){
        return this.alocado;
    }
    public boolean disponibilidade(ArrayList<Curso> cursos) {
        ArrayList<Integer> diasC = new ArrayList<>();
        for (int i = 0; i < cursos.size(); i++) {
            ArrayList<Integer> diass = cursos.get(i).getDias();
            for (int j = 0; j < diass.size(); j++) {
                diasC.add(diass.get(j));
            }
        }
        for (int i = 0; i < this.verificaAlocacao(); i++) {
            for (int j = 0; j < diasC.size(); j++) {
                if (this.dias.get(i) == diasC.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
