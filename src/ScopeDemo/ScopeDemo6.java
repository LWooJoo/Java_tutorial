package ScopeDemo;
//이러한 방식을 정적 스코프(static scope) 혹은 렉시컬 스코프(lexical scope)라고도 부른다. 즉 사용되는 시점에서의 유효범위(메소드 a의 i)를 사용하는 것이 아니라 정의된 시점에서의 유효범위(i = 5)를 사용하는 것이다.
public class ScopeDemo6 {
    static int i = 5;

    static void a(){
        int i = 10;
        b();
    }

    static void b(){
        System.out.println(i);
    }

    public static void main(String[] args){
        a();
    }
}
