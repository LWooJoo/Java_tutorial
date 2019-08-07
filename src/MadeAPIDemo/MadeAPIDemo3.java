package MadeAPIDemo;
class Calculator3{
    int left, right;
    public void setOprands3(int left, int right){
        this.left=left;
        this.right=right;
    }
    public void diviede3(){
        if (this.right == 0){
            throw new ArithmeticException("0으로 누나느 것은 허용 되지 않습니다.");
        }
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch (Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
}
public class MadeAPIDemo3 {
    public static void main(String[] args){
        Calculator3 c3 = new Calculator3();
        c3.setOprands3(10, 0);
        c3.diviede3();
    }
}
