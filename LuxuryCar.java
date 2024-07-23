public class LuxuryCar extends Car {
    public LuxuryCar(String registrationNumber, String model, double rentalRatePerDay) {
        super(456,"BMW",2000);
    }

    public void displayDetails() {
        System.out.println("Luxury Car Details:");
        super.displayDetails();
    }
}

