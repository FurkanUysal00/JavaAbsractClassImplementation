public class Circle extends Shape{
    private double radius;
    public Circle(double x,double y,double radius){
        super(x,y);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    double calculateCircumference() {
        return 2*Math.PI*radius;
    }
}
