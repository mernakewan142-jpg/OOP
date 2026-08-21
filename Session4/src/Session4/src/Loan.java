public class Loan {
    private int Id;
    private String Type;
    private int AccountId;
    private int CustomerId;

    public Loan(int accountId, int customerId, int id, String type) {
    AccountId = accountId;
    CustomerId = customerId;
    Id = id;
    Type = type;
}
}
