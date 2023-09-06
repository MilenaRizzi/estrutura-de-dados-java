package com.milena.estruturadados.vetor.exercicios;

import com.milena.estruturadados.vetor.Lista;

public class Exer04 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");

        System.out.println(lista);

        System.out.println(lista.obtem(1));
    }
}
