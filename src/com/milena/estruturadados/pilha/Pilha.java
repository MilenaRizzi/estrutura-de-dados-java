package com.milena.estruturadados.pilha;

import com.milena.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento){
        //o método adiciona da classe EstruturaEstatica adiciona um elemento no final
       super.adiciona(elemento);
    }

    public T topo() {
        if(this.estaVazia()) {
            return null;
        }
        return (T) this.elementos[tamanho - 1];
    }

    public T desempilha() {
        if(this.estaVazia()){
            return null;
        }
        /*T elemento = (T) this.elementos[tamanho - 1];
        tamanho--;

        return elemento;*/

        return (T) this.elementos[--tamanho];
    }
}
