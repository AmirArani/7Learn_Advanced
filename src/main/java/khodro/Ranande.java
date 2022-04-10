package khodro;

//Outer class
public class Ranande {

    private String noeGavahiname = "Paye 1"; //runtime
    private static String name = "Farhad"; //compile time

    //Non-static Nested Class -> Inner class
    public class Gavahiname {
        public void print(){
            System.out.println("Class Non Static: ");
            System.out.println(noeGavahiname);
            System.out.println(name);
        }
    }

    //Only nested classes could be static.
    public static class StaticGavahiname{
        public void print(){
            System.out.println("Class Static: ");
//            System.out.println(noeGavahiname);  //doesnt work
            System.out.println(name);
        }
    }
}
