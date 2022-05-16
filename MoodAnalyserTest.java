package bl.com.moodanalyser;
/*Analysemood method can just return Sad or Happy
 */

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    //Test for Sad
    
    @Test
     public void givenMessageWhenSadShouldReturnSad(){
        
        //create object
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String expectedValue = "SAD";
        String mood = moodAnalyser.analysemood("I am in sad mood");
        Assert.assertEquals(expectedValue,mood);
    }
    
    //Test for Happy
    @Test
    public void givenMessageWhenHappyShouldReturnHappy(){
        //create object
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String expectedValue = "Happy";
        String mood = moodAnalyser.analysemood("I am in Happy mood");
        Assert.assertEquals(expectedValue,mood);
    }


}
