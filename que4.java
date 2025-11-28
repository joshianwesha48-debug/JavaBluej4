import java.util.Scanner;

/**
 * Write a description of class que4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que4
{
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int no=scanner.nextInt();
    if(no%3==0 && no%5==0)
        {
            System.out.println("Given number is divisibe by both 3 AND 5.");
        }
            else{
                System.out.println("Given number is Not divisibe by both 3 AND 5.");
                
            }
        }
}