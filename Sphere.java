package ProblemE8_8;

public class Sphere {
    private double radious;

    public Sphere(double radious) {
        this.radious = radious;
    }

    public double getVolume(){
        double volume = (4.0/3.0)*Math.PI*Math.pow(radious,3);
        return volume;
    }
    public double getSurfaceArea(){
        double surfaceArea = 4.0*Math.PI*Math.pow(radious,2);
        return surfaceArea;
    }
}
