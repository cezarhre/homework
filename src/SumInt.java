import java.util.Arrays;

public class SumInt {
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
        int size = numbers.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
            if (arr[i] % 2 != 0) {
                countOdd++;
            }
        }
        System.out.print(countOdd);
    }
    static void biggerNum(String[] numbers){
        System.out.println();
        int newNr = 50;
        int size = numbers.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
            if(arr[i]>newNr){
                System.out.print(arr[i]+",");
            }
        }
    }
}

