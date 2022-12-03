package com.sematext.blog.logging;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Task arr = new Task();
        arr.printer();
        arr.Bubbles();
        arr.printer();
    }
}

class Task {
    int n;
    int[] array;

    Task() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        n = in.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        in.close();
    }

    public void printer() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println("Ввод массива окончен");
    }

    public void Bubbles() {
        int box = 0;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    box = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = box;
                }
            }
        }
    }

}
