package ro.fasttrackit.curs6.homework;

import java.util.Random;

public class DonateExer {
    public static void main(String[] args) {
        int randNum;
        int sum = 0;
        Random don = new Random();
        boolean correct = false;
        while (!correct) {
            int randomNum = don.nextInt(50);
            if (sum <= 100) {
                sum += randomNum;
                System.out.println("New donation: " + randomNum);
            } else {
                System.out.println("Congratulations!! Donations are: " + sum);
                correct = true;
            }
        }
    }
}
