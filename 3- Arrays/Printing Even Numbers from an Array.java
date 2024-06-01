import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Enter 10 Numbers: ");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        System.out.println("Even numbers are: ");
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0)
                System.out.print(numbers[i] + " ");
        }
    }
}