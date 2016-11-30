

public class UserInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boolean isQuit = false;
		int option = 0;
		MovieList list = new MovieList();
		while(!isQuit)
		{
			option=userInterface();
			if(option == 1){
				list.insert(option1());
				System.out.println("Your movie has been successfully added into the list.");
				returnMainMenu();
			}
			else if(option == 2){
				///option2(list);
				TextIO.putln("Remove success");
				returnMainMenu();
			}
			else if(option == 3){
				//option3(list);
				returnMainMenu();
			}
			else if(option == 4){
				//option4(list);
				returnMainMenu();
			}
			else if(option == 5){
				//option5(list);
				returnMainMenu();
			}
			else if(option == 6){
				//option6(list);
				returnMainMenu();
			}
			else if(option == 7){
				returnMainMenu();
			}
			else
			{
				String quit="";
				TextIO.putln("Are you sure you want to quit? - all your data will be lost.");
				while(!quit.equalsIgnoreCase("Y") && !quit.equalsIgnoreCase("N"))
				{
					TextIO.putln("Press Y to quit, and press N to stay here!");
					quit=TextIO.getlnString();
				}
				if(quit.equalsIgnoreCase("Y"))
				{
					isQuit=true;
				}
				else
				{
					isQuit=false;
				}
			}
		}
	}
	
	public static void returnMainMenu()
	{
		TextIO.putln("Return the main menu, hit return!!");
		String temp=" ";
		while(!temp.equals(""))
		{
			temp=TextIO.getln();
		}
	}
	
	public static int userInterface()
	{
		int option=0;
		while(option==0)
		{
			System.out.println("Welcome to the Movie Rating App! Select an option below:");
			System.out.println();
			System.out.println("1) add a movie");
			System.out.println("2) remove a movie");
			System.out.println("3) display movies alphabetically");
			System.out.println("4) display movies >= a certain rating");
			System.out.println("5) display movies in a specified genere");
			System.out.println("6) list all movies with a specified actor/actress");
			System.out.println("7) list all movies that the user has yet to see");
			System.out.println("8) quit");
			System.out.println();
			System.out.println("Select an option above:");
			option=TextIO.getlnInt();
			if(option<0 || option>8)
			{
				System.out.println("Please enter a valid option number(must be between 1 and 7!!!)");
				option=0;
			}
		}
		return option;
	}

	public static Movie option1()
	{
		String workLocation="", workoutBuddy="";
		double milesCovered=0;
		//Date startingTime, endingTime;
		long duration;
		int rating=0;
		while(workLocation=="")
		{
			TextIO.putln("Please enter a workout location! After entering, press ENTER!");
			workLocation=TextIO.getlnString();
		}
		TextIO.putln("Please enter a workout buddy! After entering, press ENTER! (If you are working out yourself, just press ENTER!)");
		workoutBuddy=TextIO.getlnString();
		if(workoutBuddy=="")
		{
			workoutBuddy=null;
		}
		while(milesCovered==0)
		{
			TextIO.putln("Please enter the miles you have covered! After entering, press ENTER!");
			milesCovered=TextIO.getlnDouble();
		}
		TextIO.putln("Hit return to start workout!!");
		String temp="  ";
		while(!temp.equals(""))
		{
			temp=TextIO.getln();
		}
		TextIO.putln("Start working now!!\n");
		temp=" ";
		//startingTime=new Date();
		TextIO.putln("Hit return to end workout!!");
		while(!temp.equals(""))
		{
			temp=TextIO.getln();
		}
		TextIO.putln("End working now!!\n");
		//endingTime=new Date();
		//duration=endingTime.getTime()-startingTime.getTime();
		while(rating<=0 || rating>10)
		{
			TextIO.putln("Provide a rating to workout! (1: great; 10: poor) After entering, press ENTER!");
			rating=TextIO.getlnInt();
		}
		//Workout event=new Workout(workLocation, milesCovered, startingTime, duration, rating, workoutBuddy);
		return null;
	}
/*
	public static void option2(WorkoutList list)
	{
		int tempOption=0;
		System.out.println("Here is all the workouts in the list. Which one do you want to remove?");
		option3(list);
		tempOption=TextIO.getlnInt();
		while(tempOption<1 || tempOption>WorkoutList.number-1)
		{
			System.out.println("Please choose an existing workout! Choose again please!!");
			tempOption=TextIO.getlnInt();
		}
		list.removeWorkout(tempOption);
	}
	
	public static void option3(WorkoutList list)
	{
		list.getNext().sortByTime();
		list.getNext().printList();
	}
	
	public static void option4(WorkoutList list)
	{
		String name="";
		TextIO.putln("Who do you want to search for?");
		name=TextIO.getlnString();
		if(!list.getNext().printBuddyList(name, false))
		{
			TextIO.putln("Sorry, you haven't worked with " + name + " yet.");
		}
	}
	
	public static void option5(WorkoutList list)
	{
		String location="";
		TextIO.putln("Where do you want to search for?");
		location=TextIO.getlnString();
		list.getNext().sortByRating();
		if(!list.getNext().printLocationList(location, false))
		{
			TextIO.putln("Sorry, you haven't worked at " + location + " yet.");
		}
		list.getNext().sortByTime();
	}
	
	public static void option6(WorkoutList list)
	{
		double mileage=0;
		TextIO.putln("Where do you want to search for your best rating?");
		mileage=TextIO.getlnDouble();
		list.getNext().sortByRating();
		if(list.getNext().searchForMileage(mileage)==null)
		{
			TextIO.putln("Sorry, there is no workout at such mileage!!");
		}
		else
		{
			System.out.println(list.getNext().searchForMileage(mileage));
		}
		list.getNext().sortByTime();
	}
*/
}
