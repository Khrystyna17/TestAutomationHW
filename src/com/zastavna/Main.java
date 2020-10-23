package com.zastavna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the radius: ");
        Double radius = Double.parseDouble(br.readLine());
        Double perimeter = 2.0 * Math.PI * radius;
        Double area = Math.PI * radius * radius;
        System.out.println("The perimeter of the flower bed is " + perimeter);
        System.out.println("The area of the flower bed is " + area);
    }
}

