import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner inputfile;

        try {
            inputfile = new Scanner(new File( "input.txt"));
        } catch (FileNotFoundException e) {

            System.out.println("filen finns inte, använd tangentbordet istället");
            inputfile = new Scanner(System.in);
        }
        ArrayList<String> wordlist = new ArrayList<>();
        while (inputfile.hasNextLine()) {
            wordlist.add(inputfile.nextLine());
        }
        for (int i = 0 ; i <wordlist.size() ; i++) {
            System.out.println(wordlist.get(i));
        }
        Math.random();
        Random R = new Random ( 10);
        R.nextInt(wordlist.size());
    }
}
