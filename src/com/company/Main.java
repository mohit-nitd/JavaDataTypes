package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxvalue = Integer.MAX_VALUE;
        System.out.println("min value" + " " + myMinValue);
        System.out.println("max value" + " " + myMaxvalue);
        System.out.println("Busted Value max" + " " + (myMaxvalue + 1));
        System.out.println("Busted Value min" + " " + (myMinValue - 1));


    }
}
