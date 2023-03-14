/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

import java.util.ArrayList;
import java.util.Scanner;

public class Sala {
    private int identificador;
    private int alunos;
    private int capacidade;
    private int[] disponivel = {0, 0, 0, 0, 0};
    private ArrayList<String> semana = new ArrayList<String>();
    private final int SEMANA = 5;

    public Sala() {
        this.identificador = -1;
        this.capacidade = -1;
        this.alunos = 0;
        for (int i = 0; i < SEMANA; i++) {
            semana.add("Disponivel");
        }
    }

    public Sala(int identificador, int capacidade) {
        this.identificador = identificador;
        this.capacidade = capacidade;
        this.alunos = 0;
        for (int i = 0; i < SEMANA; i++) {
            semana.add("Disponivel");
        }
    }

    public void relatorio() {
        System.out.println("[RELATORIO SALA " + identificador + " ]");
        System.out.println("Capacidade: " + capacidade + " | Alunos: " + alunos + "\n\n");
        for (int i = 0; i < SEMANA; i++) {
            if (this.disponivel[i] == 0) {
                System.out.println(diaDaSemana(i + 1) + ": " + semana.get(i));
            } else {
                System.out.println(diaDaSemana(i + 1) + ": " + disponivel[i]);
            }
        }
    }

    public void cadastrarSala(ArrayList<Sala> salas) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o código da sala:");
        this.identificador = scanner.nextInt();

        System.out.print("Escreva a capacidade da sala:");
        this.capacidade = scanner.nextInt();

        Sala sala = new Sala(identificador, capacidade);

        salas.add(sala);
    }

    public void subAlunos() {
        this.alunos--;
    }

    public void sumAlunos() {
        this.alunos++;
    }

    public void setDisponibilidade(int dia, String disponibilidade) {
        this.semana.set(dia, disponibilidade);
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    public int getAlunos() {
        return this.alunos;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public int qtdDisponivel() {
        int qtd = 0;
        for (int i = 0; i < 5; i++) {
            if (this.disponivel[i] == 0) {
                qtd++;
            }
        }
        return qtd;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    /* */ }
