package InputDemo;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // 앱이 실하는 도중 input 값을 주는 방법
        int i = sc.nextInt();
        System.out.println(i+1000); // 1+XXX
        sc.close();// 종료
    }
}