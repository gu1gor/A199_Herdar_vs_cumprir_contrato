package entities;

import model.enums.Color;

public class Retangle extends AbstractShape {
    
    private double widht;
    private double height;

    public Retangle(Color color, double widht, double height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

   
    
    

    public double area() {
        return widht * height;
    }
    
    
    
    
}
