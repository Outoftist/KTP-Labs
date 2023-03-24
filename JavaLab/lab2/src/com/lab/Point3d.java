package com.lab;

public class Point3d extends Point2d {
    private double zCoord;

    public Point3d(double x, double y, double z) {
        super(x,y);
        zCoord = z;
    }

    public Point3d() {
        this(0,0,0);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double value) {
        zCoord = value;
    }

    public boolean compare(Point3d p1) {
        return p1.getZ() == getZ() && p1.getX() == getX() && p1.getY() == getY();
    }

    public double distanceTo(Point3d p) {
        double value = Math.sqrt(Math.pow((getZ() - p.getZ()),2) +
                Math.pow((getX() - p.getX()),2) + Math.pow((getY() - p.getY()),2));
        return (double)Math.round(value * 100d) / 100d;
    }
}
