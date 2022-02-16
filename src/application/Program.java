package application;

import entities.AbstractShape;
import entities.Circle;
import entities.Retangle;
import model.enums.Color;

public class Program {

    public static void main(String[] args) {

       /* Shape s1 = new Circle(Color.BLACK, 2.0);
        Shape s2 = new Retangle(Color.WHITE, 3.0, 4.0);*/
       
        AbstractShape a1 = new Circle(Color.BLACK, 2.0);
        AbstractShape a2 = new Retangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + a1.getColor());
        System.out.println("Retangle area: " + String.format("%.3f", a1.area()));
        System.out.println("Retangle color: " + a2.getColor());
        System.out.println("Retangle area: " + String.format("%.3f", a2.area()));

    }

}
