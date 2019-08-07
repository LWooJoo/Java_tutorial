package InterfaceDemo;

class CalculatorDummy{
    public void setOprands(int first, int second, int third){ }
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args){
        CalculatorDummy c1 = new CalculatorDummy();
        c1.setOprands(10,20,30);
        System.out.println(c1.sum()+c1.avg());
    }
}
