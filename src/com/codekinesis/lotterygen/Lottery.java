package com.codekinesis.lotterygen;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class Lottery {

    public static void main(String[] args) {
        int[] luckyNumbers = new int[6];
        Random numberGenerator = new Random();

        for (int i = 0; i < luckyNumbers.length; i++) {
            luckyNumbers[i] = numberGenerator.nextInt(50) + 1;
        }
        Arrays.sort(luckyNumbers);
        System.out.println("Your lucky numbers are: " + Arrays.toString(luckyNumbers));
    }

}
