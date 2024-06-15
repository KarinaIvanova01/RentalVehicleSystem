public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected double value;


    public Vehicle(String brand, String model, double value) {
        this.brand = brand;
        this.model = model;
        this.value = value;
    }

    public abstract double getDailyRental(long rentalDays);

    public abstract double getDailyInsurance();
}
