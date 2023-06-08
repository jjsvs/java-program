class Student {
    int rollNo;
    String name;
    int studentId;

    // Input-Output method
    int displayStudentDetails(int rollNo, int studentId) {
        return rollNo;
    }

    // Input-No Output method
    void setStudentDetails() {
        int rollNo = 0;
        String name = "";
        int studentId = 0;
        System.out.println("student details");
    }

    // No Input-Output method
    int getStudentName() {
        return rollNo;
    }

    // No Input-No Output method
    void StudentDetails() {
    }
}

class Employee {
    int employeeId;
    String name;
    float salary;

    // Input-Output method
    float displayEmployeeId(int employeeId) {
        return employeeId;
    }

    // Input-No Output method
    void EmployeeDetails(int employeeId, String name, float salary) {
        System.out.println("employee details");
    }

    // No Input-Output method
    String getEmployeeName() {
        return name;
    }

    // No Input-No Output method
    void Employee() {
    }
}

class Teacher {
    int id;
    String name;
    float salary;

    // Input-Output method
    String displayTeacherName(String name) {
        return name;
    }

    // Input-No Output method
    void TeacherDetails(int id, String name, float salary) {
        System.out.println("Teacher Details");
    }

    // No Input-Output method
    void getTeacherName() {
        System.out.println("Teacher Name");
    }

    // No Input-No Output method
    void resetTeacherDetails() {
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.rollNo = 10; // Initialize rollNo
        student.name = "abnj"; // Initialize name
        student.studentId = 12345; // Initialize studentId

        Employee employee = new Employee();
        employee.employeeId = 100; // Initialize employeeId
        employee.name = "auy"; // Initialize name
        employee.salary = 5000.0f; // Initialize salary

        Teacher teacher = new Teacher();
        teacher.id = 1; // Initialize id
        teacher.name = "rdr"; // Initialize name
        teacher.salary = 6000.0f; // Initialize salary


    }
}
