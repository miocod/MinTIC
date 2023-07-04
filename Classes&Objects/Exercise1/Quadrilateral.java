/*Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados.
Los valores de la longitud deberán introducirse por línea de órdenes. Si es un cuadrado, sólo se proporcionará la longitud de 
uno de sus lados al constructor. image.png*/
package TJAVA.POO.Exercise1;

public class Quadrilateral {
    private float side1;
    private float side2;
    public Quadrilateral(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    public Quadrilateral(float side1) {
        this.side1 = this.side2=side1;
    }
    public float getPerimeter(){
        float perimeter=2*(side1+side2);
        return perimeter;
    }
    public float getArea(){
        float area=(side1*side2);
        return area;

    }

    
}
