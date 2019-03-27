package A3_p5;

public abstract class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name,String address, String phoneNumber, String emailAddress)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void ToString()
    {
        System.out.println("Class : Person ::  Name : "+this.name);
    }

    public String getName()
    {
        return this.name;
    }
}
