package CRM_Task7;

import java.util.Scanner;

public class salesPerson {
    int spid;
    String spname;
    int dealsClosed;
    int bonus = 0;
    int totalEarnings;
    int custRatings;

    Scanner sc = new Scanner(System.in);

    public void salesPersonInfo() {
        System.out.println("Sales Person id" + spid);
        System.out.println("Sales Person Name" + spname);
    }

    public void earningsCalculation(customer c) {
        System.out.println("Enter the number of deals closed");
        dealsClosed = sc.nextInt();
        System.out.println("Enter the customer ratings");
        custRatings = sc.nextInt();
        if (custRatings >= 4) {
            bonus += 2000;
        }
        totalEarnings = (dealsClosed * 2500) + bonus;
    }

    public void displaySalesPersonInfo() {
        System.out.println("\n--- Salesperson Information ---");
        System.out.println("Salesperson ID: " + spid);
        System.out.println("Salesperson Name: " + spname);
        System.out.println("Deals Closed: " + dealsClosed);
        System.out.println("Bonus Earned:" + bonus);
        System.out.println("Total Earnings: " + totalEarnings);
    }
}
