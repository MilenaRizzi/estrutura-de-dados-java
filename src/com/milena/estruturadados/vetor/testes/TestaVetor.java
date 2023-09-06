package com.milena.estruturadados.vetor.testes;

import com.milena.estruturadados.vetor.Vetor;

public class TestaVetor {
    public static void main(String[] args) {
        //aula 2 criar o vetor com a capacidade
        Vetor vetor = new Vetor(2);

        //aula 3 adicionar elementos no vetor
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        //aula 4 mostrar o tamanho do vetor e chamar toString
        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());

        //aula 5 buscar um elemento
        System.out.println(vetor.busca(3));

        //aula 6, buscar um elemento que não existe
        System.out.println(vetor.busca("elemento 4"));

    }
}

