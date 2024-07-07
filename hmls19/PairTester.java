package org.example.lesson19.hmls19;
//Напишите шаблонный метод equals который принимает две пары и проверяет их на эквивалентность, сравнивая по значениям все их поля
public class PairTester {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 1);
        Pair<String, Integer> pair2 = new Pair<>("Hello", 1);
        Pair<String, Integer> pair3 = new Pair<>("World", 2);

        System.out.println(pair1.equals(pair2));  // true
        System.out.println(pair1.equals(pair3));  // false
    }
}
