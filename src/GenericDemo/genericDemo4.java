package GenericDemo;
class EmployeeInfo4{
    public int rank;
    EmployeeInfo4(int rank){ this.rank = rank; }
}
class Person4<T, S>{
    public T info;
    public S id;
    Person4(T info, S id){
        this.info = info;
        this.id = id;
    }
}
public class genericDemo4 {
    public static void main(String[] args) {
        EmployeeInfo4 e = new EmployeeInfo4(1);
        Integer i = new Integer(10);
        Person4<EmployeeInfo4, Integer> p1 = new Person4<EmployeeInfo4, Integer>(e, i);
        System.out.println(p1.id.intValue());
    }
}
