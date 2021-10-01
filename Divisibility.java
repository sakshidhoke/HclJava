package ClassWork;
import java.util.Scanner;
//import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.printf("Enter i Value:  ");
        long n = in.nextLong();
        long number = n;                 //6    
        long largestPrimeFactor = n;
        long i = 2;
        while (i <= n && n != 1) {     //2<=6   6!=1            //2<=3  3!=1
            if (n % i == 0) {            //6%2==0                 3%3==0
                n = n / i;                   // 6/2=3   n=3        3/3=1   n=1
                largestPrimeFactor = i;           //i=2            i=3
            }
            else {
                i = i+1;
            }
        }
        System.out.println("The largest prime factor of the number "+ number + " is = "+ largestPrimeFactor);
	}}
			
			
			
			
			
			

