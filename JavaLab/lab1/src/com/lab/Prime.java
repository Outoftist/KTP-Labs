package com.lab;

//import  java.lang.Math;
public class Prime {
    public static void main(String[] arg){
        System.out.println("Prime numbers:");
        for (int i = 2; i <= 100; i++) {
            if (IsPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean IsPrime(int n) {
            for (byte i = 2; i <= Math.sqrt(n) ; i++ ) {
                if (n % i == 0) {
                    return false;
                }
            }
        return true;
    }
}
