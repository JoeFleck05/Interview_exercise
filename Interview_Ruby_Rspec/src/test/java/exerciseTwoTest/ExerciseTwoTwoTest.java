package exerciseTwoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import questionTwo.ExerciseTwoTwo;

public class ExerciseTwoTwoTest {

	ExerciseTwoTwo execriseTwoTwo = new ExerciseTwoTwo();

    private String[] ARRAY_OF_NAMES = {"joe","joe","joe","joe",
    		"jared","jared","jared",
    		"nathan"
    		,"julia","julia","julia",
    		"nancy","nathan",
    		"julia","julia",
    		"nancy",
    		"jared","jared","jared","jared","jared","jared","jared"};
    private String[] PROVE_RETURN_ARRAY_TWO = {"jared<>10","julia<>5","joe<>4","nathan<>2","nancy<>2",};
    private String[] PROVE_IT_ARRAY_OF_NAMES = {"joe","joe","joe","jared","jared","nathan"};
    private String[] PROVE_RETURN_ARRAY = {"joe<>3","jared<>2","nathan<>1"};


    @Test
    public void proveIt(){ assertArrayEquals(PROVE_RETURN_ARRAY, execriseTwoTwo.ExerciseTwoTwo(PROVE_IT_ARRAY_OF_NAMES)); }
    
    @Test
    public void proveAnother(){ assertArrayEquals(PROVE_RETURN_ARRAY_TWO, execriseTwoTwo.ExerciseTwoTwo(ARRAY_OF_NAMES)); }

}
