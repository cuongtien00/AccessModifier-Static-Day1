package accessModifier;

public class Circle {
    private int radius;
    private String color;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    int getRadius(){
        return this.radius;
    }
    double getArea(){
        return Math.PI*radius*radius ;
    }
}
