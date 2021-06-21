package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main<T> {

    public static void main(String[] args) {


        /**Task41      создать список оценок учеников с помощью ArrayList,заполнить случайными оценками.Найти самую высокую*/

        ArrayList<Integer> list = new ArrayList<>(20);

        for (int i = 0; i < 20; i++) {
            list.add(i, (ThreadLocalRandom.current().nextInt(10)));
        }
        System.out.println(list);
        System.out.println(Collections.max(list));


        /**Task42     создать Map ,где ключом будет слово ,а значение количество повторений этого слова*/


        String text = "I am am not the one who is thinking I one thing at time";
        String[] arraySplit = text.split(" +");
        Map<String, Integer> map = new HashMap<String, Integer>();//hashMap-самый быстрый при поиске, он таблицуне перебирает ,а ищет по hashCode

        for (int i = 0; i < arraySplit.length; i++) {
            int count = 0;

            for (int j = 0; j < arraySplit.length; j++) {
                if (arraySplit[i].equals(arraySplit[j])) {
                    count++;
                }
            }

            map.put(arraySplit[i], count);
        }

        System.out.println(map);


        String text1 = "I am am  not the one who is thinking I one thing at time";
        String[] arraySplit1 = text1.split(" +");
        Map<String, Integer> keyAWorldValueTheNumberRepetitions = new HashMap<>();

        for (String t : arraySplit1) {
            if (keyAWorldValueTheNumberRepetitions.containsKey(t)) {

                keyAWorldValueTheNumberRepetitions.put(t, keyAWorldValueTheNumberRepetitions.get(t) + 1);
            } else {
                keyAWorldValueTheNumberRepetitions.put(t, 1);
            }
        }
        System.out.println("HashMap " + keyAWorldValueTheNumberRepetitions);


        /**linkedHashMap*/
        String text2 = "I am am  not the one who is thinking I one thing at time";
        String[] arraySplit2 = text1.split(" +");
        LinkedHashMap<String, Integer> keyAWorldValueTheNumberRepetitions1 = new LinkedHashMap<>();

        for (String t : arraySplit2) {
            if (keyAWorldValueTheNumberRepetitions1.containsKey(t)) {

                keyAWorldValueTheNumberRepetitions1.put(t, keyAWorldValueTheNumberRepetitions1.get(t) + 1);
            } else {
                keyAWorldValueTheNumberRepetitions1.put(t, 1);
            }
        }
        System.out.println("LinkedHashMap " + keyAWorldValueTheNumberRepetitions1);



        /**TreeMap*/
        String text3 = "I am am  not the one who is thinking I one thing at time";
        String[] arraySplit3 = text1.split(" +");
        TreeMap<String, Integer> keyAWorldValueTheNumberRepetitions2 = new TreeMap<>();//TreeMap-ассоциативный массив ,отсортированный по ключу.Хранит элементы в красно-черном дереве(сбалансированном)

        for (String t : arraySplit3) {
            if (keyAWorldValueTheNumberRepetitions2.containsKey(t)) {

                keyAWorldValueTheNumberRepetitions2.put(t, keyAWorldValueTheNumberRepetitions2.get(t) + 1);
            } else {
                keyAWorldValueTheNumberRepetitions2.put(t, 1);
            }
        }
        System.out.println("TreeMap  " + keyAWorldValueTheNumberRepetitions2);


    }
}
