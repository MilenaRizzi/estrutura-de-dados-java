package com.milena.algoritmos.modulo1;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {25, 15, 30, 10, 50};
        insertionSort(array);
        System.out.println("Array ordenado:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for(int atual = 0; atual < arr.length; atual++){
            int analise = atual;
            while(analise > 0 && arr[analise] < arr[analise -1]){
                int itemAtual = arr[analise];
                int itemAnterior = arr[analise -1];

                arr[analise] = itemAnterior;
                arr[analise - 1] = itemAtual;
                analise--;
            }
        }
    }
}
