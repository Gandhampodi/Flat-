public class Car {
    private int registrationNumber;
    private String model;
    private double rentalRatePerDay;


    public Car(int registrationNumber, String model, double rentalRatePerDay) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    public void setRentalRatePerDay(double rentalRatePerDay) {
        this.rentalRatePerDay = rentalRatePerDay;
    }
    public void displayDetails() {
        System.out.println("Economy Car Details:");
            displayDetails();
    }

}

