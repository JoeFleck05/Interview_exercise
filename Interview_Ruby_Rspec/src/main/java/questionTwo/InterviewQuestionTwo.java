/*
Exercise Two:
A = [ brad, mark, jerry, steve, zack, kate, brad ... steve ]

How would you produce a list of names and the number of occurrences of the name in the array?

The list should be ordered by the number of occurrences.

Example answer :
brad    1242
steve    999
zack    21
kate    10
mark    9
...
jerry    1
*/
package questionTwo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class InterviewQuestionTwo {

	public ArrayList<String> exerciseTwo(String[] namesArray) {
		
		// Return String Array
		ArrayList<String> frequencyNamesArray = new ArrayList<String>();
//		String[] frequencyNamesArray = null;
		// Sort incoming array of names
		Arrays.sort(namesArray);
		
//		Set<String> uniqNames = new TreeSet<String>();
//		uniqNames.addAll(Arrays.asList(namesArray));
//		
//		ArrayList listNames = new ArrayList<String>(uniqNames);
		
//		setNameNCount(namesArray);
		
		// Create Map
		HashMap<String, Integer> freqMap = new HashMap<String, Integer>();
//		
//		// Loop thru String Array and add to HashMap with count as Value
//		for(String s : namesArray){
//			if( freqMap.containsKey(s) ) {
//				freqMap.put(s, freqMap.get(s) + 1);
//			} else {
//				freqMap.put(s, 1);
//			}
//		}
		
		Map<Integer, String> wordCounts = new TreeMap<>();
		for(String s : namesArray){
			if( wordCounts.containsValue(s) ) {
				wordCounts.put(freqMap.get(s) + 1,s);
//				int fu = Integer.parseInt(wordCounts.get(s));
//				wordCounts.put(fu + 1,s);
			} else {
				wordCounts.put(1, s);
			}
		}
		
		// Set Keys in new Array
		ArrayList<Integer> keyWordArray = new ArrayList<Integer>(wordCounts.keySet());
		// Sort keyArray
		Collections.reverse(keyWordArray);
		// Create Empty ArrayList
//		ArrayList<String> valueWordArray = new ArrayList<String>();
		for(Integer wArray : keyWordArray) {
			frequencyNamesArray.add(wordCounts.get(wArray) + "<>" + wArray);
		}
		
		
		
//		// Set Keys in new Array
//		ArrayList<String> keyArray = new ArrayList<String>(freqMap.keySet());
//		// Sort keyArray
//		Collections.sort(keyArray);
//		// Create Empty ArrayList
//		ArrayList<String> valueArray = new ArrayList<String>();
//		for(String kArray : keyArray) {
//			valueArray.add(freqMap.get(kArray) + "<>" + kArray);
//	//					valueArray.add(kArray + "<>" + freqMap.get(kArray).toString());
//		}
//		
//		ArrayList<Integer> bArr = new ArrayList<Integer>();
//		
//		for(String v : valueArray) {
//			String[] vA = v.split("<>");
//			int b = Integer.parseInt(vA[0]);
//			bArr.add(b);
//		}
//		
//		Collections.reverse(bArr);
//		// reverse order valueArray ArrayList
//		Collections.reverse(valueArray);
//		// number place holder
//		int number = 0;
//		frequencyNamesArray = new String[valueArray.size()];
//		
//		for(int i = valueArray.size() - 1 ; i >= 0 ; --i) {
//			frequencyNamesArray[number] = valueArray.get(i);
//			++ number;
//		}
		return frequencyNamesArray;		
	}
	
	private static Map<Integer, String> setNameNCount(String[] namesArray) {
		Map<Integer, String> returnNamesWithCount = new HashMap<Integer, String>();
		Integer keyV = null;
		// Loop thru String Array and add to HashMap with count as Value
		for(String s : namesArray){
			if( returnNamesWithCount.containsValue(s) ) {
				keyV = Integer.parseInt(returnNamesWithCount.get(s));
				returnNamesWithCount.put(keyV + 1,s);
			} else {
				returnNamesWithCount.put(1, s);
			}
		}
		
		return returnNamesWithCount;
		
	}
}
