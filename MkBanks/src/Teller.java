import java.util.Scanner;

public class Teller {

    public static void main(String args[]) {


        Customer customer[] = new Customer[10];
        Bank bank = new Bank();

        int TotalCustomer = 0;

        Scanner scanner = new Scanner(System.in);




        while(true) {

            System.out.println("1 for Adding Customer");
            System.out.println("2 for Viewing Customer Details");
            System.out.println("3 Deposit Money for a customer");
            System.out.println("4 Withdraw Money from a customer");
            System.out.println("5 Transfer Money");
            System.out.println("0 to Exit the system");
            System.out.println("Enter your option! ");

            int option = scanner.nextInt();

            if(option == 0) break;

            switch(option) {



                case 1:
                    customer[TotalCustomer] = new Customer();
                    customer[TotalCustomer].CustID = TotalCustomer+1;
                    customer[TotalCustomer].CustName = "customer" + TotalCustomer;
                    customer[TotalCustomer].OpeningBalance = 500;
                    customer[TotalCustomer].CurrentBalance = 500;
                    TotalCustomer++;
                    System.out.println("Customer is added to the bank records");
                    break;

                case 2:
                    System.out.println("*************MK Banking Systems - Customer list*****************");
                    System.out.println("Name:              ID:                CurrentBalance");
                    for(int i=0;i<TotalCustomer;i++) {

                        System.out.println(customer[i].CustName + "              "+ customer[i].CustID + "                "+ customer[i].CurrentBalance);
                    }
                    System.out.println("****************************************************************");
                    break;

                case 3:
                    System.out.println("Enter the custID");
                    int custSelectionID = scanner.nextInt();
                    if(custSelectionID>0 && custSelectionID<10) {
                        System.out.println("Enter the amount to be deposited");
                        int Depositamount = scanner.nextInt();
                        bank.creditAmount(customer[custSelectionID - 1], Depositamount);
                        System.out.println("Amount deposited");
                    }
                    break;

                case 4:
                    System.out.println("Enter the custID");
                    int custSelectionID1 = scanner.nextInt();
                    if(custSelectionID1>0 && custSelectionID1<10) {
                        System.out.println("Enter the amount to be withdrawn");
                        int WithDrawAmount = scanner.nextInt();
                        bank.debitAmount(customer[custSelectionID1 - 1], WithDrawAmount);
                        System.out.println("Amount Withdrawn");
                    }
                    break;

                case 5:
                    System.out.println("Enter the custID 1");
                    int custSelectionIDFrom = scanner.nextInt();
                    if(custSelectionIDFrom>0 && custSelectionIDFrom<10) {
                        System.out.println("Enter the amount to be Transferred");
                        int TransferAmount = scanner.nextInt();
                        System.out.println("Enter the custID 2");
                        int custSelectionIDTo = scanner.nextInt();
                        bank.transferMoney(customer[custSelectionIDFrom-1],customer[custSelectionIDTo-1],TransferAmount);
                        System.out.println("Amount Transferred");
                    }
                    break;


                default:
                    break;


            }


        }





//        Customer muthu = new Customer("Muthu",500);
//        muthu.updateCustAddress("Chennai , India");
//
//        Customer krishnan = new Customer("Krishnan",1000);
//
//        Bank bank = new Bank();
//
//        System.out.println("Bank Current Balance:" + bank.CurrentBankBalance );
//
//        bank.creditAmount(muthu,1000);
//
//        System.out.println("Bank Current Balance after credit:" + bank.CurrentBankBalance );
//
//
//        System.out.println("Muthu Current Balance after credit:" + muthu.CurrentBalance );
//
//        bank.transferMoney(muthu,krishnan,200);
//
//        System.out.println("Muthu Current Balance after tranfser:" + muthu.CurrentBalance );
//
//        System.out.println("Krishnan Current Balance after tranfser:" + krishnan.CurrentBalance );
//
//        System.out.println("Bank Current Balance after transfer:" + bank.CurrentBankBalance );


    }

}
