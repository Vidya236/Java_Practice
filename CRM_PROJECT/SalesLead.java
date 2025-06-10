package CRM_PROJECT;

public class SalesLead {
    public static void main(String[] args) {
        short leadId = 2445;
        String leadName = "John Doe";
        byte leadAge = 30;
        char leadGender = 'M';
        String leadEmail = "johndoe@example.com";
        long leadPhone = 7848329561l;
        String leadStatus = "contacted";
        boolean isPurchased = false;
        String leadSource = "social media";
        String leadDescription = "This is a potential lead";
        // printing the values
        System.out.println("Lead ID: " + leadId);
        System.out.println("Lead Name: " + leadName);
        System.out.println(" Lead Age: " + leadAge);
        System.out.println("Lead Gender: " + leadGender);
        System.out.println("Lead Email: " + leadEmail);
        System.out.println("Lead Phone: " + leadPhone);
        System.out.println("Lead Status: " + leadStatus);
        System.out.println("Is Purchased: " + isPurchased);
        System.out.println("Lead Source: " + leadSource);
        System.out.println("Lead Description: " + leadDescription);

    }

}
