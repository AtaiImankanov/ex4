package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Integer[] array = new Integer[100];
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (array[i] % 5 == 0) {
                    hashSet.add(array[i]);
                }
            }

        }
        for (int i = 0; i <array.length; i++) {
            if(array[i]%2==0){
                if(array[i]%5!=0){
                    hashSet.add(array[i]);
                }
            }
        }
        for (Integer inter: hashSet){
            System.out.println(inter);


        }
    }
}
