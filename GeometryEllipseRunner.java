package ProblemE8_11;

import java.awt.geom.Ellipse2D;

public class GeometryEllipseRunner {
    public static void main(String[] args) {

        GeometryEllipse geometry = new GeometryEllipse();
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0,0,3,2);

        double perimeter = geometry.perimeter(ellipse);
        double area = geometry.area(ellipse);

        System.out.printf("area is: %.3f\n",area);
        System.out.printf("perimeter is: %.3f\n",perimeter);

    }
}
