package lab14;

public interface operations {
    public int withdraw(Account account_number,int ammount );
    public int deposite(Account account_number,int amount );
    public int transfer(Account account_number,int amount );
    public int balance_inquiry(Account account_number);

}
