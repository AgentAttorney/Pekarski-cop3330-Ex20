package Ex20;
import java.util.Scanner;
 
/*

   UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Richard Pekarski

    I'm not sure of the specific way we format currency, have been
    having issues on multiple exercises with the rounding
    Will look further into under less stringent time constraints.

 */
public class Example20 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Citizen citizen_1 = new Citizen();

        System.out.print("What is your total? ");
        citizen_1.setPrincipal(input.nextDouble());

        System.out.print("What state do you live in? ");
        citizen_1.setState(input.next());

        if((citizen_1.getState()).equals("WI") || (citizen_1.getState()).equals("Wisconsin"))
        {
            // case 1 WI
            System.out.print("What county are you from? ");
            citizen_1.setCounty(input.next());
            if((citizen_1.getCounty()).equals("Eau Claire"))
            {
                citizen_1.getFinal(4);
            }
            else if((citizen_1.getCounty()).equals("Dunn"))
            {
                citizen_1.getFinal(5);
            }
            else
            {
                citizen_1.getFinal(6);
            }
        }
        else if((citizen_1.getState()).equals("IL") || (citizen_1.getState()).equals("Illinois"))
        {
            // case 2 8% flat tax IL
            citizen_1.getFinal(2);
            // System.out.print("You're from Illinois, meaning your total is ");
        }
        else
        {
            // case 3 other states
            System.out.print("No Taxes Required: Your total is " + citizen_1.getPrincipal());
        }
    }
}
