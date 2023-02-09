

public class Main {

    @SuppressWarnings("UnresolvedClassReferenceRepair")
    public static void main(String[] args) {
        System.out.println("Hello world!");

        goodMorning("Dragan");
        giveFoodto("Bak");

    }

    public static void goodMorning(String name){
        System.out.println("Good morning " +name);

    }

    public static void giveFoodto(String name){
        System.out.println("Give food to " +name);
    }
}