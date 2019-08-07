package ReturnDemo;

public class ReturnDemo1 {
    public static int one() { // compile error 가 난다.
        return 1;
//        return 2;
//        return 3;
    }

    public static void main(String[] args) {
        System.out.println(one());
    }
}
