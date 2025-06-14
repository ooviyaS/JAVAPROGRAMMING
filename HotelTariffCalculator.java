import java.util.Scanner;

public class HotelTariffCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int month = scanner.nextInt();
        double rentPerDay = scanner.nextDouble();
        int numberOfDays = scanner.nextInt();
        double tariff;

        switch (month) {
            case 4: case 5: case 6: case 11: case 12:
                tariff = rentPerDay * numberOfDays * 1.2;
                break;
            default:
                tariff = rentPerDay * numberOfDays;
                break;
        }

        System.out.printf("%.2f%n", tariff);
        scanner.close();
    }
}
