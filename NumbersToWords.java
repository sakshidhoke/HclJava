package ClassWork;

import java.util.Scanner;

public class NumbersToWords {
	public static void main(String[] args) {
        // Returns the length of the numbers between 0 and 99
        	
        	int n=59;
        	 int result=0;
        	 NumbersToWords o=new NumbersToWords();
        	 result=o.function(n);
        	 System.out.println(result);
	}
       public static int function(int n) {

          
        
	 
		// TODO Auto-generated method stub

	int[] prop = {
		              0,
		              "one".length(),
		              "two".length(),
		              "three".length(),
		              "four".length(),
		              "five".length(),
		              "six".length(),
		              "seven".length(),
		              "eight".length(),
		              "nine".length(),
		              "ten".length(),
		              "eleven".length(),
		              "twelve".length(),
		              "thirteen".length(),
		              "fourteen".length(),
		              "fifteen".length(),
		              "sixteen".length(),
		              "seventeen".length(),
		              "eighteen".length(),
		              "nineteen".length()
	 };

		            // tenth prefixes
		         int[] ten = {
		              "twenty".length(),
		              "thirty".length(),
		              "forty".length(),
		              "fifty".length(),
		              "sixty".length(),
		              "seventy".length(),
		              "eighty".length(),
		              "ninety".length()
		              };
		         
		         if (n < 20) {
		             return prop[n];
		             }
		         else {
		           return ten[n / 10 - 2 | 0] + prop[n % 10];
		           }
		            
	
       }
}

