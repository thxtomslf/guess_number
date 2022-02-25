package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // 2147483647 -2147483648

        long right_border = 2147483648L;
        long left_border = -2147483649L;
        long hidden_number = 0;
        String input_sign = "";

        for (byte i = 1; i < 34; ++i) {
            System.out.printf("Try: %d\n", i);
            System.out.printf("Is your number %d?\n", hidden_number);

            input_sign = input.nextLine();

            if (input_sign.equals(">")) {
                left_border = hidden_number;
                hidden_number = left_border + (right_border - left_border) / 2;

            } else if (input_sign.equals("<")) {
                right_border = hidden_number;
                hidden_number = left_border + (right_border - left_border) / 2;

            } else if (input_sign.equals("==")) {
                System.out.printf("Great! Your number is %d.\n", hidden_number);
                input_sign = null;
                break;

            } else {
                System.out.println("Incorrect input, try again.");
                --i;
            }
        }
        if (input_sign != null) {
            System.out.println("Well, I tried my best...");
        }

    }
}

