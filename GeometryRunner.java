package ProblemE8_7;

import java.util.Scanner;

public class GeometryRunner {

    public static void main(String[] args) {

        Geometry geometry = new Geometry();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter radiou :");
        double radious = sc.nextDouble();

        System.out.println("enter height :");
        double height = sc.nextDouble();


        double cubeVolume = geometry.cubeVolume(height);
        double cubeSurface = geometry.cubeSurface(height);

        double sphereVolume = geometry.sphereVolume(radious);
        double sphereSurface = geometry.sphereSurface(radious);

        double cylinderVolume = geometry.cylinderVolume(radious,height);
        double cylinderSurface = geometry.cylinderSurface(radious,height);

        double coneVolume = geometry.coneVolume(radious,height);
        double coneSurface = geometry.coneSurface(radious,height);


        System.out.printf("cube volume is: %.2f\n" ,cubeVolume);
        System.out.printf("cube surface area is: %.2f\n" ,cubeSurface);

        System.out.printf("sphere volume is: %.2f\n" ,sphereVolume);
        System.out.printf("sphere surface area is: %.2f\n" ,sphereSurface);

        System.out.printf("cylinder volume is: %.2f\n" ,cylinderVolume);
        System.out.printf("cylinder surface area is: %.2f\n" ,cylinderSurface);

        System.out.printf("cone volume is: %.2f\n" ,coneVolume);
        System.out.printf("cone surface area is: %.2f\n" ,coneSurface);


    }
}
