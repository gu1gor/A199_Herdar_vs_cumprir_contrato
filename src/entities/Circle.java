package entities;

import model.enums.Color;

public class Circle extends Shape {
    
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }
    
    
    
    
    
    
}
