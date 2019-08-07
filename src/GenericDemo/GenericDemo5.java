package GenericDemo;
class EmployeeInfo5{
    public int rank;
    EmployeeInfo5(int rank){ this.rank = rank; }
}
class Person5<T, S>{
    public T info;
    public S id;
    Person5(T info, S id){
        this.info = info;
        this.id = id;
    }
    public <U> void printInfo5(U info){
        System.out.println(info);
    }
}
public class GenericDemo5 {
    public static void main(String[] args) {
        EmployeeInfo5 e = new EmployeeInfo5(1);
        Integer i = new Integer(10);
        Person5<EmployeeInfo5, Integer> p1 = new Person5<EmployeeInfo5, Integer>(e, i);
        p1.<EmployeeInfo5>printInfo5(e);
        p1.printInfo5(e);
    }

}
