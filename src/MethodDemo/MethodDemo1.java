package MethodDemo;

public class MethodDemo1 { //정의
    public static void numbering() {
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args){
        numbering(); // 호출
    }
}