import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe z przedzialu [0-100]");
        int x = input.nextInt();

        if (x%3==0) System.out.println("Fizz");
        if (x%5==0) System.out.println("Buzz");
        if (x%3==0 && x%3==0) System.out.println("FizzBuzz");
    }
}