package org.example;
import java.util.Scanner;

import static org.example.NumberIdentifier.isArabicNumber;
import static org.example.NumberIdentifier.isRomanNumber;
import static org.example.Translation.ArabicToRoman;
import static org.example.Translation.RomanToArabic;

public class Main {
    public static void main(String[] args) {

        System.out.println("Лабораторная работа 1");
        Scanner console1 = new Scanner(System.in);
        System.out.print("\nВведите арифметическое выражение:  ");
        String strokaOtPolzovatelya = console1.nextLine();
        String [] massiveIsStroki = new String[3];
        char typeOfOperation = 0;
        if (strokaOtPolzovatelya.contains("+")){
            massiveIsStroki = strokaOtPolzovatelya.split("\\+");
            typeOfOperation = '+';
        } else if (strokaOtPolzovatelya.contains("-")){
            massiveIsStroki = strokaOtPolzovatelya.split("-");
            typeOfOperation = '-';
        } else if (strokaOtPolzovatelya.contains("*")){
            massiveIsStroki = strokaOtPolzovatelya.split("\\*");
            typeOfOperation = '*';
        } else if (strokaOtPolzovatelya.contains("/")) {
            massiveIsStroki = strokaOtPolzovatelya.split("/");
            typeOfOperation = '/';
        }

        String number1 = massiveIsStroki[0];
        String number2 = massiveIsStroki[1];


        if (isArabicNumber(number1) & isArabicNumber(number2)) {

            if (typeOfOperation == '+') {
                ArabicCalcs result = new ArabicCalcs(number1, number2);
                System.out.println(number1 + "+" + number2 + "=" + result.addition());

            } else if (typeOfOperation == '-') {
                if (Integer.parseInt(number2) >= Integer.parseInt(number1)){
                    System.out.println("Неположительный результат");
                } else {
                    ArabicCalcs result = new ArabicCalcs(number1, number2);
                    System.out.println(number1 + "-" + number2 + "=" + result.subtraction());
                }

            } else if (typeOfOperation == '*') {
                ArabicCalcs result = new ArabicCalcs(number1, number2);
                System.out.println(number1 + "*" + number2 + "=" + result.multiplication());

            } else if (typeOfOperation == '/') {
                ArabicCalcs result = new ArabicCalcs(number1, number2);
                System.out.println(number1 + "/" + number2 + "=" + result.division());
            }


        } else if (isRomanNumber(number1) & isRomanNumber(number2)) {

            if (typeOfOperation == '+') {
                RomanCalcs result = new RomanCalcs(number1, number2);
                System.out.println(number1 + "+" + number2 + "=" + ArabicToRoman(result.addition()));

            } else if (typeOfOperation == '-') {
                if (RomanToArabic(number2) >= RomanToArabic(number1)) {
                    System.out.println("Неположительный результат");
                } else {
                    RomanCalcs result = new RomanCalcs(number1, number2);
                    System.out.println(number1 + "-" + number2 + "=" + ArabicToRoman(result.subtraction()));
                }

            } else if (typeOfOperation == '*') {
                RomanCalcs result = new RomanCalcs(number1, number2);
                System.out.println(number1 + "*" + number2 + "=" + ArabicToRoman(result.multiplication()));

            } else if (typeOfOperation == '/') {
                RomanCalcs result = new RomanCalcs(number1, number2);
                System.out.println(number1 + "/" + number2 + "=" + ArabicToRoman(result.division()));
            }

        } else {
            System.out.println("Неверный формат чисел");
        }
    }
}