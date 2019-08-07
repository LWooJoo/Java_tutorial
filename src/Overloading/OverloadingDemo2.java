package Overloading;

public class OverloadingDemo2 {
    void A() { System.out.println("void A()"); }
    void A(int arg1) { System.out.println("void A (int arg1)"); }
    void A(String arg1) { System.out.println("void A (String arg1)"); }

    //int A (){System.out.println("void A()");}
    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
}
