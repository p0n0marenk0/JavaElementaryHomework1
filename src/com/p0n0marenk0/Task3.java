//task#3
//Написать метод который вернет String в которой будут в одну строку числа от 1 до 30.
//Каждое число при этом взять в круглые скобки ()
package com.p0n0marenk0;

public class Task3 {
    public static String returning() {
        System.out.println("Result of Task3");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 30; i++) {
            sb.append("(").append(i).append(") ");
        }
        return sb.toString();
    }
}
