/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Paul Shannon
 */
package base;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class App
{
    //class scanner
    Scanner input = new Scanner(System.in);
    int counter = 0;

    public static void main(String[] args)
    {
        App converter = new App();

        //prompt for euro quantity
        float euros = converter.input();

        //prompt for exchange rate
        float exchangeRate = converter.input();

        //compute
        float usd = converter.convert(euros, exchangeRate);

        //output
        converter.output(euros, exchangeRate, usd);
    }

    public float input()
    {
        //prompt for euro input
        if(counter == 0)
        {
            System.out.print("How many euros are you exchanging? ");
            counter ++;
            return input.nextFloat();
        }

        //prompt for next input, exchange rate
        else
        {
            System.out.print("What is the exchange rate? ");
            counter --;
            return input.nextFloat();
        }
    }

    public float convert(float euros, float conversion)
    {
        return euros * conversion;
    }

    public void output(float euros, float exchangeRate, float usd)
    {
        //round to penny using the decimal format
        NumberFormat nf = new DecimalFormat("####0.00");
        System.out.println(euros + " euros at an exchange rate of " + exchangeRate + " is\n" + nf.format(usd) + " U.S. dollars");
    }

}
