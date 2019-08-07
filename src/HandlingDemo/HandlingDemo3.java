package HandlingDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandlingDemo3 {
    public static void main(String[] args){
        BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try {
            input = bReader.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(input);
    }
}
