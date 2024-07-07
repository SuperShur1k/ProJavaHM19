package org.example.lesson19.hmls19;

//Напишите шаблонный метод getMax который принимает на вход массив произвольного типа и компаратор

import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) {
        Integer[] intArray = {3, 5, 1, 8, 2};
        System.out.println("Max Integer: " + getMax(intArray, Integer::compareTo));

        String[] stringArray = {"apple", "orange", "banana", "pear"};
        System.out.println("Max String: " + getMax(stringArray, String::compareTo));
    }

    public static <T> T getMax(T[] array, Comparator<? super T> comparator) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        T max = array[0];
        for (T element : array) {
            if (comparator.compare(element, max) > 0) {
                max = element;
            }
        }

        return max;
    }
}
