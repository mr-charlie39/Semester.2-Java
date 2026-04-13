import java.util.Scanner;

class SmartUniversityManagementSystem {

    static final Scanner s = new Scanner(System.in);

    String[] name;
    float[] marks;
    int[] attendance;
    double[] feepaid;

    public SmartUniversityManagementSystem(int n) {
        name = new String[n];
        marks = new float[n];
        attendance = new int[n];
        feepaid = new double[n];
    }

    public void setData(int i, String name, int attendance, float marks, double feepaid) {
        this.name[i] = name;
        this.attendance[i] = attendance;
        this.marks[i] = marks;
        this.feepaid[i] = feepaid;
    }

    public void detail(int j) {
        System.out.println("Name: " + name[j]);
        System.out.println("Attendance: " + attendance[j]);
        System.out.println("Marks: " + marks[j]);
        System.out.println("Fee Paid: " + feepaid[j]);
    }

    public void grade(int n) {
        if (attendance[n] < 75) {
            System.out.println("Not Eligible");
        } else if (marks[n] > 85) {
            System.out.println("Grade A");
        } else if (marks[n] >= 70) {
            System.out.println("Grade B");
        } else if (marks[n] >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }

    public void calculateFee(int creditHours) {
        int perCredit = 2000;
        double total = perCredit * creditHours;
        System.out.println("Total Fee: " + total);
    }

    public void calculateFee(int creditHours, boolean scholarship) {
        System.out.print("Enter Scholarship Amount: ");
        double scholarshipAmount = s.nextDouble();

        int perCredit = 2000;
        double total = (perCredit * creditHours) - scholarshipAmount;

        System.out.println("Total Fee: " + total);
    }

    public static void main(String[] args) {

        System.out.print("Enter number of students: ");
        int n = s.nextInt();
        s.nextLine(); // clear buffer

        SmartUniversityManagementSystem st = new SmartUniversityManagementSystem(n);

        for (int i = 0; i < n; i++) {

            System.out.print("Enter name: ");
            String name = s.nextLine();

            System.out.print("Enter attendance: ");
            int attendance = s.nextInt();

            System.out.print("Enter marks: ");
            float marks = s.nextFloat();

            System.out.print("Enter fee paid: ");
            double feePaid = s.nextDouble();
            s.nextLine(); // clear buffer

            st.setData(i, name, attendance, marks, feePaid);
        }

        System.out.println("\n1- Display\n2- Search\n3- Exit");
        int choose = s.nextInt();
        s.nextLine();

        switch (choose) {

            case 1:
                for (int j = 0; j < n; j++) {
                    st.detail(j);
                    st.grade(j);
                }
                break;

            case 2:
                System.out.print("Enter name to search: ");
                String searchName = s.nextLine();

                boolean found = false;

                for (int j = 0; j < n; j++) {
                    if (st.name[j].equalsIgnoreCase(searchName)) {
                        st.detail(j);
                        st.grade(j);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found");
                }
                break;

            case 3:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }
}