package fizzBuzz;

import org.joda.time.LocalTime;

public class FizzBuzz {
	private static FizzBuzzHelper helper = new FizzBuzzHelper();
	
	public static void main(String[] args) {
		helper = new FizzBuzzHelper();
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		String printString = "";
		for(int currentIndex = start; currentIndex < end + 1; currentIndex++){
			if(helper.containsThree(currentIndex)){
				printString += " lucky";
			}
			else if(currentIndex%15 == 0)
			{
				printString += " fizzBuzz";
			}
			else if(currentIndex%5 == 0)
			{
				printString += " buzz";
			}
			else if(currentIndex%3 == 0)
			{
				printString += " fizz";
			}
			else
			{
				printString += " " + currentIndex;
			}
		}
		System.out.println(printString);
    }
}
