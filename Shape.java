
public abstract class Shape {
    protected double area;
    protected double perimeter;
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
    }
}
