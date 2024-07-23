public class C {
    public static void main(String arg[]){
        C1 c=new C1("BWM","RED",40000,6);
        C1 c2=new C1("Nissan","black",20000,4);
        c.printAllvalues();
        c2.printAllvalues();
        System.out.println("car price:"+ c.getPrize());
        System.out.println("car price:"+c2.getPrize());


    }
}
