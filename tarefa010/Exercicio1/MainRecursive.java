package com.studies;

import java.util.Random;

public class MainRecursive {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Random rand = new Random();

        int ceiling = 100;

        int[] actual = new int[100];

        for (int i = 0; i < ceiling; i++) {
            actual[i] = rand.nextInt(ceiling);
        }

        System.out.println("O valor inical do array eh:");
        printArray(actual, actual.length);

        mergeSort(actual, actual.length);

        System.out.println("\nO valor após chamar o mergeSort recursivo eh:");

        printArray(actual, actual.length);

        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime)/1000000);
    }


    //Recursividade
    public static void mergeSort(int[] a, int n) {
        if (n < 2)
            return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];

        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    static void printArray(int[] A, int size)
    {
        int i;
        for (i=0; i < size; i++)
            System.out.printf("%d ", A[i]);
        System.out.println("\n");
    }

}
