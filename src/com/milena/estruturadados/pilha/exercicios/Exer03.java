package com.milena.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Exer03 {
    public static void main(String[] args) {
        Stack<Livro> pilhaLivros = new Stack<Livro>();
        Livro livro1 = new Livro("Estrutura de Dados e Algoritmos com Js", "100245012365", "2019", "Loiane");
        Livro livro2 = new Livro("Clean Code: A Handbook of Agile Software Craftsmanship", "978-0132350884", "2008", "Robert C. Martin");
        Livro livro3 = new Livro("The Pragmatic Programmer: Your Journey to Mastery", "978-0201616224", "1999", "Andrew Hunt e David Thomas");
        Livro livro4 = new Livro("Introduction to the Theory of Computation", "978-1133187790", "2005", "Michael Sipser");
        Livro livro5 = new Livro("Design Patterns: Elements of Reusable Object-Oriented Software", "978-0201633610", "1994", " Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides");
        Livro livro6 = new Livro("Algorithms", "978-0321573513", "2011", "Robert Sedgewick e Kevin Wayne");

        pilhaLivros.push(livro1);
        pilhaLivros.push(livro2);
        pilhaLivros.push(livro3);
        pilhaLivros.push(livro4);
        pilhaLivros.push(livro5);
        pilhaLivros.push(livro6);

        System.out.println(pilhaLivros);

        pilhaLivros.pop();
        System.out.println(pilhaLivros);

        System.out.println(pilhaLivros.size());
        System.out.println(pilhaLivros.isEmpty());
        System.out.println(pilhaLivros.peek());
    }
}
