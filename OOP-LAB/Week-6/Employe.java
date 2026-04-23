public class Employe {

    private static String name;
    private static String title;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void information (){
        System.out.println("Hi i am " + name + " and i am a " + title);
    }

    public static void main(String[] args) {
        Employe emp1 = new Employe();
        emp1.setName("John Doe");
        emp1.setTitle("Software Engineer");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Title: " + emp1.getTitle());

        Employe emp2 = new Employe();
        emp2.setName("Jane Smith");
        emp2.setTitle("Project Manager");
        

        emp1.information();
        emp2.information();
    }
}
