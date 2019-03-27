package A3_p5;

public class Staff extends Employee{
    private String title;
    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, int salary) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = "STAFF";
    }

    @Override
    public void ToString() {
        System.out.println("Class : Staff :: Name : "+super.getName());
    }


}
