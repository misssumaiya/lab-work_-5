package ProblemE8_8;

public class Cone {
    private double height,radious;
    public Cone(double height,double radious) {
        this.height = height;
        this.radious=radious;
    }
    public double getVolume(){
        double volume = (1.0/3.0)*Math.PI*Math.pow(radious,2)*height;
        return volume;
    }

    public  double getSurfaceArea(){
        double surfaceArea = Math.PI*radious*(radious+ Math.sqrt(Math.pow(radious,2) + Math.pow(height,2)));
        return surfaceArea;
    }



}
