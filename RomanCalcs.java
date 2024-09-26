package org.example;

import static org.example.Translation.RomanToArabic;

public class RomanCalcs extends Calculations{
    private String number1;
    private String number2;

    public RomanCalcs(String number1, String number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int addition() {
        return (RomanToArabic(number1) + RomanToArabic(number2));
    }

    @Override
    public int subtraction() {
        return (RomanToArabic(number1) - RomanToArabic(number2));
    }

    @Override
    public int multiplication() {
        return (RomanToArabic(number1) * RomanToArabic(number2));
    }

    @Override
    public int division() {
        return (RomanToArabic(number1) / RomanToArabic(number2));
    }
}