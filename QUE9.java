import java.util.Scanner;

/**
 * Write a description of class QUE9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUE9
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the gpa");
        float gpa=scan.nextFloat();
        System.out.println("Enter attendance percentage");
        double attendance=scan.nextDouble();
        System.out.println("Enter attitude score");
        int attitude=scan.nextInt();
        if(gpa>=3.2){
            if(attendance>80){
                if(attitude<5){
                    System.out.println("Eligible for scholarship");
                }
                else{
                    System.out.println("Not eligible:Attitude score should be less than 5");
                }
            }
                else{
                    System.out.println("Not eligible:Attendance must be above 80%");
                }
            }
            else{
                System.out.println("Not eligible:Gpa must be 3.2 or higher");
            }
        }
    }

