package it.util.shapes;

public class CircularCone implements GeometricShapes{
    private  double radius;
    private double height;

    public CircularCone(double r, double h) {
        this.radius = r;
        this.height = h;
    }
    @Override
    public double getVolume() {
        return (1/3.0)*Math.PI*height;
    }
    public double getSlantHeight() {
        return Math.sqrt(radius*radius + height*height);
    }

    public double getLateralSurfaceArea() {
        return Math.PI*radius*getSlantHeight();
    }
    public double getBaseSurfaceArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getTotalSurfaceArea() {
        return  getLateralSurfaceArea()+
                getBaseSurfaceArea()
                ;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }
}
