package Task;

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        if (mark > 100) {
            System.out.println("Invalid Input");
        } else if (mark == 100) {
            System.out.println("S");
        } else if (mark >= 90) {
            System.out.println("A");
        } else if (mark >= 80) {
            System.out.println("B");
        } else if (mark >= 70) {
            System.out.println("C");
        } else if (mark >= 60) {
            System.out.println("D");
        } else if (mark >= 50) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
        scanner.close();
    }
}

