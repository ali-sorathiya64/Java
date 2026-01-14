package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer ,String> userName = new HashMap<>();
        userName.put(1,"Ali Sorathiya");
        userName.put(2,"Ebrahim");
        userName.put(3,"Suzan");
        System.out.println(userName.get(1));

        System.out.println("All users");
//        for(Map.Entry<Integer,String> entry : userName.entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue());

        for (Map.Entry<Integer,String> entry : userName.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());

        }



    }
}
