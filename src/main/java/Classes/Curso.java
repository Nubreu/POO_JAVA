
package Classes;

import java.util.ArrayList;

public class Curso {
    private int cod;
    private int alunos = 0;
    private String nome;
    private ArrayList<Integer> dias;
    private Professor professor;
    private int alocado = 0;
    
    public Curso(){
        this.cod = 0;
        this.nome = "Nome indefindo";
    }
    public Curso(int cod, String nome){
        this.cod = cod;
        this.nome = nome;
    }
    
}
