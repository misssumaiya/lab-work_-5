package ProblemE8_12;

import java.awt.geom.Point2D;

public class GeometryAngleSlopeRunner {

    public static void main(String[] args) {
        Point2D.Double p = new Point2D.Double(1,2);
        Point2D.Double q = new Point2D.Double(4,4);

        double angle = GeometryAnglaSlope.angle(p,q);
        double slope = GeometryAnglaSlope.slope(p,q);

        System.out.printf("angle is: %.3f\n",angle);
        System.out.printf("slope is: %.3f\n",slope);


    }
}
