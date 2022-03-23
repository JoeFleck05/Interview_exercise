package InterviewQuestionOneTest;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import questionOne.InterviewQuestionOne;

public class AllTests {
	
	private int NUMBER_TO_RETURN = 3;
	InterviewQuestionOne interviewQuestionOne = new InterviewQuestionOne();
	questionTwo.InterviewQuestionTwo interviewQuestionTwo = new questionTwo.InterviewQuestionTwo();
	
//	@Test
//	public void validate() {
//		ArrayList<Integer> ACTUAL_LIST = new ArrayList<Integer>();
//		ACTUAL_LIST.add(909);
//		ACTUAL_LIST.add(132);
//		ACTUAL_LIST.add(22);
//		ACTUAL_LIST.add(756);
//		
//		ArrayList<Integer> EXPECTED_LIST = new ArrayList<Integer>();
//		EXPECTED_LIST.add(909);
//		EXPECTED_LIST.add(756);
//		EXPECTED_LIST.add(132);
//		EXPECTED_LIST.add(22);
//		
//		Assert.assertNotSame(EXPECTED_LIST, interviewQuestionOne.returnOrder(ACTUAL_LIST, NUMBER_TO_RETURN));
//		
//	}
	
	@Test
	public void testTwo() {
		String[] PROVE_IT_ARRAY_OF_NAMES = {"joe","joe","joe","jared","jared","nathan"};
		ArrayList<String> EXPECTED_RESPONSE = new ArrayList<>();
		EXPECTED_RESPONSE.add("joe<>4");
		EXPECTED_RESPONSE.add("jared<>3");
		EXPECTED_RESPONSE.add("nathan<>1");
		
		Assert.assertEquals(EXPECTED_RESPONSE, interviewQuestionTwo.exerciseTwo(PROVE_IT_ARRAY_OF_NAMES));
	}
	

}
