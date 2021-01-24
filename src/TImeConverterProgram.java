import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class TImeConverterProgram {

    public static void main(String[] args) {

        //You need a program to convert days to seconds.
        //The given code takes the amount of days as input. Complete the code to convert it to seconds and output the result.



        Scanner scanner = new Scanner(System.in);
        int Days = scanner.nextInt();

        //your code goes here
        int daysToSeconds = Days * 24 * 60 *60;
        System.out.println(daysToSeconds);

    }
}
