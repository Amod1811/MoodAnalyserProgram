package bl.com.moodanalyser;
/*
Ability to analyse and respond Happy or Sad mood
 */
public class MoodAnalyserMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Mood Analyser program");

        //Crate object
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        // pass Happy message
        System.out.println(moodAnalyser.analysemood("I am in Happy Mood"));

        //pass sad message

        System.out.println(moodAnalyser.analysemood("I am in  Sad Mood"));
    }
}
