package InterfaceDemo;

class CalculatorDummy2 implements Calculatable1{
    public void setOprands(int first, int second, int third){
    }
    public int sum(){
        return 60;
    }
    public int avg() {
        return 20;
    }
}

public class InterfaceDemo3 {
    public static void main(String[] args) {
        CalculatorDummy2 c = new CalculatorDummy2();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}
