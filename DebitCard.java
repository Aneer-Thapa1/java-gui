
/**
 * @author (Anir Jung Thapa)
 */
public class DebitCard extends BankCard {
    // instance variable
    private int pinNumber, withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;

    // Constructor of DebitCard class
    public DebitCard(int balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName,
            int pinNumber) {
        super(cardID, issuerBank, bankAccount, balanceAmount);
        super.setClientName(clientName);
        this.pinNumber = pinNumber;
        this.withdrawalAmount = 0;
        this.hasWithdrawn = false;
        this.dateOfWithdrawal = "";
    }

    // accessor method
    public int getPinNumber() {
        return this.pinNumber;
    }

    public int getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

    public String getDateOfWithdrawal() {
        return this.dateOfWithdrawal;
    }

    public boolean getHasWithdrawn() {
        return this.hasWithdrawn;
    }

    // mutator method for withdrawlAmount
    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    // method to deduct money directly from client account
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber) {
        if (this.pinNumber == pinNumber) {

            if (super.getBalanceAmount() >= this.withdrawalAmount) {
                
                this.setWithdrawalAmount(withdrawalAmount);
                this.hasWithdrawn = true;
                this.dateOfWithdrawal = dateOfWithdrawal;
                int remainingBalance = super.getBalanceAmount() - withdrawalAmount;
                super.setBalanceAmount(remainingBalance);
                System.out.println("Withdraw Successful!");
            } else {
                System.out.println(" Insufficient balance ,please check your balance.");
            }
        } else {
            System.out.println("Invalid pin,please try again");
        }
    }
    

    // display method to display necessary information
    public void display() {
        super.display();
        if (this.hasWithdrawn == true) {
            System.out.println("Withdraw Successful!");
            System.out.println("Pin Number : " + this.pinNumber);
            System.out.println("Withdrawal Amount : " + this.withdrawalAmount);
            System.out.println("Date of withdrawal : " + this.dateOfWithdrawal);
        } else {

            System.out.println("Balance amount of " + super.getClientName() + " is "+ super.getBalanceAmount());
        }

    }
}
