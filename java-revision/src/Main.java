import java.util.ArrayList;
import java.util.List;



class Cricketer{
    String batsman;
    Cricketer( String batsman){
        this.batsman = batsman;
    }
}

public class Main {


    public static void main(String[] args) {
//        List <String> users = new ArrayList<>();
//        users.add("ali sorathiya");
//        users.add("suzan aibani");
//        users.add("ebrahim");

//        System.out.println("All users list");
//        for (String user :users){
//            System.out.println(user);

//
//        System.out.println("Element at index : "+ users.get(0));

        Cricketer ck = new Cricketer("Virat Kohli");
        Cricketer ck1 = new Cricketer("Joe Root");


        List<Cricketer> cricketers = new ArrayList<>();

        cricketers.add(ck);
        cricketers.add(ck1);

        for (Cricketer cr : cricketers) {
            System.out.println(cr.batsman);

        }
    }

}