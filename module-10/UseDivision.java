//UseDivision class
public class UseDivision {
    public static void main(String[] args) {
        Division intl1 = new InternationalDivision("International Sales", "INTL123", "Germany", "German");
        Division intl2 = new InternationalDivision("Euro Systems", "INT-002", "Germany", "German");
        Division dom1 = new DomesticDivision("West Coast Ops", "DOM-101", "California");
        Division dom2 = new DomesticDivision("East Coast Ops", "DOM-102", "New York");

        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}

