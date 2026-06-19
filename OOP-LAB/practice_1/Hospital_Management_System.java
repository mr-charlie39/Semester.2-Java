import java.util.Scanner;

public class Hospital_Management_System {
    private String Name;
    private String Gender;
    private int Age;

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int Age){
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }

    public void setGender(String Gender){
        this.Gender = Gender;
    }

    public String getGender() {
        return Gender;
    }

    public void display() {
        System.out.println("Name is : " + Name);
        System.out.println("Age is : " + Age);
        System.out.println("Gender is : " + Gender);
    }
}

class Doctor extends Hospital_Management_System {
    private String specialization;
    private double Fee;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }

    public void setFee(double Fee) {
        this.Fee = Fee;
    }

    public double getFee() {
        return Fee;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Specialization is : " + specialization);
        System.out.println("Fee is : " + Fee);
    }
}
class Patient extends Hospital_Management_System {
    private String Disease;
    private String Doctor_Name;

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

    public String getDisease() {
        return Disease;
    }

    public void setDoctor_Name(String Doctor_Name) {
        this.Doctor_Name = Doctor_Name;
    }

    public String getDoctor_Name() {
        return Doctor_Name;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Disease is : " + Disease);
        System.out.println("Doctor Name is : " + Doctor_Name);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Doctor d = new Doctor();
        System.out.println("-------- DOCTOR RECORD --------");
        System.out.print("Enter Doctor Name :");
        d.setName(s.nextLine());
        System.out.print("Choose Gender : \n 1- Male. \n 2- Female : ");
        int genderChoice = s.nextInt();
        s.nextLine(); 
        if (genderChoice == 1) {
            d.setGender("Male");
        } else {
            d.setGender("Female");
        }
        System.out.print("Enter Doctor Age :");
        d.setAge(s.nextInt());
        s.nextLine(); // Consume the newline character
        System.out.print("Enter Doctor Specialization :");
        d.setSpecialization(s.nextLine());
        System.out.print("Enter Doctor Fee :");
        d.setFee(s.nextDouble());
        s.nextLine(); 
        d.display();

        System.out.println("-------- PATIENT RECORD --------");
        Patient p = new Patient();
        System.out.print("Enter Patient Name :");
        p.setName(s.nextLine());
        System.out.print("Enter Patient Age :");
        p.setAge(s.nextInt());
        s.nextLine(); // Consume the newline character
        System.out.print("Enter Patient Gender :");
        p.setGender(s.nextLine());
        System.out.print("Enter Patient Disease :");
        p.setDisease(s.nextLine());
        System.out.print("Enter Doctor Name :");
        p.setDoctor_Name(s.nextLine());
        p.display();
    } 
}