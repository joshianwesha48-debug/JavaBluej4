import java.util.Scanner;

/**
 * Write a description of class QUE10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUE10
{
     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String A0= "841 x 1189 mm (33.1 x 46.8 inches)";
        String A1= "594 x 841 mm (23.4 x 33.1 inches)";
        String A2= "420 x 594 mm (16.5 x 23.4 inches)";
        String A3= "297 x 420 mm (11.7 x 16.5 inches)";
        String A4= "210 x 297 mm (8.3 x 11.7 inches)";
        String A5= "148 x 210 mm (5.8 x 8.3 inches)";
       
        System.out.println("Enter the paper size you desire(A0-A4): ");
        String choice= scan.nextLine();
       
        switch(choice){
            case"A0":
                System.out.println(A0);
                break;
            case"A1":
                System.out.println(A1);
                break;
            case "A2":
                System.out.println(A2);
                break;
            case "A3":
                System.out.println(A3);
                break;
            case "A4":
                System.out.println(A4);
                break;
            default:
                System.out.println("Invalid paper size!");
                break;
        }
       

    }
}

