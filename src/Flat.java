public class Flat {
    private int squarefeet;
    private int priceperfeet;
    private int floor;
    private int numberofrooms;

    public Flat(int squarefeet, int priceperfeet, int floor, int numberofrooms) {
        this.squarefeet = squarefeet;
        this.priceperfeet = priceperfeet;
        this.floor = floor;
        this.numberofrooms = numberofrooms;
    }
    public int getflat(){
        return squarefeet*priceperfeet;
    }
    public void PrintAllValues(){
        System.out.println("Square feet:"+ squarefeet);
        System.out.println("priceperfeet:"+ priceperfeet);
        System.out.println("floor:"+ floor);
        System.out.println("numberofrooms:"+ numberofrooms);
    }
}
