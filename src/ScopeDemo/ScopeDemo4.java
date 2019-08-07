package ScopeDemo;

public class ScopeDemo4 {
    static void a() {
        String title = "TEST";
    }

    public static void main(String[] args) {
        a();
        //System.out.println(title);
        //title은 메소드 a에서만 유효한다.
    }
}
