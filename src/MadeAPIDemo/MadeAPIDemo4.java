package MadeAPIDemo;

import java.io.IOException;

class E{
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException(){
        try {
            throw new IOException();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
public class MadeAPIDemo4 {
}
