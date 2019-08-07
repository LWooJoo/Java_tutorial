package AbstractDemo;
abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public abstract void sum();
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
} //abstract 에는 비어 있는 값만 넣는다.
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
}
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
}
public class AccessDemo2 {
    public static void main(String[] args) {
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();

        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }
}
