 /*
@Author Hadiuzzaman
*/

// Find the number is positive, negetive or 0.


import java.util.Scanner;   // Scanner package
  
public class positive_negetive_number 
{

	public static void main(String[] args) {   // main method
		
		Scanner input = new Scanner(System.in);    // Scanner object
		System.out.print("Enter the number: ");
		float num = input.nextFloat();    // read user input
		
		if(num > 0) 
        {      // 1st condition
			System.out.println(num+" is Positive.");
		}
		else if(num < 0) 
        {   // 2nd condition
			System.out.println(num+" is Negetive.");
		}
		else 
        {             // last condition
			System.out.println(num+" is Zero.");
		}
	}

}