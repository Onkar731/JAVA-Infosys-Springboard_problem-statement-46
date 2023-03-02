import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int number = sc.nextInt();

        // printing whether the number is prime or not
        System.out.println(PrimeNumber.isPrime(number));

        // closing resource
        sc.close();
    }
}