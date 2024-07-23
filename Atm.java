public class Atm {
    float checkbalance = 200000;
    int pin = 6367;
    int opt = 5;
    int amount = 7889;
    float deposite = 8000;

    public void checkpin() {
        System.out.println("Enter you pin");
        if (pin == 6367) {
            menu();
        } else {
            System.out.println("enter vaild pin");
        }
    }

    private void menu() {
        System.out.println("enter your choice:");
        System.out.println("1. check account balance");
        System.out.println("2. withdraw money");
        System.out.println("3. deposite money");
        System.out.println("4.exit");
    }

    {
        if (opt == 1) {
            System.out.println("checkbalance");
        } else if (opt == 2) {
            System.out.println("withdraw");
        } else if (opt == 3) {
            System.out.println("deposite money");
        } else {
            System.out.println("enter a vaild");
        }
    }

    public void checkbalance() {
        System.out.println("Balance:" + checkbalance);
    }

    public void withdraw() {
        System.out.println("enter amount to withdraw:");
    }

    {
        if (amount > checkbalance) {
            System.out.println("insufficient balance");
        } else {
            checkbalance = checkbalance - amount;
            System.out.println("money withdraw successful");
        }

        checkbalance = checkbalance + amount;

        System.out.println("money deposite successful");

    }
}







