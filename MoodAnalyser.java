public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood(String message) {
        try {
            if (message.contains("Sad")) {
                return "SAD";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
        return null;
    }
}