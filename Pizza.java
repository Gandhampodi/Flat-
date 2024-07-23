public class Pizza {
    private int price;
    private boolean veg;
    private int Addextracheese = 10;
    private int Extratoppings = 20;
    private int Takeaway = 5;
    private int basepizza;
    private boolean isAddextracheese;
    private boolean isExtraTopping;
    private boolean isTakeaway;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isVeg() {
        return veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }


    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 400;
        } else {
            this.price = 500;
        }
        basepizza = this.price;


    }

    public void Addextracheese() {
        isAddextracheese = false;
        System.out.println("Add extra cheese");
        this.price += Addextracheese;
    }

    public void ExtraTopping() {
        isExtraTopping = false;
        System.out.println("Extra topping");
        this.price += Extratoppings;
    }

    public void Takeaway() {
        isTakeaway = true;
        System.out.println("Takeaway");
        this.price += Takeaway;
    }

    public void getbill() {
        String bill="";
        System.out.println("Pizza:" + basepizza);
        if (isAddextracheese) {
            bill+="extra cheese add:" + isAddextracheese + "\n";
        }  if (isExtraTopping) {
            bill+="Extra topping add:" + isExtraTopping + "\n";
        }  if (isTakeaway) {
            bill+="Take away:" + isTakeaway + "\n";
        }
        bill+="Bill:"+this.price+"\n";
        System.out.println(bill);
    }
}


