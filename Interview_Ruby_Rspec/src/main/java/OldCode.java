import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class OldCode {

	public static void main(String[] argv) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        map.put("4","four");

        System.out.println(getKeyFromValue(map,"three"));
      }


//hm is the map you are trying to get value from it
      public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
          if (hm.get(o).equals(value)) {
            return o;
          }
        }
        return null;
      }
//	Set<String> uniqNames = new TreeSet<String>();
//	uniqNames.addAll(Arrays.asList(namesArray));
//	
//	ArrayList listNames = new ArrayList<String>(uniqNames);
//	
////	setNameNCount(namesArray);
//	
//	// Create Map
//	HashMap<String, Integer> freqMap = new HashMap<String, Integer>();
//	
//	// Loop thru String Array and add to HashMap with count as Value
//	for(String s : namesArray){
//		if( freqMap.containsKey(s) ) {
//			freqMap.put(s, freqMap.get(s) + 1);
//		} else {
//			freqMap.put(s, 1);
//		}
//	}
//	// Set Keys in new Array
//	ArrayList<String> keyArray = new ArrayList<String>(freqMap.keySet());
//	// Sort keyArray
//	Collections.sort(keyArray);
//	// Create Empty ArrayList
//	ArrayList<String> valueArray = new ArrayList<String>();
//	for(String kArray : keyArray) {
//		valueArray.add(freqMap.get(kArray) + "<>" + kArray);
////					valueArray.add(kArray + "<>" + freqMap.get(kArray).toString());
//	}
//	
//	ArrayList<Integer> bArr = new ArrayList<Integer>();
//	
//	for(String v : valueArray) {
//		String[] vA = v.split("<>");
//		int b = Integer.parseInt(vA[0]);
//		bArr.add(b);
//	}
//	
//	Collections.reverse(bArr);
//	// reverse order valueArray ArrayList
//	Collections.reverse(valueArray);
//	// number place holder
//	int number = 0;
//	frequencyNamesArray = new String[valueArray.size()];
//	
//	for(int i = valueArray.size() - 1 ; i >= 0 ; --i) {
//		frequencyNamesArray[number] = valueArray.get(i);
//		++ number;
//	}
}
