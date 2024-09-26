package org.example;

public class ArabicCalcs extends Calculations{
    private String number1;
    private String number2;

    public ArabicCalcs(String number1, String number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int addition() {
        return (Integer.parseInt(number1) + Integer.parseInt(number2));
    }

    @Override
    public int subtraction() {
        return (Integer.parseInt(number1) - Integer.parseInt(number2));
    }

    @Override
    public int multiplication() {
        return (Integer.parseInt(number1) * Integer.parseInt(number2));
    }

    @Override
    public int division() {
        return (Integer.parseInt(number1) / Integer.parseInt(number2));
    }
}
