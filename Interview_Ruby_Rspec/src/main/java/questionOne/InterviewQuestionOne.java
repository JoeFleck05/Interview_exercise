//Exercise One:
//A = [ 99, 21, 56, 104, 56, 12, 1, 88, 100, 91, 74, 1007 ]
//How would you produce the top n of the given list?
//     Example ( give me the top 3 of the above list )
//Answer of visible numbers : 1007, 104, 99

package questionOne;

import java.util.ArrayList;
import java.util.Collections;

public class InterviewQuestionOne {

	public ArrayList<Integer> returnOrder(ArrayList<Integer> al, int n) {
		ArrayList<Integer> returnAl = new ArrayList<Integer>();
		int b = 0;
		Collections.sort(al);
		Collections.reverse(al);
		
		for(Integer a : al) {
			if( b <= n ) {
				returnAl.add(a);
			}
			b += 1;
		}
		System.out.println(returnAl);
		return returnAl;
	}
}
