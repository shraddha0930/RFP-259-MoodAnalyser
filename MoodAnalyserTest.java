import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void given_SadMood_Should_Return_Sad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am In a Sad Mood");
        Assert.assertEquals("SAD", mood);

    }

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in any Mood");
        Assert.assertEquals("HAPPY", mood);
    }
}