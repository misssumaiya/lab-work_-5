package ProblemE8_8;

public class Cylinder {
    private double height,radious;

    public Cylinder(double height,double radious) {
        this.height = height;
        this.radious = radious;
    }
    public double getVolume(){
        double volume = Math.PI*Math.pow(radious,2)*height;
        return volume;
    }
    public double getSurfaceArea(){
        double surfaceArea = 2.0*radious*Math.PI*(radious+height);
        return surfaceArea;
    }
}
