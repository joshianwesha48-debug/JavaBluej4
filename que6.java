import java.util.Scanner;

/**
 * Write a description of class que6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que6
{
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    double A=0.6;
    double B=0.4;
    double C=0.2;
    double D=0.1;
    System.out.println("Enter the marked price: ");
    float MP = scanner.nextFloat();
    System.out.println("Enter the discount category: A =60%\t B=40%\t C=20%\t D=10%\t");
    char category= scanner.next() .charAt(0);//reads the position of the string
    if(category=='A'){
        double SP=MP -(MP*A);
        System.out.println("The selling price is;Rs. "+SP);
    }
        else if(category=='B'){
        double SP=MP -(MP*B);
        System.out.println("The selling price is;Rs. "+SP);
    }
        else if(category=='C'){
        double SP=MP -(MP*C);
        System.out.println("The selling price is;Rs. "+SP);
    }
        else if(category=='D'){
        double SP=MP -(MP*D);
        System.out.println("The selling price is;Rs. "+SP);
    }
    
}
}