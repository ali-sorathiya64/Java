package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class setsDemo {


    public static void main(String[] args){
        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("USERS");
        roles.add("HR");

        for (String role :roles){
            System.out.println(role);
        }


    }
}
