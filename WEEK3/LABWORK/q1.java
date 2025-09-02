class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double Balance;

    private static int totalAccounts = 0;
    private static int accountCounter = 1;

    public BankAccount(String accountHolderName , double initialDeposite){
        if(initialDeposite < 0){
            System.out.println("Amount Deposited can't be 0");
            initialDeposite = 0;
        }
        this.accountHolderName = accountHolderName;
        this.Balance = initialDeposite;
        this.accountNumber = generateAccountNumber();
        totalAccounts++;
    }

    public void deposite(double amount){
        if(amount <= 0){
            System.out.println("Amount deposied should be greater than 0");
            return;
        }else{
            Balance += amount;
            System.out.println("₹ " + amount + " was successfully deposited into " + accountNumber);
        }
    }
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Withdrawal amount must be Positive");
            return;
        }
        else if(amount > Balance){
            System.out.println("You can't withdraw more than your balance");
        }
        else{
            Balance -= amount;
            System.out.println("₹ " + amount + " was successfully withdrawn from " + accountNumber);
        }
    }
    public double CheckBalance(){
        return Balance;
    }
    public void AccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance in ₹ " + Balance);
        System.out.println("----------------END----------------");
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public static String generateAccountNumber(){
        String accNo = String.format("ACC%03d" , accountCounter);
        accountCounter++;
        return accNo;
    }
}
public class q1 {
    public static void main(String[] args){

        BankAccount[] accounts = new BankAccount[5];
        int accountCount = 0;

        accounts[accountCount++] = new BankAccount("Himanshu" , 1000);
        accounts[accountCount++] = new BankAccount("Krishna", 2000);
        accounts[accountCount++] = new BankAccount("Srishtan", 500);

        accounts[0].deposite(500);    
        accounts[1].withdraw(1000);  
        accounts[2].withdraw(1000);

        for (int i = 0; i < accountCount; i++) {
            accounts[i].AccountInfo();
        }

         System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
    }
}
