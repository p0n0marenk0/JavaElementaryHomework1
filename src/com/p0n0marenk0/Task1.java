//task#1
//Вывести ряд чисел от 1 до 100 через пробел, с изменениями:
//-если число кратно 3 то вместо него вывести Hello
//-если число кратно 5 то вместо него вывести World
//-если число кратно и 3 и 5 то вместо него вывести HelloWorld
package com.p0n0marenk0;

public class Task1 {

    public static void main(String[] args) {
        helloWorld();
    }

    private static void helloWorld() {
        for (int i = 1; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 != 0)) {
                System.out.print("Hello ");
            } else if ((i % 5 == 0) && (i % 3 != 0)) {
                System.out.print("World ");
            } else if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("HelloWorld ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
