/*Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas caracterizados 
por su número de atleta, nombre y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera*/
package TJAVA.POO.Exercise4;

import java.util.Scanner;

public class Main{
    public static int winnerIndex(Athlete runners[]){
        float timeAthlete;
        int index=0;
        timeAthlete=runners[index].getTimeAthlete();
        for(int i=1;i<runners.length;i++){
            if(runners[i].getTimeAthlete()<timeAthlete){
                timeAthlete=runners[i].getTimeAthlete();
                index=i;
            }            
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in); 
        String name;       
        int numAthlete,numRunners,winRunnerIndex;
        float timeAthlete;        
        System.out.print("Ingrese el número de corredores: ");
        numRunners=entry.nextInt();
        Athlete runners[] = new Athlete[numRunners];
        for (int i=0;i<runners.length;i++){
            System.out.println("\nIngrese los datos del Atleta "+(i+1)+": ");
            System.out.print("Ingrese el Número de Atleta: ");
            numAthlete=entry.nextInt();
            entry.nextLine();
            System.out.print("Ingrese el Nombre del Atleta: ");
            name=entry.nextLine();
            System.out.print("Ingrese el Tiempo de Carrera: ");
            timeAthlete=entry.nextFloat();
            runners[i] = new Athlete(numAthlete,name,timeAthlete);
        }
        entry.close();
        winRunnerIndex=winnerIndex(runners);
        System.out.println("\nEl Atleta Ganador es: ");
        System.out.println(runners[winRunnerIndex].showDataWinner());        
    }    
}

