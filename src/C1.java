public class C1 {
    private String company;
    private String colour;
    private int prize;
    private int wheels;

    public C1(String company,String colour,int prize,int wheels) {
        this.company = company;
        this.colour = colour;
        this.prize = prize;
        this.wheels = wheels;
    }

    public int getPrize(){
        return prize;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColour() {
        return colour;
    }

    public String getCompany() {
        return company;
    }

    public void printAllvalues(){
      System.out.println("Car company:"+ company) ;
      System.out.println("Car prize:"+ prize);
      System.out.println("car colour:"+colour);
      System.out.println("car wheels:"+ wheels);
    }


}
