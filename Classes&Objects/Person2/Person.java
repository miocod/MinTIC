package TJAVA.POO.Person2;

public class Person {
    String name;
    int years;
    String dni;

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
    public Person(String dni){
        this.dni=dni;
    }
    public void run(){
        System.out.println("Soy "+name+", "+"tengo "+years+" años y estoy corriendo una maratón");
    }
    public void run(int km){
        System.out.println("He corrido: "+km+" kms");
    }
    
}
