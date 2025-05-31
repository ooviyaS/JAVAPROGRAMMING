package Task;

import java.util.Scanner;

public class HotelTariffCalculator {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter room rent per day: ");
        double rentPerDay = scanner.nextDouble();
        System.out.print("Enter number of days stayed: ");
        int numberOfDays = scanner.nextInt();

        double totalTariff;
        double peakSeasonMultiplier = 1.2; 
        switch (month) {
            case 4: case 5: case 6: case 11: case 12:
                totalTariff = rentPerDay * numberOfDays * peakSeasonMultiplier;
                break;
            default:
                totalTariff = rentPerDay * numberOfDays;
        }
        System.out.printf("Total Tariff: %.2f%n", totalTariff);
        scanner.close();
    }
}

