package org.mohran;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchException {


    public static void main(String[] args) {

        Integer num1 , num2 ;

        num1 = takeInputAndEnsureTheMatchType() ;
        num2 = takeInputAndEnsureTheMatchType() ;

        System.out.println("the sum : "+ (num1 + num2));
    }

    private static Integer takeInputAndEnsureTheMatchType() {

        Scanner scan = new Scanner(System.in);

        Integer theNumber = 0;

        boolean validType = false;

        while(!validType)
        {
            try
            {

                System.out.println("enter the number : ");
                theNumber = scan.nextInt();
                validType = true;
            }
            catch (InputMismatchException ex)
            {

                System.out.println("Wrong input plz enter valid  integer number !!?");
            }
        }
        return  theNumber;
    }


}
