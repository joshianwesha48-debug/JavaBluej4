import java.util.Scanner;

/**
 * Write a description of class QUE8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUE8
{
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a gpa: ");
    float gpa=scanner .nextFloat();
    if(gpa<0.0 || gpa>4.0){
        System.out.println("Invalid");
    }
    else if(gpa>=3.6){
     System.out.println("A+");
    }
     else if(gpa>=3.0){
            System.out.println("B+");
        }
            else if(gpa>=2.0){
            System.out.println("C+");
        }
            else if(gpa>=1.0){
            System.out.println("D+");
        }
            else{
            System.out.println("F+");
        
            
    
            
    }
}
}