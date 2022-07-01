package ithillel.ua;

import java.util.Arrays;

public class Number2 {

    public static void main(String[] args) {

        String[] fruits = new String[10];
        fruits[0] = "apple";
        fruits[1] = "pineapple";
        fruits[2] = "kiwi";
        fruits[3] = "mango";
        fruits[4] = "banana";
        fruits[5] = "Passion fruit";
        fruits[6] = "Pear";
        fruits[7] = "Plum";
        fruits[8] = "Peach ";
        fruits[9] = "Apricot";

        String[] copyFruits = Arrays.copyOf(fruits,10);
        System.out.println(Arrays.toString(copyFruits));
    }
}
