package application;

import entities.Circle;
import entities.Retangle;
import entities.Shape;
import model.enums.Color;

public class Program {

    public static void main(String[] args) {

        Shape s1 = new Circle(Color.BLACK, 2.0);
        Shape s2 = new Retangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Retangle area: " + String.format("%.3f", s1.area()));
        System.out.println("Retangle color: " + s2.getColor());
        System.out.println("Retangle area: " + String.format("%.3f", s2.area()));

    }

}
