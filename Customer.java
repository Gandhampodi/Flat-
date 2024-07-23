public class Customer {
    private String customername;
    private int customerid;

    public Customer(String customername, int customerid) {
        this.customername = customername;
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

}
