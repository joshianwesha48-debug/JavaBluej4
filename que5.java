import java.util.Scanner;

/**
 * Write a description of class que5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que5
{
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int no=scanner.nextInt();
    if(no%3==0)
        {
            if(no%5==0)
            {
            System.out.println("Divisible by both 3 AND 5");
        }
            else{
                System.out.println("Divisible by both 3 and not divisible by 5");
            }
        }
                else{
                    System.out.println("Not divisible by both 3 and 5");
                }
                
            }
}