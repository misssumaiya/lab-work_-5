package ProblemE8_8;

public class Cube {
private  double height;

    public Cube(double height) {
        this.height = height;
    }
    public double getVolume(){
        double volume=Math.pow(height,2);
        return volume;
    }

    public double getSurfaceArea(){
        double surfaceArea = 6*Math.pow(height,2);
        return surfaceArea;
    }
}
