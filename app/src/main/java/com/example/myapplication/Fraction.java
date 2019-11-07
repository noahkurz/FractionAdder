package com.example.myapplication;

public class Fraction {//fields - variables associated with a class
    //fraction 1
    int numerator;
    int denominator;


    //constructor
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction f)
    {
        int commonDenom = this.multiplyDenom(this.denominator, f.denominator);
        int num1 = this.numerator * f.denominator;
        int num2 = this.denominator * f.numerator;
        return new Fraction(num1 + num2, commonDenom);
    }


    private int stringToInt(String dec) {
        int sum = 0;
        int place = 1;
        String map = "0123456789";
        for (int i = dec.length() - 1; i >= 0; i = i - 1) {
            sum = sum + (place * map.indexOf(dec.charAt(i)));
            place = place * 10;
        }
        return sum;
    }

    //this overrides the default toString method we inherited
    //from the Object class and allows us to do our own thing
    //historic function - returns a value
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }


    private int multiplyDenom(int denom1, int denom2) {


        int commonDenom = denom1 * denom2;
        return commonDenom;
    }

    private int addNumer(int numer1, int numer2) {
        int newNumer = 0;

        newNumer = numer1 + numer2;

        return newNumer;
    }
}
