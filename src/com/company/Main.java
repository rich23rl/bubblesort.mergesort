package com.company;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
    int[] a = new int[100000];
    int[] b = new int[100000];

    a = mergeSort(a);
    b = bubbleSort(b);

        long start = System.nanoTime();
        System.out.println("MERGE SORT");
            long time = System.nanoTime()- start;
        System.out.println(time+" Nanosegundos");

        System.out.println("BUBBLE SORT");
            long time1 = System.nanoTime()- start;
        System.out.println(time1+" Nanosegundos");
}
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public  static int[] mergeSort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int medio = arr.length /2;

        int[] abajo = new int[medio];
        int[] arriba = new int[arr.length - medio];
        for (int i = 0; i < medio; i++) {
            abajo[i] = arr[i];
        }

        for (int i = 0; i < arriba.length ; i++) {
            arriba[i] = arr[i + abajo.length];
        }
        return  merge(mergeSort(abajo), mergeSort(arriba));
    }

    public static int[] merge(int[] a, int[] b){
        int[] retval = new int[a.length+ b.length];
        int i = 0, j = 0, k = 0;
        while (j < a.length && k < b.length ){
            if(a[j] < b[k]){
                retval[i++] = a[j++];
            }else{
                retval[i++] = b[k++];
            }
        }
        while (j < a.length){
            retval[i++] = a[j++];
        }
        while (k < b.length){
            retval[i++] = b[k++];
        }
        return retval;
    }
}