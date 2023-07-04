package TJAVA.POO.Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        Board b1;
        int x,y,option,increment=0;
        System.out.print("Digite la coordenada inicial de X: ");
        x=entry.nextInt();
        System.out.print("Digite la coordenada inicial de Y: ");
        y=entry.nextInt();
        b1=new Board(x, y);
        do{
            System.out.println("\n=== MENÚ ===");            
            System.out.println("1. Mover hacia arriba.");
            System.out.println("2. Mover hacia abajo.");
            System.out.println("3. Mover a la izquierda.");
            System.out.println("4. Mover a la derecha.");
            System.out.println("5. Salir.");
            System.out.print("Indique la dirección para mover: ");
            option=entry.nextInt();
            if(option!=5){
                System.out.print("Digite los espacios a moverse: ");
                increment=entry.nextInt();
            }
            switch (option) {
                case 1: b1.moveUp(increment); break;
                case 2: b1.moveDown(increment); break;
                case 3: b1.moveLeft(increment); break;
                case 4: b1.moveRight(increment); break;
                case 5: break;            
                default: System.out.println("Opción no válida.");break;
            }
            entry.close();
            System.out.println("\nPosición actual (X,Y): "+"("+b1.getX()+","+b1.getY()+")");
        }while(option!=5);        
    } 
}
