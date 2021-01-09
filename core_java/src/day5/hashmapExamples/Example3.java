package day5.hashmapExamples;
import java.util.*;
public class Example3 {
// will use Iterator to iterate over the keySet
	public static void main(String[] args) {
		
		Map<Integer, String> mapOfCities = new HashMap<Integer, String>();
		
		mapOfCities.put(10, "Pune");
		mapOfCities.put(13, "Mumbai");
		mapOfCities.put(83, "Sydney");
		mapOfCities.put(5, "Melbourne");
		mapOfCities.put(23, "Delhi");
		
	//	System.out.println(mapOfCities);
		
		Set<Integer> keysSet = mapOfCities.keySet();
		Iterator<Integer> iter = keysSet.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			String city = mapOfCities.get(key);
			System.out.println(city);
		}
		
		
	}
}
