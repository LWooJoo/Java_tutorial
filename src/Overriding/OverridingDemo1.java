package Overriding;

class Calculator{
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left+this.right);
    }

    public void avg() {
        System.out.println((this.left+this.right)/2);
    }
}

class Substract extends Calculator {

    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }

    public void sub() {
        System.out.println(this.left - this.right);
    }
}

public class OverridingDemo1 {
    public static void main(String[] args) {
        Substract c1 = new Substract();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.sub();
    }
}
