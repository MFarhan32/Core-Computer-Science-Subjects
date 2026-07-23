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

        String line;
        char guess;
        int guessCount=0;
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try(BufferedReader br =new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                words.add(line.trim());
                //System.out.println(line.trim());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found.");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }


        while(guessCount<6){
            Random random = new Random();
            String word =words.get(random.nextInt(words.size()));
            ArrayList<Character> wordState = new ArrayList<>();
            System.out.println("***********************");
            System.out.println("Welcome to Hangman Game");
            System.out.println("***********************");
            for (int i=0;i<word.length();i++){
                wordState.add('_');
            }

            for (char ch : wordState){
                System.out.print(ch);
            }
            System.out.println();
            System.out.print("Guess your Letter: ");
            guess = sc.next().toLowerCase().charAt(0);

            for (int i=0; i<word.length();i++){
                if(guess==word.charAt(i)){
                    System.out.println("Correct guess.");
                    wordState.set(i,guess);
                }
                else{
                    guessCount++;
                    System.out.println("Incorrect Guess.");
                }
            }

        }

    }
}