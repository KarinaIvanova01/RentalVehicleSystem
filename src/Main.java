import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter vehicle type (car/motorcycle/cargovan):");
        String vehicleType = scanner.nextLine();

        System.out.println("Enter vehicle brand:");
        String brand = scanner.nextLine();

        System.out.println("Enter vehicle model:");
        String model = scanner.nextLine();

        System.out.println("Enter vehicle value:");
        double value = scanner.nextDouble();

        Vehicle vehicle = null;

        switch (vehicleType.toLowerCase()) {
            case "car" -> {
                System.out.println("Enter car safety rating (1-5):");
                int safetyRating = scanner.nextInt();
                vehicle = new Car(brand, model, value, safetyRating);
            }
            case "motorcycle" -> {
                System.out.println("Enter rider's age:");
                int riderAge = scanner.nextInt();
                vehicle = new Motorcycle(brand, model, value, riderAge);
            }
            case "cargovan" -> {
                System.out.println("Enter driver's experience (years):");
                int driverExperience = scanner.nextInt();
                vehicle = new CargoVan(brand, model, value, driverExperience);
            }
            default -> {
                System.out.println("Invalid vehicle type.");
                System.exit(1);
            }
        }

        System.out.println("Enter rental start date (yyyy-mm-dd):");
        String startDateStr = scanner.next();
        LocalDate startDate = LocalDate.parse(startDateStr);

        System.out.println("Enter rental end date (yyyy-mm-dd):");
        String endDateStr = scanner.next();
        LocalDate endDate = LocalDate.parse(endDateStr);

        Rental rental = new Rental(vehicle, startDate, endDate, customerName);

        System.out.println("Enter actual return date (yyyy-mm-dd):");
        String actualReturnDateStr = scanner.next();
        LocalDate actualReturnDate = LocalDate.parse(actualReturnDateStr);

        rental.setActualReturnDate(actualReturnDate);

        Invoice invoice = rental.generateInvoice();
        invoice.printInvoice();

        scanner.close();
    }
}
