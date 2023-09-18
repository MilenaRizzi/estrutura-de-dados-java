package com.milena.estruturadados.pilha.exercicios;

 public class Livro {
    String nome = new String();
    String codigoISBN = new String();
    String ano = new String();
    String autor = new String();

    public Livro() {
    }

    public Livro(String nome, String codigoISBN, String ano, String autor) {
        this.nome = nome;
        this.codigoISBN = codigoISBN;
        this.ano = ano;
        this.autor = autor;
    }

     @Override
     public String toString() {
         return "Livros{" +
                 "nome='" + nome + '\'' +
                 ", codigoISBN='" + codigoISBN + '\'' +
                 ", ano='" + ano + '\'' +
                 ", autor='" + autor + '\'' +
                 '}';
     }
 }
