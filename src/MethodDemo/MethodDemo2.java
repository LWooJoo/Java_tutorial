package MethodDemo;

public class MethodDemo2 {
    public static void numbering(int limit) {
        int i = 0;
        while( i < limit){
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args){
        numbering(5);
    }
}

//public static void numbering() {
//    int limit = 5;
//    int i = 0;
//    while(i<limit){
//        System.out.println(i);
//        i++;
//    }
//}