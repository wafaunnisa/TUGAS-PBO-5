
public class Circle extends Shape {
    protected Double radius;

    public Circle(Double radius, String name){
        super.setName(name);
        this.calculateArea(radius);
        this.calculatePerimeter(radius);
    }

    public void calculateArea(Double radius){
        super.area = Math.PI * Math.pow(radius, 2);
    }

    public void calculatePerimeter(Double radius){
        super.perimeter = 2 * Math.PI * radius;
    }
}
