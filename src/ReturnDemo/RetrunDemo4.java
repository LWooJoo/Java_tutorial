package ReturnDemo;

import java.util.Arrays;

public class RetrunDemo4 {
    public static String[] getMemvers(){
        String[] members = {"name1", "name2", "name3"};
        return members;
    }

    public static void main(String[] args) {
        String[] members = getMemvers();
        System.out.println(Arrays.toString(members));
    }
}
