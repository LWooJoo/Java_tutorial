package HandlingDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B2{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}

class C2{
    void run() throws IOException, FileNotFoundException{
        B2 b = new B2();
        b.run();
    }
}

public class HandlingDemo5 {
    public static void main(String[] args){
        C2 c = new C2();
        try{
            c.run();
        } catch (FileNotFoundException e){
            System.out.println("out.txt 파일은 설정 파일이다. 이 파일이 프로젝트 루트 디렉토리에 존재해야 한다.");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
