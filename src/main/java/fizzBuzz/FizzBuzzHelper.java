package fizzBuzz;

public class FizzBuzzHelper {
	
	public boolean containsThree(int initialValue){
		String value = Integer.toString(initialValue);
		String[] valueArray = value.split("");
		for(int currentIndex = 0; currentIndex < valueArray.length; currentIndex++){
			if(Integer.parseInt(valueArray[currentIndex]) == 3){
				return true;
			}
		}
		return false;
	}
}
