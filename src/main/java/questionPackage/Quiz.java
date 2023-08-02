package questionPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    private List<Questions> questions;

    public Quiz(){
        questions = new ArrayList<>();
    }

    public void addQuestions(Questions question){
        questions.add(question);
    }

    public int runQuiz(){

        Scanner scanner = new Scanner(System.in);
        int score =0;
        for(int i=0;i<questions.size();i++){

            Questions question = questions.get(i);

            System.out.println("Questions"+(i+1)+":"+question.qtext);

            for (int j=0;j<question.options.size();j++){
                System.out.println((j + 1) + ". " + question.options.get(j));
            }

            System.out.print("your answer is: ");

            int answer = scanner.nextInt();

            if(question.isCorrect(answer-1)){
                score++;
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect.");
            }

        }

        return score;
    }


}
