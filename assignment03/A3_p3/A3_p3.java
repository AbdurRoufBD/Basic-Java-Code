package A3_p3;

public class A3_p3 {

    public static void main(String[] args) {
        Account account = new Account(1122,20000,4.5);
        account.withDraw(2500);
        account.Deposit(3000);

        System.out.println("ID : "+account.getId());
        System.out.println("Balance : "+account.getBalance());
        System.out.println("Monthly Interest : "+account.getMonthlyInterestAmount());
        System.out.println("The account was created : "+account.getDateCreated().getTime());

    }
}
