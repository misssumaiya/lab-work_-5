package ProblemE8_12;

import java.awt.geom.Point2D;

public class GeometryAnglaSlope {
    public static double angle(Point2D.Double p,Point2D.Double q){
        double angle,xLength,ylength;
        if(p.getX()>q.getX() && p.getY()>q.getY()){
            xLength = p.getX() - q.getX();
            ylength = p.getY() - q.getY();

            angle = Math.atan2(ylength,xLength);
            angle = Math.toDegrees(angle);
            angle = angle + 180;

            return  angle;
        }
        else if (p.getX()<q.getX() && p.getY()<q.getY()) {

            xLength = q.getX() - p.getX();
            ylength = q.getY() - p.getY();

            angle = Math.atan2(ylength,xLength);
            angle = Math.toDegrees(angle);
            angle = angle + 0;

            return angle;
        }
        else if (p.getX()>q.getX() && q.getY()>p.getY()) {
            xLength = p.getX() - q.getX();
            ylength = q.getY() - p.getY();

            angle = Math.atan2(ylength,xLength);
            angle = Math.toDegrees(angle);
            angle = angle + 90;

            return angle;

        }
        else if(p.getX()<q.getX() && p.getY()>q.getY()){
            xLength = q.getX() - p.getX();
            ylength = p.getY() - q.getY();

            angle = Math.atan2(ylength,xLength);
            angle = Math.toDegrees(angle);

            angle = 360 - angle;

            return angle;
        }
        else {
            angle = 0;
        }

        return angle;
    }


    public static double slope(Point2D.Double p,Point2D.Double q){

        double slope;
        double deltaY = q.getY() - p.getY();
        double deltaX = q.getX() - p.getX();

        slope = deltaY/deltaX;

        return slope;
    }
}
