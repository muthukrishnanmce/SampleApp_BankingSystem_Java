public class Bank {

    static String BankName = "MKBanks";

    int CurrentBankBalance;

    public void creditAmount(Customer cust,int amountToCredit) {
        cust.CurrentBalance = cust.CurrentBalance + amountToCredit;
        CurrentBankBalance = CurrentBankBalance + amountToCredit;

    }

    public void debitAmount(Customer cust, int amountToDebit) {
        cust.CurrentBalance = cust.CurrentBalance - amountToDebit;
        CurrentBankBalance = CurrentBankBalance - amountToDebit;
    }

    public void transferMoney(Customer cust1, Customer cust2,int amount) {

        cust1.CurrentBalance = cust1.CurrentBalance - amount;
        cust2.CurrentBalance = cust2.CurrentBalance + amount;

    }

}
