import java.util.Scanner;

/**
 * Write a description of class que here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que
{
    public static void main (String [] args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the student's score (0–100): ");
    double score = scanner.nextDouble();
    if(score>=40)
    {
        System.out.println("You have passed the examination");
    }
    else{
        System.out.println("You have failed the examination");
    }
    }
}  
