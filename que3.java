import java.util.Scanner;

/**
 * Write a description of class que3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que3
{
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        if(num1>0)
        {
            System.out.println("The number is positive");
        }
            else if(num1<0){
                System.out.println("The number is negative");
            }
                
                else{
                    System.out.println("The number is zero");
                }
                
            }
        }
