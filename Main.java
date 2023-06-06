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
        int rollNo;
        String name;
        int studentId;
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
