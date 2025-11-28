import java.util.Scanner;

/**
 * Write a description of class que11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que11
{
    public static void main(String []args){
        
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your annual income NPR");
        double income = sc.nextDouble();
        double tax=0;
        if (income<=500000)
        {
        tax =income * 0.1;
    }
    else if (income<=700000)
    { 
       tax = 5000 + 0.10 + (income - 500000);
        } 
        else if(income<=1000000) 
        {
            tax = 150000 + 0.20 * (income-700000);
        }
        else if(income<=2000000){
            tax=35000+0.30*(income-1000000);
        }
        else if(income<=5000000){
            tax=335000+0.36*(income-2000000);
        }
        else{
            tax=1135000+0.39*(income-5000000);
        }
        System.out.println("Your total income tax is: NPR " + tax);
        }

        
    
    
         
        }
