package ro.fasttrackit.curs6.homework;

import java.util.Arrays;

public class StringInt {
    public static void main(String[] args) {
        String str = "123456";
        int sum = 0;
        int odd = 0;
        int min = 3;
        int res = 0;
        System.out.print("Numere mai mari decit " + min + ": ");

        for (int i = 0; i < str.length(); i++) {
            String nr = "" + str.charAt(i);
            int numbers = Integer.valueOf(nr);
            sum += numbers;
            if (numbers % 2 != 0) {
                odd++;
            }
            if (numbers > min) {
                res = numbers;
                System.out.print(res + ",");
            }
        }
        System.out.println();
        System.out.println("Suma numereler: " + sum);
        System.out.println("Numere impare " + odd);

    }
}