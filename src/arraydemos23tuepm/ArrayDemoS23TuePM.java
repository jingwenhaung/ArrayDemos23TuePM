
package arraydemos23tuepm;
import java.util.Scanner;

public class ArrayDemoS23TuePM {

    public static void main(String[] args) {
//         TODO code application logic here
        /*char[] myLetters = new char[5];
        myLetters[0] = 'R';
        myLetters[1] = 'o';
        myLetters[2] = 'n';
        myLetters[3] = 'a';
        myLetters[4] = 'k';
        
        for(int i = 0; i < myLetters.length; i++){
            System.out.print(myLetters[i]);
        }*/
        
        System.out.print("Enter Word: ");
        Scanner input = new Scanner(System.in);
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        System.out.println("Printing the word");
        for(int i = 0; i < myLetters.length; i++){
            myLetters[i] = myWord.charAt(i);
            System.out.print(myLetters[i]);
        }
        System.out.println();
        
        System.out.println("Printing in reverse");
        for(int i = myLetters.length - 1; i >= 0; i--){
            System.out.print(myLetters[i]);
        }
        System.out.println();
    }
    
}
