package questionTwo;

import java.util.*;

public class ExerciseTwoTwo {
	public static String[] ExerciseTwoTwo(String[] stringArray){

        List<String> nameList = new ArrayList<String>(Arrays.asList(stringArray));
        Set<String> uniqueNames = new HashSet<String>(nameList);
        List<String> listOfNames = new ArrayList<String>(uniqueNames);
        Map<Integer, String> tempNameNCount = new TreeMap<Integer, String>(Collections.<Integer>reverseOrder());

        for(String name : listOfNames) {
            int counter = 0;
            for(String arr : stringArray) {
                if(name.equals(arr)) {
                    ++counter;
                }
            }
            tempNameNCount.put(counter,name);
        }

        String[] returnStringArray = new String[tempNameNCount.size()];

        int stringArrCounter = 0;
        Set set = tempNameNCount.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) {
            Map.Entry me =(Map.Entry)i.next();
            returnStringArray[stringArrCounter] = me.getValue() + "<>" + me.getKey();
            ++stringArrCounter;
        }

        return returnStringArray;
    }

}
