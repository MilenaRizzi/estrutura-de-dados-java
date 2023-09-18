package com.milena.estruturadados.pilha.exercicios;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entradaUsuario = scanner.nextLine();
        System.out.println(ePalindromo(entradaUsuario));
    }

    public static boolean ePalindromo(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }
}
