package ClassWork;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The prime factors of 13195 are 5, 7, 13 and 29.

		What is the largest prime factor of the number 600851475143 ?*/
		
		Scanner sc=new Scanner(System.in);
		//int a=0,z=0;
		long x=sc.nextLong();
		for(int i=2;i<x;i++) {
			 
			        while(x % i==0)
			        {//for yes
			            x=x/i;

			        }   

			    }
			    System.out.println(x);
			}
		
	}


