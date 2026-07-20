import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){
        //Questions
        String[] questions = {"Q) What is real name of Quaid-e-Azam?",
                                "Q) Where is tomb of Allama Iqbal?",
                                "Q) What is Capital of Pakistan?",
                                "Q) Independence day of Pakistan?",
                                "Q) PTI belongs to which leader?"};
        //Options
        String[][] options = {{"1. Ahmed Ali","2. Muhammad Ali","3. Faizan Ali","4. Shoukat Ali"},
                {"1. Karachi","2. Islamabad","3. Faisalabad", "4. Lahore"},
                {"1. Islamabad","2. Karachi","3. Faisalabad", "4. Lahore"},
                {"1. 15 Augest","2. 14 Augest","3. 1 May", "4. 22 April"},
                {"1. Nawaz Shareef","2. Asif Zardari","3. Imran Khan", "4. Shah Mehmood Qureshi"}};
        //Answers
        int[] answers = {2,4,1,2,3};


        int score= 0;
        int guess;
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("Welcome to Java Quiz Game");
        System.out.println("*************************");

//        for (String question : questions){
//            System.out.println(question);
//            for (String[] option : options){
//                System.out.println(option);
////                for (int i=0;i<option.length;i++){
////                    System.out.println(option[i]);
////                }
//            }
//
//        }
        for (int i=0;i<questions.length;i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("***********");
                System.out.println(" Correct! ");
                System.out.println("***********");
                score++;
            } else {
                System.out.println("***********");
                System.out.println(" Wrong! ");
                System.out.println("***********");
            }
        }
        System.out.println("Your Final Score is : "+ score +".");
    }

}
