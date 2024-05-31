package com.zeyadayman.ExceptionHandling;

import java.io.IOException;

public class ThrowingExceptions {
    public static void main(String[] args) {
        anna();
    }

    //msh haynfa3 a3ml throw l checked exception, i have to put the try/catch block
    public static void foo(int a, int b) throws IOException {
        if(a == 0 || b == 0) throw new ArithmeticException("arguments can't be 0");
        System.out.println( a / b );
    }
    static void john() throws IOException{
        foo(20, 0);
    }
    static void jamila() throws IOException{
        john();
    }
    static void anna() {
        try {
            jamila();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //i have to handle this exception because it's a checked exception
    //hna kol wa7da 3malet throw 3l tanya 3shan t-hand the
    // responsibility bta3t handeling the exception to another class
}
