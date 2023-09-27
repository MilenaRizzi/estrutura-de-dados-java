package com.milena.estruturadados.fila.teste;

import com.milena.estruturadados.fila.Fila;

public class TesteFila {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(3);
        fila.enfileira(8);
        fila.enfileira(6);


        System.out.println("Fila está vazia? " + fila.estaVazia());
        System.out.println("Elementos fila " + fila);
        System.out.println("Tamanho fila " + fila.tamanho());
        System.out.println("Desenfileirando - primeiro elemento da fila é: " + fila.desenfileira());
        System.out.println("Elementos fila " + fila);
        System.out.println("Tamanho fila " + fila.tamanho());
        System.out.println("Espia o primeiro elemento " + fila.espia());
        System.out.println("Desenfileirando - primeiro elemento da fila agora é: " + fila.desenfileira());
        System.out.println("Elementos fila " + fila);
        System.out.println("Tamanho fila " + fila.tamanho());
    }
}
