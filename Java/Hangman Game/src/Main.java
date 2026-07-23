import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*File Creation
        String filePath = "words.txt";
        String content = "Banana\nOrange\n";
         File file = new File(filePath);
        FileWriter fw = new FileWriter(file);
        fw.write(content);
        fw.close();*/

        String filePath = "words.txt";
        BufferedReader br =new BufferedReader(new FileReader(filePath));
        String line;
        char guess;
        int guessCount=0;
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while((line=br.readLine())!=null){
            words.add(line);
            //System.out.println(line.trim());
        }
        Random random = new Random();
        String word =words.get(random.nextInt(words.size()));
        System.out.println("***********************");
        System.out.println("Welcome to Hangman Game");
        System.out.println("***********************");
        for (int i=0;i<word.length();i++){
            System.out.print(" _ ");
        }
        System.out.println();
        System.out.print("Guess your Letter: ");
        guess = sc.next().toUpperCase().charAt(0);

//        for (int i=0; i<word.length();i++){
//            if(guess==word.charAt(i)){
//                word.replace()
//            }
//        }
        br.close();
    }
}