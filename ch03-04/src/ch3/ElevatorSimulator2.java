package ch3;

import java.util.Scanner;
/**
 * Feb. 2, 2019
 * @author Dylan Rodrigues
 * This program simulates an elevator panel that skips the 13th floor, 
 * checking for input errors
 */

public class ElevatorSimulator2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Floor: ");
		if (in.hasNextInt())
		{
			// Now we know the user has entered an integer
			int floor = in.nextInt();
		
			if (floor == 13)
			{
				System.out.println("Error: there is no thirteenth floor.");
			}
			else if (floor <= 0 || floor > 20)
			{
				System.out.println("The floor must be between 0 and 20.");
			}
			else
			{
				int actualFloor;
				if (floor > 13)
				{
					actualFloor = floor - 1;
				}
				else
				{
					actualFloor = floor;
				}
				System.out.println("The elevator will travel to the actual floor " + actualFloor);
			}
		}
		
		else
			
		{
			System.out.println("Error: not an integer.");
		}

		
	}

}
