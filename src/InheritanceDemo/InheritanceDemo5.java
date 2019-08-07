package InheritanceDemo;

class Calculator2{
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left+this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class Substraction extends Calculator2 {
    public Substraction(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sub() {
        System.out.println(this.left-this.right);
    }


}
public class InheritanceDemo5 {
    public static void main(String[] args) {
        Substraction c1 = new Substraction(10, 20);
        c1.sum();
        c1.avg();
        c1.sub();
    }
}
