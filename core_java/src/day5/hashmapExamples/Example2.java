package day5.hashmapExamples;

import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		Map<String, String> mapOfStatesAndCities = new HashMap<String, String>();
		
		mapOfStatesAndCities.put("pune", "maharashtra");
		mapOfStatesAndCities.put("gandhinagar", "Gujarat");
		mapOfStatesAndCities.put("nagpur", "maharashtra");
		mapOfStatesAndCities.put("hyderabad", "telangana");
		
	//	System.out.println(mapOfStatesAndCities);
		Set<String> keysSet = mapOfStatesAndCities.keySet();
		for(String x:keysSet) {
			String state = mapOfStatesAndCities.get(x);
			System.out.println(state);
		}
		 
		
	}
}
