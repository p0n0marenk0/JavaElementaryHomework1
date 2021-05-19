//task#2
//Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно).
//Вывести среднее арифметическое.
package com.p0n0marenk0;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void averageOfArray() {
        Random random = new Random();
        int[] arrayOfNumbers = new int[11];
        double average = 0;
        for (int i = 0; i <= arrayOfNumbers.length - 1; i++) {
            arrayOfNumbers[i] = random.nextInt(11) + 10;
            average = average + arrayOfNumbers[i];
        }
        System.out.println("Result of Task2");
        System.out.println(Arrays.toString(arrayOfNumbers));
        average = Math.round((average / arrayOfNumbers.length) * 100);
        System.out.println("Average = " + average / 100.0);
        System.out.println();
        System.out.println();
    }
}
