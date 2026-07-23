import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*File Creation
        String filePath = "words.txt";
        String content = "Banana\nOrange\nMango";
         File file = new File(filePath);
        FileWriter fw = new FileWriter(file);
        fw.write(content);
        fw.close();*/

        String filePath = "words.txt";

        String line;

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

        int guessCount=0;


        Random random = new Random();
        String word =(words.get(random.nextInt(words.size()))).toLowerCase();
        ArrayList<Character> wordState = new ArrayList<>();
        System.out.println("***********************");
        System.out.println("Welcome to Hangman Game");
        System.out.println("***********************");
        for (int i=0;i<word.length();i++){
            wordState.add('_');
        }

        while(guessCount<6){

            System.out.println(getHangmanArt(guessCount));
            char guess;
            System.out.print("Word: ");
            for (char ch : wordState){
                System.out.print(ch);
            }
            System.out.println();
            System.out.print("Guess your Letter: ");
            guess = sc.next().toLowerCase().charAt(0);

            if(word.indexOf(guess)>=0) {
                System.out.println("Correct Guess 👏.");
                for (int i = 0; i < word.length(); i++) {
                    if (guess == word.charAt(i)) {
                        wordState.set(i, guess);
                    }
                }
                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(guessCount));
                    System.out.println("Congratulations. You won 🎊.");
                    break;
                }
            }
            else{
                System.out.println("Wrong Guess 👎.");
                guessCount++;
            }
        }
        if(guessCount>=6){
            System.out.println(getHangmanArt(guessCount));
            System.out.println("Game Over 😩.");
            System.out.println("The word was : "+word);
        }
    }

    static String getHangmanArt(int wrongGuesses){
        return switch(wrongGuesses) {
            case 0 -> """
                    """;
            case 1 -> """
                     o
                    """;
            case 2 -> """
                     o
                     |
                    """;
            case 3 -> """
                     o
                    /|
                    """;
            case 4 -> """
                     o
                    /|\\
                    """;
            case 5 -> """
                     o
                    /|\\
                    /
                    """;
            case 6 -> """
                     o
                    /|\\
                    / \\
                    """;
            default -> "Invalid";

        };


    }
}