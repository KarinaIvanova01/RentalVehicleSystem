import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rental {
    private final Vehicle vehicle;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private LocalDate actualReturnDate;
    private final String customerName;

    public Rental(Vehicle vehicle, LocalDate startDate, LocalDate endDate, String customerName) {
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerName = customerName;
    }

    public void setActualReturnDate(LocalDate actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    public Invoice generateInvoice() {
        long reservedDays = ChronoUnit.DAYS.between(startDate, endDate);
        long actualDays = ChronoUnit.DAYS.between(startDate, actualReturnDate);

        double dailyRentalCost = vehicle.getDailyRental(reservedDays);
        double dailyInsuranceCost = vehicle.getDailyInsurance();

        double totalRent = dailyRentalCost * actualDays;
        double totalInsurance = dailyInsuranceCost * actualDays;

        double discountRent = (((reservedDays-actualDays) * dailyRentalCost) / 2);
        double discountInsurance = (actualDays * dailyInsuranceCost) /2;

        if (actualDays < reservedDays) {
            totalRent += dailyRentalCost * 0.5 * (reservedDays - actualDays);
        }

        return new Invoice(LocalDate.now(), customerName, vehicle, startDate, endDate, actualReturnDate,
                reservedDays, actualDays, dailyRentalCost, dailyInsuranceCost,
                totalRent, totalInsurance, discountRent,discountInsurance);
    }
}
