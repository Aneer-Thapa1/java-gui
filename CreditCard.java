 

/**
 
 * @author (Anir Jung Thapa)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    // instance variable 
    private int cvcNumber,gracePeriod;
    private double interestRate,creditLimit;
    private String expirationDate;
    private boolean isGranted;
    public CreditCard(int cardID,String clientName,String issuerBank,String bankAccount,int balanceAmount,int cvcNumber,double interestRate,String expirationDate)
    {
        super(cardID,issuerBank,bankAccount,balanceAmount);
        super.setClientName(clientName);
        this.cvcNumber=cvcNumber;
        this.interestRate=interestRate;
        this.expirationDate=expirationDate;
        this.isGranted=false;
    }

    // Constructor of DebitCard class
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }

    public double getCreditLimit()
    {
        return this.creditLimit;
    }

    public int getGracePeriod()
    {
        return this.gracePeriod;
    }

    public double getInterestRate()
    {
        return this.interestRate;
    }

    public String getExpirationDate()
    {
        return this.expirationDate;
    }

    public boolean getIsGranted()
    {
        return this.isGranted;
    }

    // method to set credit limit
    public void creditLimit(double creditLimit,int gracePeriod)
    {   
        if(isGranted==false){

            if (creditLimit<= 2.5 * super.getBalanceAmount()){
                this.isGranted=true;
                this.creditLimit=creditLimit;
                this.gracePeriod=gracePeriod;
                System.out.println("credit limit of "+ this.creditLimit +" is set to client "+ super.getClientName());
            }
            else{
                System.out.println("Sorry credit cannot be granted to "+super.getClientName()+", Thank you!");
            }

        }
        else{
            System.out.println("Credit cannot be granted to "+ super.getClientName());

        }
    }

    // method to cancel credit card
    public void cancelCreditCard()
    {
        this.cvcNumber=0;
        this.interestRate=0;
        this.expirationDate="";
        this.isGranted=false;
        this.creditLimit=0;
        this.gracePeriod=0;
    }

    // method to display information
    public void display()
    {
        System.out.println("Your Interest Rate is "+ this.interestRate);
        System.out.println("Your Expiration date of credit  is "+ this.expirationDate);
        if (this.isGranted==true){
            super.display();
            System.out.println("CVC Number : "+this.cvcNumber);
            System.out.println("Credit Limit of  "+this.creditLimit + " is set for " + super.getClientName() );
            System.out.println("Grace Period for "+ super.getClientName()+ " is " +this.gracePeriod);
        }
    }
}

