 
public class BankCard
{   
    
    //instance variable
    private int cardID,balanceAmount;
    private String clientName,issuerBank,bankAccount;
    
    // constructor of BankCard class
    public BankCard(int cardID,String issuerBank,String bankAccount,int balanceAmount)
    {
        this.cardID=cardID;
        this.issuerBank=issuerBank;
        this.bankAccount=bankAccount;
        this.balanceAmount=balanceAmount;
        this.clientName="";
    }
    
    // getter methods
    public int getCardID()
    {
        return this.cardID;
    }
    
    public int getBalanceAmount()
    {
        return this.balanceAmount;
    }
    
    public String getIssuerBank()
    {
        return this.issuerBank;
    }
    
    public String getBankAccount()
    {
        return this.bankAccount;
    }
    
    public String getClientName()
    {
        return this.clientName;
    }
    
    // setter methods
    public void setClientName(String clientName)
    {
        this.clientName=clientName;
    }
    
    public void setBalanceAmount(int balanceAmount)
    {
        this.balanceAmount=balanceAmount;
    }
    
    // display method to display necessary information
    public void display()
    {
        if (clientName .equals("")){
            System.out.println("This Name doesnot match with any registered client.");
        }
        else {
            System.out.println("Name of client : "+clientName);
            System.out.println("Card ID : "+ cardID);
            System.out.println("Balance Amount : " +balanceAmount);
            System.out.println("Name of Issuer Bank : "+issuerBank);
            System.out.println("Bank Account of client : " +bankAccount);
        }
    }
}
