import java.util.Scanner;

/**
 * Write a description of class que12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que12
{
    public static void main(String []args){
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter your age");
       int age=scan.nextInt();
       scan.nextLine();
       System.out.println("Enter movie language");
       String language=scan.nextLine().trim();
       System.out.println("Do you have student id:Yes/No");
       String student=scan.nextLine().trim().toLowerCase();
       System.out.println("Is it festival day:Yes/NO");
       String day=scan.nextLine().trim().toLowerCase();
       double price=0;
       if(age<=12){
           price=150;
        }
        else if (age>=60){
            price=200;
            }
        else{
            price=250;
            }
       if (language.equals("Hindi")){
            price=price+50;
            }
        else if (language.equals("English")){
            price=price+100;
        }
            else if (language.equals("Nepali")){
            price=price+0;
        }
        else{
            System.out.println("Invalid language");
        }
        }
       }
