package com.zastavna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How much does a phone call cost per minute in your country? ");
        double c1 = Double.parseDouble(br.readLine());
        System.out.println("How many minutes the talk continued? ");
        double t1 = Double.parseDouble(br.readLine());

        System.out.println("How much does a phone call cost per minute in your country? ");
        double c2 = Double.parseDouble(br.readLine());
        System.out.println("How many minutes the talk continued? ");
        double t2 = Double.parseDouble(br.readLine());

        System.out.println("How much does a phone call cost per minute in your country? ");
        double c3 = Double.parseDouble(br.readLine());
        System.out.println("How many minutes the talk continued? ");
        double t3 = Double.parseDouble(br.readLine());

        double  price1 = c1 * t1;
        System.out.println("The first call costs: " + price1);
        double  price2 = c2 * t2;
        System.out.println("The second call costs: " + price2);
        double  price3 = c3 * t3;
        System.out.println("The third call costs: " + price3);

        double total_price = price1 + price2 + price3;
        System.out.println("All calls cost: " + total_price);
    }
}
