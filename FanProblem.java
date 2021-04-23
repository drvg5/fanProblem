package com.amz.linkedLists;

import java.util.Scanner;

public class FanProblem {

	public static void main(String[] args) {

		/*
		 * MENU
		 */
		System.out.println();
		System.out.println("FAN OPERATION MENU. PULL CORD TO INITIATE");
		System.out.println("TO REGULATE FAN SPEED.....PRESS 7");
		System.out.println("TO REGULATE FAN DIRECTION.....PRESS 8");
		System.out.println("TO EXIT.....ENTER ANY NUMBER");
		System.out.println();

		/*
		 * We will assume that the initial state is: 
		 * 
		 * 1. Fan speed - 0 
		 * 2. Fan state - OFF
		 * 3. Fan direction - straight
		 * 
		 */
		Fan fanObj = new Fan(0, false, true);

		currentFanState(fanObj);

		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();

		while (choice == 7 || choice == 8) {
			
			if (choice == 7) {
				increaseSpeed(fanObj);
			} else if (choice == 8) {
				changeDirection(fanObj);
			}
			
			System.out.println("TO REGULATE FAN SPEED.....PRESS 7");
			System.out.println("TO REGULATE FAN DIRECTION.....PRESS 8");
			System.out.println("TO EXIT.....ENTER ANY NUMBER");
			choice = sc.nextInt();
		}
		
		System.out.println("HAVE A NICE DAY");
		sc.close();

	}
	
	/*
	 * method to display the fan's current state
	 */
	private static void currentFanState(Fan fanObj) {

		System.out.println();
		System.out.println("CURRENT FAN STATE");
		System.out.println();

		if (fanObj.isFanStatus()) {
			System.out.println("FAN ON");
		} else {
			System.out.println("FAN OFF");
		}

		System.out.print("FAN SPEED - ");
		System.out.println(fanObj.getSpeed());

		if (fanObj.isFanDirection()) {
			System.out.println("FAN DIRECTION -> CLOCKWISE");
		} else {
			System.out.println("FAN DIRECTION -> ANTI-CLOCKWISE");
		}
		System.out.println();

	}
	
	/*
	 * method to update Fan direction
	 */
	private static void changeDirection(Fan fanObj) {

		if (fanObj.isFanDirection()) {
			fanObj.setFanDirection(false);
		} else {
			fanObj.setFanDirection(true);
		}

		System.out.println();
		System.out.println("STATE UPDATED");
		currentFanState(fanObj);

	}
	
	/*
	 * method to update Fan speed
	 */
	private static void increaseSpeed(Fan fanObj) {

		if (fanObj.getNoOfPulls() == 3) {
			fanObj.setSpeed(0);
			fanObj.setFanStatus(false);
			fanObj.setNoOfPulls(0);
		} else {
			fanObj.setNoOfPulls(fanObj.getNoOfPulls() + 1);
			fanObj.setSpeed(fanObj.getNoOfPulls());
			fanObj.setFanStatus(true);
		}

		System.out.println();
		System.out.println("STATE UPDATED");
		currentFanState(fanObj);

	}

}
