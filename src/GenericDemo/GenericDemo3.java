package GenericDemo;
class StudentInfo3{
    public int grade;
    StudentInfo3(int grade){ this.grade = grade; }
}
class EmployeeInfo3{
    public int rank;
    EmployeeInfo3(int rank){ this.rank = rank; }
}
class Person3<T>{
    public T info;
    Person3(T info){ this.info = info; }
}
public class GenericDemo3 {
    public static void main(String[] args) {
        Person3<EmployeeInfo3> p1 = new Person3<EmployeeInfo3>(new EmployeeInfo3(1));
        EmployeeInfo3 ei1 = p1.info;
        System.out.println(ei1.rank); // 성공

//        Person3<String> p2 = new Person3<String>("부장");
//        String ei2 = p2.info;
//        System.out.println(ei2.rank); // 컴파일 실패
    }
}
