package com.milena.estruturadados.fila;

import com.milena.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        //o método adiciona da classe EstruturaEstatica adiciona um elemento no final
        super.adiciona(elemento);
    }

    //primeiro a entrar, primeiro a sair
    //primeiro a entrar indice 0 - primeiro a sair indice 0
    public T desenfileira() {
        if(this.estaVazia()){
            return null;
        }
        /*Dentro da classe Estrutura Estática, eu já tenho um método remove que  reorganiza os elementos dentro do for
        - não precisava criar o for, bastava fazer a reutilização de código com o método remove.

        fina int POS = 0; //cria uma constante para guardar a posição
        T elemento = this.elementos[POS];
        return elemento*/

        T elemento = (T) elementos[0];
        for (int i=0; i<tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
        return (T) elemento;
    }


    public T espia() {
        if(this.estaVazia()){
            return null;
        }
        return (T) this.elementos[0];
    }
}
