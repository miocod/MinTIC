package TJAVA.POO.Exercise1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Quadrilateral c1;
        float side1,side2;
        side1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado 1: "));
        side2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado 2: "));

        if(side1==side2){
            c1=new Quadrilateral(side1);
        }else{
            c1=new Quadrilateral(side1,side2);
        }
        System.out.println("El perímetro es: "+c1.getPerimeter());
        System.out.println("El área es: "+c1.getArea());
    }
}
