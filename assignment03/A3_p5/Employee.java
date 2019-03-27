package A3_p5;

import java.util.Calendar;

public abstract class Employee extends  Person{

    private String office;
    private int Salary;
    private Calendar dateHired;
    public Employee(String name, String address, String phoneNumber, String emailAddress,String office,int salary) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.Salary = salary;
        this.dateHired = Calendar.getInstance();
    }

    @Override
    public void ToString() {
        System.out.println("Class : Employee :: Name : "+super.getName());
    }
}
