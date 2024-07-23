
    public class EconomyCar extends Car {
        public EconomyCar(String registrationNumber, String model, double rentalRatePerDay) {
            super(23,"nissan",1000);
        }
        public void displayDetails() {
            System.out.println("Economy Car Details:");
            super.displayDetails();
        }

    }

