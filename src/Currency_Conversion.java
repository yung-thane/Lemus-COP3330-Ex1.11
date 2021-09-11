/*
 *  UCF COP3330 Fall 2021 Assignment 1.11 Solution
 *  Copyright 2021 Ronald Lemus
 */


import java.util.Scanner;

public class Currency_Conversion {
    public static void main(String[] arg){
        System.out.print("How many euros are you exchanging? ");
        Scanner euroInp = new Scanner(System.in);
        int euros = euroInp.nextInt();

        System.out.print("What is the exchange rate? ");
        Scanner rateInp = new Scanner(System.in);
        double rate = rateInp.nextDouble();

        double dollars = euros * rate;

        System.out.printf("%d euros at an exchange rate of %.4f is\n%.2f U.S. dollars.",euros, rate,dollars);

    }
}
