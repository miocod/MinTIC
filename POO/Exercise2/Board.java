/*Construir un programa que permita dirigir el movimiento de un objeto dentro de
 * un tablero y actualice su posición dentro del mismo. Los movimientos posibles son: Arriba,
 * abajo, izquierda y derecha. Tras cada movimiento el programa mostrará nueva dirección elegida
 * y las coordenadas de situación del onjeto del tablero.
 */
package TJAVA.POO.Exercise2;

public class Board{
    private int x, y;

    public Board(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void moveUp(int increment){
        y+=increment;
    }
    public void moveDown(int increment){
        y-= increment;
    }
    public void moveRight(int increment){
        x+=increment;
    }
    public void moveLeft(int increment){
        x-=increment;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
}