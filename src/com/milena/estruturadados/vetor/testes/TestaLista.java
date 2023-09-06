package com.milena.estruturadados.vetor.testes;
import com.milena.estruturadados.vetor.Contato;
import com.milena.estruturadados.vetor.Lista;

public class TestaLista {
    public static void main(String[] args) {
        Lista<Contato> vetor = new Lista<Contato>(1);

        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");

        vetor.adiciona(c1);
        System.out.println(vetor);

    }
}
