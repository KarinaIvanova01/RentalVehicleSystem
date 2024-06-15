public class CargoVan extends Vehicle {
    private final int driverExperience;

    public CargoVan(String brand, String model, double value, int driverExperience) {
        super(brand, model, value);
        this.driverExperience = driverExperience;
    }

    @Override
    public double getDailyRental(long rentalDays) {
        if (rentalDays > 7) {
            return 40.00;
        } else{
            return 50.00;
        }
    }

    @Override
    public double getDailyInsurance() {
        double insuranceCost = value * 0.0003;
        if (driverExperience > 5) {
            insuranceCost *= 0.85;
        }
        return insuranceCost;
    }
}
