package CRM_PROJECT;

public class Sales_Opportunity {
    public static void main(String[] args) {
        short oppId = 246;
        String oppName = "Sales Opportunity";
        String oppDesc = "This is a sales opportunity";
        String oppStatus = "Open";
        String oppContact = "John Doe";
        char productORservice = 'p';// p or s
        byte probability = 75;
        boolean isClosed = false;
        double estimatedValue = 4672421.56;
        int competitors = 25883;
        // printing values
        System.out.println("Opp ID: " + oppId);
        System.out.println("Opp Name: " + oppName);
        System.out.println("Opp Desc: " + oppDesc);
        System.out.println("Opp Status: " + oppStatus);
        System.out.println("Opp Contact: " + oppContact);
        System.out.println("Product /Service: " + productORservice);
        System.out.println("Probability: " + probability);
        System.out.println("Is Closed: " + isClosed);
        System.out.println("Estimated Value: " + estimatedValue);
        System.out.println("Competitors: " + competitors);

    }

}
