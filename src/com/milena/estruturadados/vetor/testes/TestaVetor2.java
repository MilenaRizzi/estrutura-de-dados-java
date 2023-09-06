package com.milena.estruturadados.vetor.testes;

import com.milena.estruturadados.vetor.Vetor;

public class TestaVetor2 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        //aula 06, adicionar um elemento em uma posição específica.
        vetor.adiciona(0, "A");

        System.out.println(vetor);

        vetor.adiciona(3, "D");

        System.out.println(vetor);
        //aula 09 - remover um elemento passando o índice
        vetor.remove(1);

        System.out.println(vetor);

        System.out.println("Remover o elemento A");

        //remover o elemento passando o elemento
        //usar o método busca juntamente com remove, busca vai retornar o indice para o remove
        int pos = vetor.busca("A");
        if (pos > -1) {
            vetor.remove(pos);
        } else {
            System.out.println("Elemento n�o existe no vetor");
        }

        System.out.println(vetor);
    }
}
