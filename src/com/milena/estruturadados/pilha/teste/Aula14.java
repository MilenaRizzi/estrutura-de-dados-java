package com.milena.estruturadados.pilha.teste;

import com.milena.estruturadados.pilha.Pilha;
import org.w3c.dom.ls.LSOutput;

public class Aula14 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for(int i = 1; i <= 10; i++){
            pilha.empilha(i);
        }
        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
