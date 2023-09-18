package com.milena.estruturadados.pilha.exercicios;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Exer02 {
    public static void main(String[] args) {
        Stack<Integer> pares = new Stack<>();
        Stack<Integer> impares = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite um número");
            int nums = scanner.nextInt();
            if (nums == 0) {
                Integer desempilhado = pares.pop();
                if (desempilhado == null) {
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Desempilhando da pilha par: " + desempilhado);
                }

                desempilhado = impares.pop();
                if (desempilhado == null) {
                    System.out.println("Pilha impar vazia");
                } else {
                    System.out.println("Desempilhando da pilha impar: " + desempilhado);
                }
            } else if (nums % 2 == 0) {
                System.out.println("Empilhando na pilha par");
                pares.push(nums);
            } else {
                System.out.println("Empilhando na pilha impar");
                impares.push(nums);
            }
        }
        System.out.println("-----------------");
        while (!pares.isEmpty()) {
            System.out.println("Desempilhando elementos pilha par " + pares.pop());
        }

        while (!impares.isEmpty()) {
            System.out.println("Desempilhando elementos pilha impar " + impares.pop());

        }
        System.out.println("Todos os elementos foram desempilhados: pilha par:" + pares + " pilha impar: " + impares);


    }
}
