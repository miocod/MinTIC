//static attribute-Atributo estático

package TJAVA.POO;

public class Static {
    private static String phrase= "Primera Frase";
    public static void main(String[] args) {
        Static.phrase="Segunda Frase";
        System.out.println(Static.phrase);
        System.out.println(Static.phrase);
    }
    
}
