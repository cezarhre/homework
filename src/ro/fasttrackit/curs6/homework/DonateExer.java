package ro.fasttrackit.curs6.homework;

import java.util.Random;

public class DonateExer {
    public static void main(String[] args) {
        int randnum;
        int sum = 0;
        Random don = new Random();
        boolean correct = false;
        randnum = don.nextInt(10);
        while (!correct) {
            if (sum + randnum <= 10000) {
                sum += randnum;
            } else {
                System.out.print("Congratulations!! " + sum);
                correct = true;
            }
        }
    }
}
