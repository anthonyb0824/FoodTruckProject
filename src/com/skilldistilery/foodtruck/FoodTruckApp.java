package com.skilldistilery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		FoodTruck[] pod = new FoodTruck[5];
		String name;
		String foodType;
		double rating;
		int foodTrucksCreated = 0;
		boolean keepGoing = true;		
		
		System.out.println("Please enter up to five food trucks!");
		while (keepGoing) {
			if(foodTrucksCreated != 5) {
				//if foodTrucksCreated is != 5 break out this loop
				// Get Food Truck name
				System.out.println("Enter food truck name: ");
				name = kb.next();
				// Test if the name entered was quit
				if ((name.toLowerCase()).equals("quit")) {
					keepGoing = false;
					break;
				} else {
					// Ask for food type
					System.out.println("Enter food type: ");
					foodType = kb.next();
					// Ask for rating
					System.out.println("Enter your rating: ");
					rating = kb.nextDouble();
					// create FoodTruck Object
					FoodTruck FT = new FoodTruck(name, foodType, rating);
					// place new Food Truck into pod array
					pod[foodTrucksCreated] = FT;
					foodTrucksCreated++;
				}
			}
			else {
				keepGoing = false;
				break;
			}
		}
		
		boolean quitMenu = true;
		while (quitMenu) {
			FoodTruck general = new FoodTruck();
			
			System.out.println("1. List all exsiting food trucks.");
			System.out.println("2. See the average rating of all food trucks.");
			System.out.println("3. Display the highest-rated food truck.");
			System.out.println("4. Quit the pogram.\n");
			String choice = kb.next();
			
			switch(choice) {
			case "1":
			case "1.":
			case "list":
			case "list all existing food trucks":
			case "list all":
				general.listFoodTrucks(pod, foodTrucksCreated);
				break;
			case"2":
			case"2.":
			case"see the average rating of all food trucks":
				rating = general.averageRating(pod,foodTrucksCreated);
				System.out.println("The avaerge rating is: "+rating);
				break;
			case "3":
			case "3.":
			case "display the highest-rated of all food trucks":
			case "highest-rated":
				general.highestRated(pod, foodTrucksCreated);
				break;
			case "4":
			case "4.":
			case "quit":
			case "exit":
				quitMenu = false;
				break;
			}
		}
		kb.close();
	}

}
