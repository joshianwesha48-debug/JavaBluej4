import java.util.Scanner;

/**
 * Write a description of class que7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que7
{
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    double A=0.6;
    double B=0.4;
    double C=0.2;
    double D=0.1;
    double SP;
    System.out.println("Enter the marked price: ");
    float MP = scanner.nextFloat();
    System.out.println("Enter the discount category: A =60%\t B=40%\t C=20%\t D=10%\t");
    char categorg= scanner.next() .charAt(0);
    
    switch(categorg){
        case'A':
        SP= MP -(MP*A);
          System.out.println("The spelling price is: "+SP);
          break; 
        case'B':
          SP=MP -(MP*B);
          System.out.println("The spelling price is: "+SP);
          break;
        case'C':
          SP=MP -(MP*C);
          System.out.println("The spelling price is: "+SP);
          break;
        case'D':
          SP=MP -(MP*D);
          System.out.println("The spelling price is: "+SP);
          break;
          default:
              System.out.println("You choose an invalid discount categorg!");
              break;
    }
    
}
}