import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que você deseja encontrar na sequência ");
        int numberToFind = sc.nextInt(); // O número que você quer encontrar na sequência

        if (isInFibonacciSequence(numberToFind)) {
            System.out.println(numberToFind + " está na sequência de Fibonacci.");
        } else {
            System.out.println(numberToFind + " não está na sequência de Fibonacci.");
        }
    }

    public static boolean isInFibonacciSequence(int num) {
        int a = 0, b = 1;

        while (a <= num) {
            if (a == num) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }
}