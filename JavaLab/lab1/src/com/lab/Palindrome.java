package com.lab;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        for (String word : words) {
            String answer = IsPalindome(word, reverseString(word)) ? "Palindrome"  : "Is not a palindrome";
            System.out.println("word : " + word + " : " + answer);
        }
    }
    public static String reverseString(String str) {
        if (str.length() == 0){
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }
    public static boolean IsPalindome(String str, String reversed_str) {
        return str.equals(reversed_str);
    }
}