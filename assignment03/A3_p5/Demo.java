package A3_p5;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Hriday","Mirpur-12","123456789","hriday@gamil.com") {};
        person.ToString();

        Person employee = new Employee("Hakim","Mirpur-2","987654321","hakim@gmail.com","room-104",20000) {
        };
        employee.ToString();

        Person student = new Student("Rouf","Azimpur","124578369","rouf@gmail.com","freshman");
        student.ToString();

        Person staff = new Staff("Richard Barui","Mirpur-2","15935782","richard@gmail.com","room-101",7500);
        staff.ToString();

        Person faculty = new Faculty("Dr. Mohammad Rezwanul Huq","Gulshan-2","1593574613","drmuhammadrezwanulhuq@gmail.com","room-504",75000);
        faculty.ToString();
    }
}

