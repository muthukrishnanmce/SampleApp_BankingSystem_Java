public class Customer {

    String CustName;
    int CustID;
    int OpeningBalance;
    int CurrentBalance;
    String CustAddress;

//    Customer(String CustName,int OpeningBalance) {
//        this.CustName = CustName;
//        this.OpeningBalance = OpeningBalance;
//    }

//    void setCustID(int CustID) {
//        this.CustID = CustID;
//    }

    void updateCustAddress(String address) {
        CustAddress = address;
    }

}
