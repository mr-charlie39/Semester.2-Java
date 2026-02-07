public class Program_11 {
    public static void main(String[] args){
        employee e = new employee();

        e.setName("Muhammad Ali Abid");
        e.setAge(20);
        e.setSalary(100000);

        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("Salary: " + e.getSalary());
        
    }
}

class employee{
   private String name;
   private int age;
   private double salary;

   public String getName(){
    return name;
   }
   public void setName(String name){
    this.name = name;
   }

   public int getAge(){
    return age;
   }
   public void setAge(int age){
    this.age = age;
   }

   public double getSalary(){
    return salary;
   }
   public void setSalary(double salary){
    this.salary = salary;
   }
}
