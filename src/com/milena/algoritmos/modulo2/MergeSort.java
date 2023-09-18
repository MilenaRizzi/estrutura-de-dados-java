package com.milena.algoritmos.modulo2;

public class MergeSort {

    public void mergeSort(int[] v, int left, int right) {

        if(left >= right)
            return;
        else {
            int middle = ((left + right) / 2);
            mergeSort(v, left, right);
            mergeSort(v, middle + 1, right);

            merge(v, left, middle, right);
        }
    }
    public void merge(int[] v, int left, int middle, int right){
        int[] helper = new int[v.length];
        for(int i = left; i <= right; i++){
            helper[i] = v[i];
        }

        int i = left;
        int j = middle + 1;
        int k = left;

        while(i <= middle && j <= right) {
            if(helper[i] <= helper[j]){
                v[k] = helper[i];
                i++;
            } else {
                v[k] = helper[j];
                j++;
            }
            k++;
        }

        while(i <= middle) {
            v[k++] = helper[i++];
        }

        while (j <= right){
            v[k++] = helper[j++];
        }
    }
}
