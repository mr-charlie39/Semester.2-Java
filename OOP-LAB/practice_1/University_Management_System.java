import java.util.scanner;
abstract class Person {
    String name;
    int age;
    String email;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int  getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public abstract void displayInfo();
}

class Student extends Person {
    String id;
    int semester;
    double gpa;

    public void enrollCourse(){
        System.out.println("Enrolling in course...");
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + gpa);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public string getId() {
        return id;
    }

    public int getSemester() {
        return semester;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
}

class Teacher extends Person {
    String employeeId;
    String department;

    public void teachCourse() {
        System.out.println("Teaching course...");
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }
}