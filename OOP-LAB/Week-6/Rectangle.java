public class Rectangle {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.setLength(5.0);
        rect1.setWidth(3.0);
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.area());

        Rectangle rect2 = new Rectangle();
        rect2.setLength(7.0);
        rect2.setWidth(4.0);
        System.out.println("Length: " + rect2.getLength());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Area: " + rect2.area());
    }
}
