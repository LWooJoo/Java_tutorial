package PolymorphismDemo;
interface I{}
class C implements I{}
public class PolymorphismDemo3 {
    public static void main(String[] args){
        I obj = new C();
    }
}
//클래스 C의 데이터 타입으로 인터페이스 I가 될 수 있다