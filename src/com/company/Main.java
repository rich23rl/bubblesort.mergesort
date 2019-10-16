package com.company;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        
}
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i); j++) {
                if (arr[j-1] > arr[j]) {
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static int[] merge(int[] a, int[] b){
        int[] retval = new int[a.length + b.length];
        int i=0, j=0, k=0;
        for (;j < b.length && k < b.length; i++) {
            //retval[i] = a[j] < b[k] ? a[j++]:b[k++];
            if (a[j] < b[k]) {
                retval[i]=a[j++];
            }else{
                retval[i]=b[k++];
            }
        }
        if (j < a.length) {
            for (; i < retval.length; i++) {
                retval[i] = a[j++];
            }
        }else if (k < b.length) {
            for (; i < retval.length; i++) {
                retval[i] = b[k++];
            }
        }
        if (j < a.length) {
            for (; i < retval.length; i++) {
                retval[i] = a[j++];
            }
        }else if (k < b.length) {
            for (; i < retval.length; i++) {
                retval[i] = b[k++];
            }
        }
        return retval;
    }
}
