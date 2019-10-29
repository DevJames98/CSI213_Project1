package module1project.djames;
import java.util.Objects;
import java.util.Scanner;
/**
Name: Devon James
Class: CSI 213      Class Section:0002/ Lab: L011
Assignment: Module 1 Programming Assignment
 */
public class Module1ProjectDJAMES {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);                                                              //Creates scanner to get user input
        String input;                                                                                       //Initialize input variable as a string to store user input
        
        int i=1;                                                                                            //Initialize counter variable for while loop
        while(i>0) {                                                                                        //Makes loop infinite until user inputs "done"
            
            System.out.println("Enter a string to be reversed. When you are finished, type 'done'.");       //Tells user what to input
            input = scan.next();                                                                            //Retrieves user input and stores it in 'input' variable

            if (Objects.equals("done", input)) {                                                            //Checks to see if user inputs "done"
                System.out.print("Thank you for using this program. Goodbye!");                             //Termination message
                System.exit(0);                                                                             //Terminates program
            }
            else{
                System.out.println(reverse(input));                                                         //Prints reversed user input through parameters
                i++;                                                                                        //Increases counter variable for infinite loop
            }
        }
    }
    
    public static String reverse(String tornado){                                                           //Creates 'reverse' method with the tornado parameter
                                                                                                            //linked to the 'input' variable in the main method
        if ((tornado==null)||tornado.length() == 1) {                                                       //Checks to see if input has one character or no characters
            return tornado;
        }
        else{
        return (reverse(tornado.substring(1)) + tornado.charAt(0));                                         //Takes first character in the string and adds it to a subset
        }                                                                                                   //and then adds each individual subset in reverse order
    }
}
    

