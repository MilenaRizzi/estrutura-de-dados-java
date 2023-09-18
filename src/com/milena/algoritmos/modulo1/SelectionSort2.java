package com.milena.algoritmos.modulo1;

public class SelectionSort2 {
    public static void main(String[] args) {
        int[] array = {25, 15, 30, 10, 50};
        selectionSort(array);
        System.out.println("Array ordenado:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Encontra o índice do menor elemento no subarray não ordenado
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Troca o elemento mínimo encontrado com o primeiro elemento do subarray não ordenado
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
