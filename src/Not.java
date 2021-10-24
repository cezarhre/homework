import java.util.Random;

public class Not {
    public static void main(String[] args) {
        int[] persons = new int[200];
        int[] person  = new int[5];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < person.length; i++) {
            sum += person[i];
            person[i] = random.nextInt(persons.length);
            System.out.print(person[i]+",");

        }
        System.out.println(sum);
    }
}
