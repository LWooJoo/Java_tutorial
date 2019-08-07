package GenericDemo;
class Person<T>{
    public T info;
}
public class GenericDemo1 {
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>();
        Person<StringBuilder> p2 = new Person<StringBuilder>();
    }
    //p1.info : String
    //p2.info : StringBuilder
}
