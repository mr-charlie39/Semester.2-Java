class Employee {

    protected String fullName;
    protected int age;

    Employee(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    String toStringInfo() {
        return "Name: " + fullName + "\nAge: " + age;
    }
}

class ProjectManager extends Employee {

    private double bonus;

    ProjectManager(String fullName, int age, double bonus) {
        super(fullName, age);
        this.bonus = bonus;
    }

    void show() {
        System.out.println(toStringInfo());
        System.out.println("Bonus: " + bonus);
    }
}

public class Main {
    public static void main(String[] args) {

        ProjectManager pm =
                new ProjectManager("Ali Ahmed", 35, 50000);

        pm.show();
    }
}