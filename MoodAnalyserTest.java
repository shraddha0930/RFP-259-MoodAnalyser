import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void given_SadMood_Should_Return_Sad() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am In a Sad Mood");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assert.assertEquals("SAD", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

//    @Test
//    public void givenNullMood_ShouldThrowException() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser();
//        String mood =moodAnalyser.analyseMood(null);
//        assertEquals("HAPPY",mood);
//    }

}