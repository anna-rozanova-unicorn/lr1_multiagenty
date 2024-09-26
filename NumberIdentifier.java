package org.example;

public class NumberIdentifier{

    public static boolean isArabicNumber(String number){
    return ((number.equals("1")) || (number.equals("2")) || (number.equals("3")) || (number.equals("4")) || (number.equals("5")) || (number.equals("6")) || (number.equals("7")) || (number.equals("8")) ||(number.equals("9")) || (number.equals("10")));
    }

    public static boolean isRomanNumber(String number){
        return ((number.equals("I")) || (number.equals("II")) || (number.equals("III")) || (number.equals("IV")) || (number.equals("V")) || (number.equals("VI")) || (number.equals("VII")) || (number.equals("VIII")) ||(number.equals("IX")) || (number.equals("X")));
    }
}
