package quizPackage;

import questionPackage.Questions;
import questionPackage.Quiz;
import userPackage.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuizApp {


    public static void main(String[] args) {

        Quiz quiz = new Quiz();

        List<String> options1 = Arrays.asList("1","2","3","4");
        Questions question1 = new Questions("what is value of 2+1 is :",options1,2);
        quiz.addQuestions(question1);

        List<String> options2 = Arrays.asList("Sachin","Kohli","Dravid","Dhoni");
        Questions question2 = new Questions("who is the highest run getter in ODis :",options2,0);
        quiz.addQuestions(question2);
        User user = new User("lohith","lohith");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if(user.login(username,password)){
            System.out.println("Login successful!\n");
            int score = quiz.runQuiz();
            System.out.println("Quiz completed. Your score: " + score);
        }
        else{
            System.out.println("Login failed");
        }
    }
}
