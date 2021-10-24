package ro.fasttrackit.curs6.homework;

import java.util.Arrays;

public class StringInt {
    public static void main(String[] args) {
        String input = "88 65 90 22 31";
        String[] numbers = input.split(" ");
        System.out.println(Arrays.toString(numbers));
        intSum(numbers);
        impNum(numbers);
        biggerNum(numbers);
    }

    static void intSum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println(sum);
    }

    static void impNum(String[] numbers) {
        int countOdd = 0;
        int result[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = Integer.parseInt(numbers[i]);
            if (result[i] % 2 != 0) {
                countOdd++;
            }
        }
        System.out.print(countOdd);
    }

    static void biggerNum(String[] numbers) {
        System.out.println();
        int minNr = 50;
        int result[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = Integer.parseInt(numbers[i]);
            if (result[i] > minNr) {
                System.out.print(result[i] + ",");
            }
        }
    }
}