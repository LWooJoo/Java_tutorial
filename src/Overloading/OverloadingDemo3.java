package Overloading;

public class OverloadingDemo3 extends OverloadingDemo2 {
    void A (String arg1, String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}
    void A (){System.out.println("sub class : void A ()");}
    public static void main(String[] args) {
        OverloadingDemo3 od = new OverloadingDemo3();
        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody");
    }
}
