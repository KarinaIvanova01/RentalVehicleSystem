public class Motorcycle extends Vehicle {
    private final int riderAge;

    public Motorcycle(String brand, String model, double value, int riderAge) {
        super(brand, model, value);
        this.riderAge = riderAge;
    }

    @Override
    public double getDailyRental(long rentalDays) {
        if (rentalDays > 7) {
            return 10.00;
        } else{
            return 15.00;
        }
    }

    @Override
    public double getDailyInsurance() {
        double insuranceCost = value * 0.0002;
        if (riderAge < 25) {
            insuranceCost *= 0.8;
        }
        return insuranceCost;
    }
}
