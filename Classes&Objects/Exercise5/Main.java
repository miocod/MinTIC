package TJAVA.POO.Exercise5;

import java.util.Scanner;

public class Main {
    public static double maxArea(IsoscelesTriangle triangles[]){
        double area;
        area=triangles[0].Area();
        for(int i=1;i<triangles.length;i++){
            if(triangles[i].Area()>area){
                area=triangles[i].Area();
            }
        }
        return area;
    }
    public static void main(String[] args) {
    Scanner entry=new Scanner(System.in);
    int numTriangles;
    double base,side;
    System.out.print("Ingrese el número de triángulos a evaluar: ");
    numTriangles=entry.nextInt();
    IsoscelesTriangle triangles[]=new IsoscelesTriangle[numTriangles];
    for (int i=0;i<triangles.length;i++){
        System.out.println("\nIngrese los valores para el Triángulo "+(i+1)+": ");
        System.out.print("Ingrese la Base: ");
        base=entry.nextDouble();
        System.out.print("Ingrese el Lado: ");
        side=entry.nextDouble();
        triangles[i]= new IsoscelesTriangle(base, side);
        System.out.println("\nEl Perímetro del triángulo es: "+triangles[i].Perimeter());
        System.out.println("\nEl Área del Triángulo es: "+triangles[i].Area());
        
    }
    entry.close();
    System.out.println("\nEl área del triángulo de mayor superficie es: "+maxArea(triangles));
    }
}
