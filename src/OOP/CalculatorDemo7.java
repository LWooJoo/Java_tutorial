package OOP;

class Calculator4 {
    public static void sum(int left, int right){
        System.out.println(left+right);
    }
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}

public class CalculatorDemo7{
    public static void main(String[] args){
        Calculator4.sum(10,20);
        Calculator4.avg(10,20);

        Calculator4.sum(20,40);
        Calculator4.avg(20,40);
    }
}