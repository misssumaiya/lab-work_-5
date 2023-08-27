package ProblemE8_8;

import java.util.Scanner;

public class ClassTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter radious :");
        double radious = sc.nextDouble();

        System.out.println("enter height :");
        double height = sc.nextDouble();

        Cone cone = new Cone(height,radious);
        Cube cube = new Cube(height);
        Sphere sphere = new Sphere(radious);
        Cylinder cylinder = new Cylinder(height,radious);

        double coneVolume = cone.getVolume();
        double coneSurface = cone.getSurfaceArea();
        double cubeVolume = cube.getVolume();
        double cubeSurface = cube.getSurfaceArea();
        double sphereVolume = sphere.getVolume();
        double sphereSurface = sphere.getSurfaceArea();
        double cylinderVolume = cylinder.getVolume();
        double cylinderSurface = cylinder.getSurfaceArea();

        System.out.printf("cone volume is : %.2f\n",coneVolume);
        System.out.printf("cone surface area is : %.2f\n",coneSurface);
        System.out.printf("cube volume is : %.2f\n",cubeVolume);
        System.out.printf("cube surface area is : %.2f\n",cubeSurface);
        System.out.printf("sphere volume is : %.2f\n",sphereVolume);
        System.out.printf("sphere surface area is : %.2f\n",sphereSurface);
        System.out.printf("cylinder volume is : %.2f\n",cylinderVolume);
        System.out.printf("cylinder surface area is : %.2f\n",cylinderSurface);



    }
}
