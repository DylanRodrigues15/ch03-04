package ch3;
import java.util.Scanner;
/**
 * Feb. 2, 2019
 * @author Dylan Rodrigues
 * This program simulates an elevator panel that skips the 13th floor
 */

public class ElevationSimulation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Floor: ");
		int floor = in.nextInt();
		
		int actualFloor;
		if (floor > 13)
		{
			actualFloor = floor - 1;
		}
		else
		{
			actualFloor = floor;
		}
		System.out.println("The elevator will travel to: " + actualFloor);
		
	}

}
