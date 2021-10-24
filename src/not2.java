import java.util.Random;

public class not2 {
    public static void main(String[] args) {
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNum = rand.nextInt(1000);
            System.out.print("New donation: " + randomNum + " New sum:");
            sum += randomNum;
            System.out.println(sum);
        }
    }
}
