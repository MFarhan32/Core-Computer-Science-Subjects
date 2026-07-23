import java.io.*;
import java.util.ArrayList;

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
        while((line=br.readLine())!=null){
            System.out.println(line.trim());
        }

        br.close();
    }
}