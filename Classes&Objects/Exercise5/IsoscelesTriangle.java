package TJAVA.POO.Exercise5;

public class IsoscelesTriangle {
    private double base;
    private double side;
    public IsoscelesTriangle(double base, double side) {
        this.base = base;
        this.side = side;
    }
    public double Perimeter(){
        double perimeter=2*side+base;
        return perimeter;
    }
    public double Area(){
        double area=(base*Math.sqrt((side*side)-((base*base)/4)))/2;
        return area;
    }
    
}
