package questionTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ExerciseTwo {
	
	public ArrayList<String> getCountOfNames(String[] names) {
		List<String> nameList = new ArrayList<>(Arrays.asList(names));
		Set<String> uniqueNames = new HashSet<String>(nameList);
		List<String> listOfNames = new ArrayList<String>(uniqueNames);
		List<String> tempListNamedCount = new ArrayList<String>(listOfNames.size());
		
		for(String listName : listOfNames) {
			int counter = 0;
			for(String name : names) {
				if(listName.contains(name)) {
					++counter;
				}
			}
			tempListNamedCount.add(listName + " " + counter);
		}
		
//		Integer[] tempNumber = new Integer[tempListNamedCount.size()];
		Integer[] tempNumber = new Integer[tempListNamedCount.size()];
		int anotherCounter = 0;
		
		for(String l : tempListNamedCount){
			Integer n = Integer.parseInt(l.split(" ")[1]);
			tempNumber[anotherCounter] = n;
			++anotherCounter;
		}
		
		Arrays.sort(tempNumber, Collections.reverseOrder());
		List<Integer> workableNumbersList = Arrays.asList(tempNumber);
		ArrayList<String> returnOrder = new ArrayList<String>(tempListNamedCount.size());
		
		for(Iterator<Integer> iteratorNumbersList = workableNumbersList.iterator() ; iteratorNumbersList.hasNext();) {
			Integer numberList = iteratorNumbersList.next();
			for(Iterator<String> iteratorNamesAndCounts = tempListNamedCount.iterator(); iteratorNamesAndCounts.hasNext(); ) {
				String nameAndCount = iteratorNamesAndCounts.next();
				if(nameAndCount.contains(numberList.toString())) {
					returnOrder.add(nameAndCount);
					iteratorNamesAndCounts.remove();
					break;
				}
			}
		}
		
//		for(Integer fu : tempNumber){
//			for(String f : tempListNamedCount) {
//				if(f.contains(fu.toString())){
//					returnOrder.add(f);
//				}
//			}
//		}
		return returnOrder;
	}

}
