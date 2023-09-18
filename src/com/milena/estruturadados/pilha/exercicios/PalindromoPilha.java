package com.milena.estruturadados.pilha.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class PalindromoPilha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        scan.close();
        imprimeResultado(palavra);
    }

    public static void imprimeResultado(String palavra){
        System.out.println(palavra + " é palindromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();
        for(int i = 0; i < palavra.length(); i++){
            pilha.push(palavra.charAt(i));
        }
        String palavraInversa = "";

        while (!pilha.isEmpty()) {
            palavraInversa += pilha.pop();
        }

        if (palavra.equalsIgnoreCase(palavraInversa)){
            return true;
        }
        return false;
    }
}
