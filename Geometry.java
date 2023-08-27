package ProblemE8_7;

public class Geometry {


    public  double cubeVolume(double h){

      double volume = Math.pow(h,3);
      return volume;
    }
    public  double cubeSurface(double h){

     double surfaceArea = 6*Math.pow(h,2);
     return surfaceArea;
    }
    public  double sphereVolume(double r){

       double volume = (4.0/3.0)*Math.PI*Math.pow(r,3);
       return volume;
    }
    public  double sphereSurface(double r){

      double surfaceArea = 4.0*Math.PI*Math.pow(r,2);
      return surfaceArea;
    }
    public  double cylinderVolume(double r,double h){

        double volume = Math.PI*Math.pow(r,2)*h;
        return volume;

    }
    public  double cylinderSurface(double r,double h){

        double surfaceArea = 2.0*r*Math.PI*(r+h);
        return surfaceArea;

    }
    public  double coneVolume(double r,double h){

        double volume = (1.0/3.0)*Math.PI*Math.pow(r,2)*h;
        return volume;

    }
    public  double coneSurface(double r,double h){

        double surfaceArea = Math.PI*r*(r+ Math.sqrt(Math.pow(r,2) + Math.pow(h,2)));
        return surfaceArea;
    }
}
