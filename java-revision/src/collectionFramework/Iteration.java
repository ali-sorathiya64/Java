package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {

    public static void main(String[] args){
        List<String> Users= new ArrayList<>();
        Users.add("Joe root");
        Users.add("Virat kohli");
        Users.add("Steve smith");
        Users.add("Kane williamson");

        System.out.println("********Using foreach*********");

        for (String user:Users){
            System.out.println(user);

        }
        System.out.println("********Using for loop********");
        int i;
        for (i =0; i<Users.size() ;i++){
            System.out.println(Users.get(i));

        }

        //Iterator
        System.out.println("Using iterator");
        Iterator<String> it = Users.iterator();
        while (it.hasNext()){
//            System.out.println(it.next());
            if(it.next().equals("Steve smith")){
                it.remove();
            }
            for (String user:Users){
                System.out.println(user);

            }
        }
    }
}
