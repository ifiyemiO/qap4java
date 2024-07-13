// ****************************************************************
// ParseInts.java
//
// Reads a line of text and prints the integers in the line.  
//          
// ****************************************************************

import java.util.Scanner;

public class ParseInts
{
    public static void main(String[] args)
    {
	int val, sum=0;
	Scanner scan = new Scanner(System.in);
	String line;

    // user input prompt
	System.out.println("Enter a line of text");
	Scanner scanLine = new Scanner(scan.nextLine());

	// while (scanLine.hasNext())
	//     {		
	// 	val = Integer.parseInt(scanLine.next());
	// 	sum += val;
	//     }

    // try-catch block handling non-integer inputs
    try {
        //each token process in the line
        while (scanLine.hasNext()) {
            val = Integer.parseInt(scanLine.next());
            sum += val;
        }
    } catch (NumberFormatException e) {
        System.out.println("Not an integer: " + scanLine.next());
    }
    // prints sum of integers
	System.out.println("The sum of the integers on this line is " + sum);
    }

}

