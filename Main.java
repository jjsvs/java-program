abstract class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void displayDetails();
}

class Student extends Person {
    int rollNo;

    public Student(int id, String name, int rollNo) {
        super(id, name);
        this.rollNo = rollNo;
    }

    @Override
    void displayDetails() {
        System.out.println("Student Name: " + name + ", Student Id: " + id + ", Roll No: " + rollNo);
    }
}

class Employee extends Person {
    float salary;

    public Employee(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    void displayDetails() {
        System.out.println("Employee Name: " + name + ", Employee Id: " + id + ", Salary: " + salary);
    }
}

class Teacher extends Person {
    float salary;

    public Teacher(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher Name: " + name + ", Teacher Id: " + id + ", Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Person student = new Student(12345, "abnj", 10);
        Person employee = new Employee(100, "auy", 5000.0f);
        Person teacher = new Teacher(1, "rdr", 6000.0f);

        student.displayDetails();
        employee.displayDetails();
        teacher.displayDetails();
    }
}
