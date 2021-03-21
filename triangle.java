package com.company;

import java.util.Scanner;

class triangle {
    public static void main(String[] args) {
        System.out.println("Right triangle with legs a and b the hypotenus c");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a");
        double a = myObj.nextDouble();
        System.out.println("Enter b");
        double b = myObj.nextDouble();
        System.out.println("Enter c");
        double c = myObj.nextDouble();
        double P = (a+b+c);
        double A = a*b/2;
        System.out.println("Perimeter=" + P);
        System.out.println("Area=" + A);
