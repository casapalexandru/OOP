package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricBody> geometricBodies = new ArrayList <> ();
        GeometricBody sphere = new Sphere (10);
        GeometricBody cub = new Cub (23);
        GeometricBody parallelipiped = new Parallelepiped (2,6,10);
        geometricBodies.add (sphere);
        geometricBodies.add (cub);
        geometricBodies.add(parallelipiped);
        System.out.println (GeometricBodyController.getBiggestSurfacebody (geometricBodies) );
        System.out.println (GeometricBodyController.getBiggestVolumebody (geometricBodies) );

    }
}