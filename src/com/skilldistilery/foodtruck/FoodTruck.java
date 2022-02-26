package com.skilldistilery.foodtruck;

public class FoodTruck {
	private double numericID;
	private String name;
	private String foodType;
	private double numericRating;
	private static int numberOfTrucks;

	public FoodTruck(String name, String foodType, double numericRating) {
		this.numericID = nextTruckID();
		this.name = name;
		this.foodType = foodType;
		this.numericRating = numericRating;

	}

	public FoodTruck() {

	}

	private double nextTruckID() {
		numberOfTrucks++;
		return numberOfTrucks;
	}

	public String getName() {
		return name;
	}

	public double getNumericRating() {
		return numericRating;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public void setNumericRating(double numericRating) {
		this.numericRating = numericRating;
	}

	public void listFoodTrucks(FoodTruck[] pod, int num) {
		// for each loop listing all the food trucks;
		for (int i = 0; i < num; i++) {
			System.out.println(pod[i].name);
		}
		System.out.println("\n");
	}

	public double averageRating(FoodTruck[] pod, int num) {
		// return average of all food trucks
		double average = 0;
		for (int i = 0; i < num; i++) {
			average += pod[i].numericRating;
		}
		average = average / num;

		return average;
	}

	public void highestRated(FoodTruck[] pod, int num) {
		FoodTruck mostHigh = new FoodTruck(null, null, 0.0);
		double highest = 0;
		for(int i = 0; i < num; i++) {
			if(pod[i].numericRating > highest) {
				highest = pod[i].numericRating;
				mostHigh.setName(pod[i].name);
				mostHigh.setFoodType(pod[i].foodType);
				mostHigh.setNumericRating(pod[i].numericRating);
			}
		}
		System.out.println("The Food Truck with the highest rating is: "+mostHigh.name);
		System.out.println("It's food type is: "+mostHigh.foodType);
		System.out.println("It's rating: "+mostHigh.numericRating);
	}
	
	public void printnumericID(FoodTruck[] pod, int num) {
		for(int i = 0; i <num; i++) {
			System.out.println(pod[i].numericID);
		}
	}

}
