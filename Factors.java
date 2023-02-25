import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter n: ");
        int n = input.nextInt();
        
        int count = 0;
        int factor = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (count == n) {
                    factor = i;
                    break;
                }
            }
        }
        
        System.out.println("Number of factors: " + count);
        System.out.println("The " + n + "th factor: " + factor);
    }
}
