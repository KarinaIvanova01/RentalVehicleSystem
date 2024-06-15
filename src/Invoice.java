import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Invoice {
    private final LocalDate date;
    private final String customerName;
    private final Vehicle vehicle;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final LocalDate actualReturnDate;
    private final long reservedDays;
    private final long actualDays;
    private final double dailyRentalCost;
    private final double dailyInsuranceCost;
    private final double totalRent;
    private final double totalInsurance;

    private final double discountRent;
    private final double discountInsurance;
    public Invoice(LocalDate date, String customerName, Vehicle vehicle, LocalDate startDate, LocalDate endDate,
                   LocalDate actualReturnDate, long reservedDays, long actualDays, double dailyRentalCost,
                   double dailyInsuranceCost, double totalRent, double totalInsurance, double discountRent,
                   double discountInsurance) {
        this.date = date;
        this.customerName = customerName;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.actualReturnDate = actualReturnDate;
        this.reservedDays = reservedDays;
        this.actualDays = actualDays;
        this.dailyRentalCost = dailyRentalCost;
        this.dailyInsuranceCost = dailyInsuranceCost;
        this.totalRent = totalRent;
        this.totalInsurance = totalInsurance;
        this.discountRent = discountRent;
        this.discountInsurance = discountInsurance;

    }

    public void printInvoice() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("XXXXXXXXXX");
        System.out.println("Date: " + date.format(formatter));
        System.out.println("Customer Name: " + customerName);
        System.out.println("Rented Vehicle: " + vehicle.brand + " " + vehicle.model);
        System.out.println();
        System.out.println("Reservation start date: " + startDate.format(formatter));
        System.out.println("Reservation end date: " + endDate.format(formatter));
        System.out.println("Reserved rental days: " + reservedDays + " days");
        System.out.println();
        System.out.println("Actual Return date: " + actualReturnDate.format(formatter));
        System.out.println("Actual rental days: " + actualDays + " days");
        System.out.println();
        System.out.printf("Rental cost per day: $%.2f\n", dailyRentalCost);
        System.out.printf("Insurance per day: $%.2f\n", dailyInsuranceCost);
        System.out.println();
        if (actualReturnDate.isBefore(endDate)) {
            System.out.printf("Early return discount for rent: $%.2f\n",discountRent );
            System.out.printf("Early return discount for insurance: $%.2f\n", discountInsurance);
            System.out.println();
        }
        System.out.printf("Total rent: $%.2f\n", totalRent);
        System.out.printf("Total insurance: $%.2f\n", totalInsurance);
        System.out.printf("Total: $%.2f\n", (totalRent + totalInsurance));
        System.out.println("XXXXXXXXXX");
    }
}
