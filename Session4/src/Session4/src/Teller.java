public class Teller {

        private int id;
        private String name;

        public Teller(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void collectMoney() {
            System.out.println("Collecting Money");
        }

        public void openAccount() {
            System.out.println("Opening Account");
        }

        public void closeAccount() {
            System.out.println("Closing Account");
        }

        public void loanRequest() {
            System.out.println("Loan Request");
        }

        public void provideInfo() {
            System.out.println("Providing Information");
        }

        public void issueCard() {
            System.out.println("Issuing Card");
        }
    }


