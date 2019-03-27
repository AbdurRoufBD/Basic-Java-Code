package A3_p5;

public class Student extends Person {
    private final String classStatus;

    public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    @Override
    public void ToString() {
        System.out.println("Class : Student :: Name : "+super.getName());
    }
}
