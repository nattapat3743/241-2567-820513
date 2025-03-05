package it.util.shapes;

public class RectagularPrism implements GeometricShapes{
    private double width;
    private double height;
    private double length;

    public RectagularPrism(double w, double h, double l){
        this.width = w;
        this.height = h;
        this.length = l;
    }
    @Override
    public double getVolume() {
        return length*width*height;
    }

    @Override
    public double getTotalSurfaceArea() {
        return 2*(length*width + length*height + width*height);
    }
    public double getDiagonal() {
        return Math.sqrt(length*length + width*width + height*height);
    }
    public double getHeight() {
        return height;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public static void main(String[] args){
        RectagularPrism rect = new RectagularPrism(5, 2, 4);
        System.out.println("Diagonal=" + rect.getDiagonal());
        System.out.println("Volume=" + rect.getVolume());
        System.out.println("Total SF=" + rect.getTotalSurfaceArea());
    }
}
