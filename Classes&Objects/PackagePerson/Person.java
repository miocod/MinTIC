package TJAVA.POO.PackagePerson;

public class Person {
    private final String name;
    private int years;
    public Person(String name, int years) {
        this.name = name;
        this.years = years;
    }
    public void showData(){
        System.out.println("El nombre es: "+name);
        System.out.println("La edad es: "+years);
    }  
    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }
    
}
