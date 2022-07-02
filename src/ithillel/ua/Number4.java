package ithillel.ua;

import java.util.Arrays;

public class Number4 {

    public static void main(String[] args) {

        int[][] score = new int[3][4];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = 10*(i + 1) + j;
            }
        }
        int[] result = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                result[i] = result[i] + score[i][j];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
