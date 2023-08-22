/*Construir un programa que dada una serie de vehículos caracterizados por su marca, modelo y precio, imprima las propiedades
*del vehículo más barato. Para ello se deberán leer por teclado las características de cada vehículo y crear una clase que represente
a cada uno de ellos */

package TJAVA.POO.Exercise3;
public class Car {
    private String brand;
    private String model;
    private float price;

    public Car(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public float getPrice() {
        return price;
    }
    public String showData(){
        return "Marca: "+brand+"\nModelo: "+model+"\nPrecio USD: $ "+price+"\n";
    }
    
}
