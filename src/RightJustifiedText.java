import java.util.Scanner;

public class RightJustifiedText {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        String phrase = "", rightJustifyPhrase="";
        int len=0;

        while ( true ) {
            System.out.println("Enter your text string. Type q to quit:");
            phrase = keybd.nextLine();
            rightJustifyPhrase="";

            if (phrase.equals("q"))     // stop running if q typed
                break;

            phrase = phrase.trim();   // get non-space character count
            len = phrase.length();

            for (int i = 0; i < (60 - len); i++)  // fill the leading space
                rightJustifyPhrase += " ";

            rightJustifyPhrase += phrase;   // construct right justified phrase

            for (int i = 0; i < 60; i++)
                System.out.print("*");

            System.out.println("\n" + rightJustifyPhrase);
        }
    }

}
