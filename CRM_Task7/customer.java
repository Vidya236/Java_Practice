package CRM_Task7;

import java.util.Scanner;

public class customer {
    int cid;
    String cname;
    int interactions;
    double dealValue;
    int loyaltyPoints = 0;

    Scanner sc = new Scanner(System.in);

    public void custInfo() {
        System.out.println("Customer ID: ");
        cid = sc.nextInt();
        sc.nextLine();
        System.out.println("Name: ");
        cname = sc.nextLine();
    }

    public void interactionTracker() {
        System.out.println("interactions:");
        interactions = sc.nextInt();
        loyaltyPoints += interactions * 2;

    }

    public void dealValueStatus() {
        System.out.println("enter deal value:");
        dealValue = sc.nextDouble();

        if (dealValue >= 50000) {
            loyaltyPoints += 10;
        } else if (dealValue >= 20000) {
            loyaltyPoints += 5;
        }

    }

    public String loyaltyStatus() {
        if (loyaltyPoints >= 20) {
            return "Platinum";
        } else if (loyaltyPoints >= 15) {
            return "Gold";
        } else if (loyaltyPoints >= 10) {
            return "Silver";
        } else {
            return "Needs more engagement";
        }
    }

    public void displayCustomerDetails() {
        System.out.println("\n--- Customer Details ---");
        System.out.println("Customer ID: " + cid);
        System.out.println("Name: " + cname);
        System.out.println("Interactions: " + interactions);
        System.out.println("Deal Value: ₹" + dealValue);
        System.out.println("Total Loyalty Points: " + loyaltyPoints);
        System.out.println("Loyalty Status: " + loyaltyStatus());
    }

    public int getLoyaltyPoints() {

        return loyaltyPoints;
    }

}
