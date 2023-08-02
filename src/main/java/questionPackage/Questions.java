package questionPackage;

import java.util.List;

public class Questions {

     String qtext;
     List<String> options;
    private int correctAnswer;

    public Questions(String qtext, List<String> options, int correctAnswer) {
        this.qtext = qtext;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect(int userAnswer){
        return userAnswer==correctAnswer;
    }
}
