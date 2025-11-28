import java.util.Scanner;

/**
 * Write a description of class QUE2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUE2
{
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if(number%2==0)
        {
            System.out.println("Number is even");
        }
            else{
                System.out.println("Number is odd");
                
            }
        }
}