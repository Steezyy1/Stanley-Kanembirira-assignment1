public class Insurance extends Bank {

    // Constructor that calls the superclass constructor
    public Insurance(String accountType, double accountBalance) {
        super(accountType, accountBalance);
    }

    // Method to print "You are covered"
    public void cover() {
        System.out.println("You are covered");
    }
}

