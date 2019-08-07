package MadeAPIDemo;

class Calculator2{
    int left, right;
    public void setOprands2(int left, int right){
        if (right == 0){
            throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다.");
        }
        this.left = left;
        this.right = right;
    }
    public void divide2(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
}

public class MadeAPIDemo2 {
    public static void main(String[] args){
        Calculator2 c2 = new Calculator2();
        c2.setOprands2(10,0);
        c2.divide2();
    }
}
//setOprands의 두번째 인자로 0이 들어오면 예외를 발생시킨다.