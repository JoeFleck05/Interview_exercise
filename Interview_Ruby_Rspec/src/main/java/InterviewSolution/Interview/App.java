package InterviewSolution.Interview;

import java.util.ArrayList;

import questionOne.InterviewQuestionOne;
import questionTwo.InterviewQuestionTwo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	InterviewQuestionOne interviewQuestionOne = new InterviewQuestionOne();
//    	
//    	ArrayList<Integer> A = new ArrayList<Integer>();
//    	A.add(203);
//    	A.add(11);
//    	A.add(9);
//    	A.add(78);
//    	A.add(7);
//    	
//    	interviewQuestionOne.returnOrder(A, 2);
    	
    	String[] PROVE_IT_ARRAY_OF_NAMES = {"joe","joe","joe","jared","jared","nathan"};
    	InterviewQuestionTwo interviewQuestionTwo = new InterviewQuestionTwo();
    	ArrayList<String> booArray = interviewQuestionTwo.exerciseTwo(PROVE_IT_ARRAY_OF_NAMES);
    	System.out.println(booArray);

        System.out.println( "Hello World!");
    }
}
