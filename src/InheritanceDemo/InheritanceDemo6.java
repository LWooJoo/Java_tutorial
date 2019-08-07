package InheritanceDemo;

class Calculator3{
    int left, right;

    public Calculator3(){}

    public Calculator3(int left, int right){
        this.left = left;
        this. right = right;
    }

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class Substraction2 extends Calculator3{
    public Substraction2(int left, int right){
       super(left, right);
    }

    public void sub2(){
        System.out.println(this.left-this.right);
    }
}

public class InheritanceDemo6 {
    public static void main(String[] args){
        Substraction2 c1 = new Substraction2(10, 20);
        c1.sum();
        c1.avg();
        c1.sub2();
    }
}
