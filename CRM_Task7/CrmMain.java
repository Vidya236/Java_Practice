package CRM_Task7;

public class CrmMain {
    public static void main(String[] args) {
        customer c = new customer();
        salesPerson sp = new salesPerson();
        c.custInfo();
        c.interactionTracker();
        c.dealValueStatus();
        c.loyaltyStatus();
        sp.salesPersonInfo();
        sp.earningsCalculation(c);

        c.displayCustomerDetails();
        sp.displaySalesPersonInfo();
    }

}
