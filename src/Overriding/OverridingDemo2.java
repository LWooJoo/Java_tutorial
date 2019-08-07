package Overriding;

class Calculator2 {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public int avg() {
        return ((this.left + this.right) / 2);
    }
}

class Substraction extends Calculator2 {

    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }

    public int avg() {
//        return ((this.left + this.right) / 2);
        return super.avg();
    }

    public void substrac() {
        System.out.println(this.left - this.right);
    }
}

public class OverridingDemo2 {
    public static void main(String[] args) {
        Substraction c1 = new Substraction();
        c1.setOprands(10, 20);
        c1.sum();
        System.out.println("실행 결과는 " + c1.avg());
//        c1.avg();
        c1.substrac();
    }
}
