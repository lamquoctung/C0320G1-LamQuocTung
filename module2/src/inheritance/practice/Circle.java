package inheritance.practice;

public class Circle extends Shape{
    private double radius= 1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color, boolean fill){
        super(color,fill);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius *Math.PI;
    }

    @Override
    public String toString(){
        return "A circle with radius"
                + getRadius() 
                + "with a subclass of "
                +super.toString();
    }
}