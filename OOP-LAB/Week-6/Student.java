import java.util.Scanner;

public class Student {
    private String name;
    private Double marks;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setMarks(Double marks){
        if(marks > 0 && marks <= 100 ){
            this.marks = marks;
        }else{
            return;
        }
        
    }
    public Double getMarks(){
        return marks;
    }

    public char grade(){
        if(marks >= 90){
            return 'A';
        }
        else if(marks >= 80){
            return 'B';
        }
        else if(marks >= 70){
            return 'C';
        }
        else if(marks >= 60){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    public static void main(String[] args){
        Student st = new Student();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the name of the student : ");
        String name = s.nextLine();

        System.out.print("Enter the marks of the student : ");
        Double marks = s.nextDouble();


        st.setName(name);
        st.setMarks(marks);

        System.out.println("Student Name : " + st.getName());
        System.out.println("Student Marks : " + st.getMarks());

        System.out.println("Student Grade : " + st.grade());
    }
}
