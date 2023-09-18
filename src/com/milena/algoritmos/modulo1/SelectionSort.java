package com.milena.algoritmos.modulo1;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {25, 15, 30, 10, 50};
        selectionSort(array);
        System.out.println("Array ordenado:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr){
        for(int atual = 0; atual < arr.length; atual++){
            int menor = menorValor(arr, atual);
            int elementoAtual = arr[atual];
            int elementoMaisBarato = arr[menor];

            arr[atual] = elementoMaisBarato;
            arr[menor] = elementoAtual;
        }
    }

    public static int menorValor(int[] arr, int posicao){
        int maisBarato = posicao;
        for(int atual = posicao; atual < arr.length; atual++){
            if(arr[atual] < arr[maisBarato]) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }
}