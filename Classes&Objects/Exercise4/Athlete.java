package TJAVA.POO.Exercise4;

public class Athlete{
    private int numAthlete;
    private String name;
    private float timeAthlete;
    
    public Athlete(int numAthlete, String name, float timeAthlete) {
        this.numAthlete = numAthlete;
        this.name = name;
        this.timeAthlete = timeAthlete;
    }
    public float getTimeAthlete() {
        return timeAthlete;
    }
    public String showDataWinner(){
    return "Número de atleta: "+numAthlete+"\nNombre del Atleta: "+name+"\nTiempo de carrera: "+timeAthlete;

    }

}