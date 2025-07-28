package com.shubham;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);

        // " Type Casting  "
//
//        int num = (int)(67.56f);    <----
//        System.out.println(num);
//
//        // " Automatic Type Promotion in expressions "
//
//        int a = 257;
//        byte b = (byte)(a);   // ---> 257 % 256 = 1
//
//        System.out.println(b);
//
//        byte c = 40;
//        byte d = 50;
//        byte e = 100;
//        int f = c * d / e;
//        System.out.println(f);
//
//        byte g = 50;
//        g = g  * 2;   ---> cannot be done like this
        // cuz after arithmetic operation on byte it gets converted into int
        // and then g is byte but g*2 is int, thus error

//        int number = 'A';           // " Automatic Type Promotion in expressions "
//        System.out.println(number);
//

        // Java follows " Unicode "

//        System.out.println("Hello");
//        System.out.println("नमस्ते");
//        System.out.println(" こんにちは ");
//        System.out.println("привет");

//        System.out.println( 3 * 6.787781234455993547788f);
//        System.out.println( 3 * 6);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
//      result =  float + int - double = " double "

        System.out.println((f * b) + " "  + (i / c) + " " + (d - s));
        System.out.println(result);

    }
}
