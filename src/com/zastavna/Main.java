package com.zastavna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        double a,
               b,
               c;
        double x,
               y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of the first side of a hole: ");
        x = Double.parseDouble(br.readLine());
        System.out.println("Enter the length of the second side of a hole: ");
        y = Double.parseDouble(br.readLine());

        System.out.println("Enter the length of the first side of a brick: ");
        a = Double.parseDouble(br.readLine());
        System.out.println("Enter the length of the second side of a brick: ");
        b = Double.parseDouble(br.readLine());
        System.out.println("Enter the length of the third side of a brick: ");
        c = Double.parseDouble(br.readLine());

        if ( a <= x && b <= y ) {
            System.out.println("The brick will go in the hole");
        } else if  ( a <= x && c <= y) {
            System.out.println("The brick will go in the hole");
        } else if  ( b <= x && c <= y) {
            System.out.println("The brick will go in the hole");
        } else if  ( b <= x && a <= y) {
            System.out.println("The brick will go in the hole");
        } else if  ( c <= x && a <= y) {
            System.out.println("The brick will go in the hole");
        } else if  ( c <= x && b <= y) {
            System.out.println("The brick will go in the hole");
        } else {
            System.out.println("The brick won`t go in the hole");
        }
    }
}