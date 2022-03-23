package exerciseTwoTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;
import questionTwo.ExerciseTwo;

public class ExerciseTwoTest {

	ExerciseTwo exerciseTwo = new ExerciseTwo();
	
	private static String[] ARRAY_OF_WORDS = {"Get","Her","Her","Though","Though","Though"};
	
	private static String[] ARRAY_OF_WORDS_TWO = {"Get","Her","Her","Though","Though","Though","Farts"};
	
	@Test
	public void validate() {
		ArrayList<String> returnArrayOfWords = new ArrayList<String>();
		returnArrayOfWords.add("Though 3");
		returnArrayOfWords.add("Her 2");
		returnArrayOfWords.add("Get 1");
		
		Assert.assertEquals(returnArrayOfWords, exerciseTwo.getCountOfNames(ARRAY_OF_WORDS));
	}

	@Test
	public void validateAgain() {
		ArrayList<String> returnArrayOfWords = new ArrayList<String>();
		returnArrayOfWords.add("Though 3");
		returnArrayOfWords.add("Her 2");
		returnArrayOfWords.add("Get 1");
		returnArrayOfWords.add("Farts 1");
		
		Assert.assertEquals(returnArrayOfWords, exerciseTwo.getCountOfNames(ARRAY_OF_WORDS_TWO));
	}
}
