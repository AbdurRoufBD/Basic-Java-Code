package A3_p5;

public class Faculty extends Employee{
    private String title;
    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, int salary) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = "FACULTY";
    }

    @Override
    public void ToString() {
        System.out.println("Class : Faculty :: Name : "+super.getName());
    }


}
