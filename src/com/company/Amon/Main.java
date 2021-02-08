/*
Benton Amon
2-7-2021
Converts an entered Fahrenheit value into Celsius and displays the conversion
 */

package com.company.Amon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Define
        double tempf = 0;
        double tempc;

        // Loop
        do {
            tempf = getTempf();

            if (tempf != -460) {
                tempc = convert(tempf);
                display(tempc);
            }

        } while (tempf != -460);
    }



    // Functions

    static double getTempf() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a degree in Fahrenheit or enter '-460' to exit: ");
        double tempf = input.nextDouble();
        return tempf;
    }

    static double convert(double tempf) {
        double tempc = (tempf - 32.0) * (5.0 / 9.0);
        return tempc;
    }

    static void display(double tempc) {
        System.out.printf("Your degree in Celsius is: %.2f \n", tempc);
    }

}
