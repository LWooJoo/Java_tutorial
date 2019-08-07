package InheritanceDemo;

class Multiplication extends Calculator{
    public void multi() {
        System.out.println(this.left*this.right);
    }
}

public class InheritanceDemo2 {
    public static void main(String[] args){
        Multiplication c1 = new Multiplication();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
        c1.multi();
    }
}