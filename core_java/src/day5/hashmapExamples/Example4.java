package day5.hashmapExamples;

import java.util.*;
public class Example4 {

	public static void main(String[] args) {
		Map<String, String> mapOfStatesAndCities = new HashMap<String, String>();
		
		mapOfStatesAndCities.put("pune", "maharashtra");
		mapOfStatesAndCities.put("gandhinagar", "Gujarat");
		mapOfStatesAndCities.put("nagpur", "maharashtra");
		mapOfStatesAndCities.put("hyderabad", "telangana");
		
	//	System.out.println(mapOfStatesAndCities);
		Set<String> keysSet = mapOfStatesAndCities.keySet();
		Iterator<String> iter = keysSet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String state = mapOfStatesAndCities.get(key);
			System.out.println(state);
		}
		 
		
	}
}
