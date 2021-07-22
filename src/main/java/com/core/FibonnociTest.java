package com.core;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FibonnociTest {

    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a  number:");
      int firstNum = scanner.nextInt();
       int res = factorial(firstNum);
       scanner.close();
         System.out.println("factorial of number ="+res);
    }
    
    static int factorial(int number) {

        if(number == 0) {

               return 1;

            }

            return factorial_i(number, 1);

    }



    static int factorial_i(int currentNumber, int sum) {

        if(currentNumber == 1) {

            return sum;

        } else {

            return factorial_i(currentNumber - 1, sum*currentNumber);

        }

    }
  
}
