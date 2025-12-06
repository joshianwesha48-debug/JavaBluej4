
/**
 * Write a description of class week10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week10
{
    public static void main(String[] args) {
      double processingFeeRate = 0.005; // 0.5%
      int annualRate = 8; // starting rate
     while (annualRate <= 12) {
    double principal = 1000; // minimum deposit
    int years = 5; // maximum duration
    int months = years * 12;
    double monthlyRate = (annualRate / 100.0) / 12.0;
    // Compound interest formula
    double maturityAmount = principal * Math.pow((1 + monthlyRate), months);
    // Fee calculation
    double fee = maturityAmount * processingFeeRate;
    double finalAmount = maturityAmount - fee;
    System.out.println("\n-FD DETAILS FOR " + annualRate + "% RATE");
    System.out.println("Principal: Rs. " + principal);
    System.out.println("Annual Rate: " + annualRate + "%");
    System.out.println("Monthly Rate: " + monthlyRate);
    System.out.println("Duration: " + years + " years (" + months + " months)");
    System.out.println("Maturity Amount (Before Fee): Rs. " + String.format("%.2f", maturityAmount));
    System.out.println("Processing Fee (0.5%): Rs. " + String.format("%.2f", fee));
    System.out.println("Final Amount: Rs. " + String.format("%.2f", finalAmount));
}
}
}

