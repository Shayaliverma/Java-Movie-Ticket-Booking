import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
      
       String movieName;
       double ticketPrice;
       int numberOfTickets;
       double snackCost;
       double discountPercent;
       double taxPercent;

       System.out.print("Enter movie name: ");
       movieName = input.nextLine();

       System.out.print("Enter ticket price: ");
       ticketPrice =input.nextDouble();

       System.out.print("Enter number of ticket: ");
       numberOfTickets = input.nextInt();

       System.out.print("Enter snack cost: ");
       snackCost = input.nextDouble();

       System.out.print("Enter discount percentage: ");
       discountPercent = input.nextDouble();

       System.out.print("Enter tax percentage: ");
       taxPercent = input.nextDouble();

       double subtotal = ticketPrice * numberOfTickets + snackCost;
       double discountAmount = subtotal * discountPercent / 100;
       double amountAfterDiscount = subtotal - discountAmount;
       double taxAmount = amountAfterDiscount * taxPercent /  100;
       double finalAmount = amountAfterDiscount + taxAmount;
       
       System.out.println();
       System.out.println("==== Movie Ticket Booking ====");

       System.out.println("Movie: " + movieName);
       System.out.printf("Ticket Price: INR  %.2f%n" , ticketPrice);
       System.out.println("Number of Tickets: " + numberOfTickets);
       System.out.printf("Snack Cost: INR %.2f%n" , snackCost);
       System.out.printf("Subtotal: INR %.2f%n" , subtotal);
       System.out.printf("Discount: INR %.2f%n" , discountAmount);
       System.out.printf("Tax: INR %.2f%n" , taxAmount);
       System.out.printf("Final Amount: INR %.2f%n", finalAmount);  
    
       System.out.println("--------------------------------");
       System.out.println("Thank you for booking with us!");
       input.close();
    }
}