public class Customer {
    private int Id;
    private String Name;
    private String Address;
    private int PhoneNo;
    private int AcctNo;

    public Customer(int acctNo, String address, int id, String name, int phoneNo) {
        AcctNo = acctNo;
        Address = address;
        Id = id;
        Name = name;
        PhoneNo = phoneNo;
    }
    public void GeneralInquiry(){
            System.out.println("General Inquiry");
        }

        public void depositMoney(){
            System.out.println("Deposit Money");
        }

        public void withdrawMoney(){
            System.out.println("Withdraw Maney");
        }
        public void openAccount(){
            System.out.println("Open Account");
        }

        public void closeAccount(){
            System.out.println("Close Account");
        }
        public void applyForloen(){
            System.out.println("Apply Fpr Loan");
        }
        public void requestCard(){
            System.out.println("Request Card");
        }
}
