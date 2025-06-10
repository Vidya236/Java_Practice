package CRM_PROJECT;

public class Ticket {
    public static void main(String[] args) {
        int ticketId = 24689;
        int customerId = 1744368;
        String issueType = "Billing";
        String issueDescription = "Payment failed";
        byte priority = 2;
        boolean isOpen = true;
        String customerNotes = "Customer is not satisfied with the service";
        // printing the values
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Issue Type: " + issueType);
        System.out.println("Issue Description: " + issueDescription);
        System.out.println("Priority: " + priority);
        System.out.println("Is Open: " + isOpen);
        System.out.println("Customer Notes: " + customerNotes);
    }
}
