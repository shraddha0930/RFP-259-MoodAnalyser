import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void given_SadMood_Should_Return_Sad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am In a Sad Mood");
        assertEquals("SAD", mood);

    }

   // @Test
//    public void given_AnyMood_Should_Return_HAPPY() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser();
//        String mood = moodAnalyser.analyseMood("I am in any Mood");
//        assertEquals("HAPPY", mood);
//    }

    @Test
    public void givenNullMood_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood =moodAnalyser.analyseMood(null);
        assertEquals("HAPPY",mood);
    }

}