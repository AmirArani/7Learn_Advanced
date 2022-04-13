package khodro;

//Outer class
public class Ranande {

    private static final String name = "Farhad"; //compile time

    //Non-static Nested Class -> Inner class
    public static class Gavahiname {
        public void print(){
            System.out.println("Class Non Static: ");
            //runtime
            String noeGavahiname = "Paye 1";
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
