package TJAVA.POO.Exercise3;

import java.util.Scanner;

public class Main {
    public static int indexCarLowPrice(Car autom[]){
        float price;
        int index=0;
        price=autom[0].getPrice();
        for(int i=1;i<autom.length;i++){
            if(autom[i].getPrice()<price){
                price=autom[i].getPrice();
                index=i;                
            }
        }
        return index;

    }
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        String brand, model;
        float price;
        int numCar,indexLow;
        System.out.print("Ingrese la cantidad de vehículos: ");
        numCar=entry.nextInt();

        Car[] autom= new Car[numCar];

        for(int i=0;i<autom.length;i++){
            entry.nextLine();
            System.out.println("\nIngrese las características del auto "+(i+1)+":");
            System.out.print("Ingrese la Marca: ");
            brand=entry.nextLine();
            System.out.print("Ingrese el modelo: ");
            model=entry.nextLine();
            System.out.print("Ingrese el precio USD$: ");
            price=entry.nextFloat();
            autom[i]=new Car(brand, model, price);
        }
        entry.close();
        indexLow=indexCarLowPrice(autom);
        System.out.println("\nEl auto más barato es: ");
        System.out.println(autom[indexLow].showData());
        
    }
}
