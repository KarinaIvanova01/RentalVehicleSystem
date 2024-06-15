public class Car extends Vehicle {
    private final int safetyRating;

    public Car(String brand, String model, double value, int safetyRating) {
        super(brand, model, value);
        this.safetyRating = safetyRating;
    }

    @Override
    public double getDailyRental(long rentalDays) {
        if (rentalDays > 7) {
            return 15.00;
        } else{
            return 20.00;
        }
    }

    @Override
    public double getDailyInsurance() {
        double insuranceCost = value * 0.0001;
        if (safetyRating >= 4) {
            insuranceCost *= 0.9;
        }
        return insuranceCost;
    }
}
