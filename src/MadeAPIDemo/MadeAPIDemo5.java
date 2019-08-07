package MadeAPIDemo;

class DivideException extends RuntimeException{
    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    }
}

class Calculator5{
    int left, right;
    public void setOprands(int left, int right){
        this.left=left;
        this.right=right;
    }
    public void divide5(){
        if (this.right == 0){
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
        }
        System.out.print(this.left/this.right);
    }
}
public class MadeAPIDemo5 {
    public static void main(String[] args){
        Calculator5 c5 = new Calculator5();
        c5.setOprands(10,0);
        c5.divide5();
    }
}
