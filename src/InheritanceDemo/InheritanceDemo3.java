package InheritanceDemo;

class Division extends Multiplication{
    public void div() {
        System.out.println(this.left / this.right);
    }
}

public class InheritanceDemo3 {
    public static void main(String[] args){
        Division c1 = new Division();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
        c1.multi();
        c1.div();
    }
}
