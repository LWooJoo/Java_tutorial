package HandlingDemo;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try{
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
            System.out.println();
        }
        catch (Exception e){ // Exception은 변수의 데이터 타입이 Exception 이라는 말이다.
            //예외가 발생하면 자바는 마치 메소드를 호출하듯이 catch를 호출하면서 그 인자로 Exception 클래스의 인스턴스를 전달하는 것이다.
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            //에러가 발생하면 에러 발생
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
}

public class HandlingDemo1 {
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0); //0을 나누게 되어서 에러가 발생한다.
        c1.divide();

        Calculator c2 = new Calculator();
        c2.setOprands(10, 5);
        c2.divide();
    }
}
