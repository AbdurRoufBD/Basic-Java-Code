package A3_p3;

import java.util.Calendar;

public class Account {
    private int id;
    private double balance;
    private double annualtInterestrate;
    private Calendar dateCreated;

    public Account()
    {
        this.id = 0;
        this.balance = 0;
        this.annualtInterestrate = 0;
        this.dateCreated = Calendar.getInstance();
    }

    public Account(int id,double balance,double annualtInterestrate)
    {
        this.id = id;
        this.balance = balance;
        this.annualtInterestrate = annualtInterestrate;
        this.dateCreated = Calendar.getInstance();
    }

    public double getMonthlyInterestRate()
    {
        return annualtInterestrate/12;
    }

    public double getMonthlyInterestAmount()
    {
        return (this.getMonthlyInterestRate()/100)*balance;
    }

    public void withDraw(double balance)
    {
        if(balance > this.balance) {
            System.out.println("Invalid amount");
        }
        else
        {
            this.balance = this.balance - balance;
            System.out.println("Before withdraw Balance is : $"+(this.balance+balance)+" After withdraw balance is : "+this.balance);
        }
    }

    public  void Deposit(double amount)
    {
        if(amount<=0)
        {
            System.out.println("Invalid amount you entered");
        }
        else
        {
            this.balance = this.balance + amount;
            System.out.println("Before deposit Balance is : $"+(this.balance-amount)+" After withdraw balance is : "+this.balance);
        }
    }


    public void insertBalance(double balance)
    {
        this.balance = balance;
    }

    public void insertAnnualInterestrate(double annualtInterestrate)
    {
        this.annualtInterestrate = annualtInterestrate;
    }

    public  void insertAnId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return this.id;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public double getAnnualtInterestrate() {
        return annualtInterestrate;
    }

    public double getBalance() {
        return balance;
    }
}
