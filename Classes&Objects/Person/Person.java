package TJAVA.POO.Person;

public class Person {
    String name;
    int years;
/*Contruct method without this
    public Person(String _name, int _years){
        name=_name;
        years=_years;
    }*/

    //Contruct method with this
    public Person(String name, int years){
        this.name=name;
        this.years=years;
    }
    public void showData(){
        System.out.println("El nombre es: "+name);
        System.out.println("La edad es: "+years);
    }
    
}
