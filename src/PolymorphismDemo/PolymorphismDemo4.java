package PolymorphismDemo;
interface I2{
    public String A();
}
interface I3 {
    public String B();
}
class D implements I2,I3{
    public String A(){
        return "A";
    }
    public String B(){
        return "B";
    }
}

public class PolymorphismDemo4 {
    public static void main(String[] args){
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();

        System.out.println(obj.A());
        System.out.println(obj.B());
        System.out.println(objI2.A());
//        System.out.println(objI2.B()); objI2의 데이터 타입이 인터페이스 I 이기 때문에 에러
//        System.out.println(objI3.A());
        System.out.println(objI3.B());
    }
}
//인터페이스의 매우 중요한 특징 중의 하나를 보여준다. 인스턴스 objI2의 데이터 타입을 I2로 한다는 것은 인스턴스를 외부에서 제어할 수 있는 조작 장치를 인스턴스 I2의 맴버로 제한한다는 의미가 된다. 인스턴스 I2와 I3로 인해서 하나의 클래스가 다양한 형태를 띄게 되는 것이다.
