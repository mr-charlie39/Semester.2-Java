public class weight {
    private double kg;
    public double gram;

    public weight() {
        this.kg = 0.0;
        this.kg = 0.0;
    }

    public weight(double kgg , double garmm) {
        this.kg = kgg;
        this.gram = garmm;
    }

    public void add(weight w1 , weight w2){
        kg = w1.kg + w2.kg;
        gram = w1.gram + w2.gram;

        if(gram >= 1000) {
            kg = gram / 1000;
            gram = gram % 1000;
        }
        
    }

    public void display() {
        System.out.println("Kilogram is : " + kg);
        System.out.println("Grams are : " + gram);
    }

    public static void main (String[] args){
        weight w1 = new weight(40 , 50);
        weight w2 = new weight(20 , 39);
        weight w3 = new weight();

        w3.add(w1, w2);

        System.out.println("First Object");
        w1.display();
        System.out.println("Second Object");
        w2.display();

        System.out.println("Thhird Final Object");
        w3.display();
    }
}
