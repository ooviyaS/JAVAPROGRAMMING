import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int b = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int c = scanner.nextInt();

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("Largest Number: " + largest);
        scanner.close();
    }
}
