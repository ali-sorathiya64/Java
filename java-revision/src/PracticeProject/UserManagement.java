//package PracticeProject;
//
//import java.util.*;
//
//public class UserManagement {
//
//    public static void main(String[] args) {
////        Set<String> user1Roles =
////        Users user1 = new Users("Ali",true ,user1Roles);
////        List<Users> users = new ArrayList<>();
////        users.add( new Users("Ali",true ,new HashSet<>
////                (Arrays.asList("ADMIN","DEVELOPER"))));
////
////        users.add( new Users("Suzan",false ,new HashSet<>
////                (Arrays.asList("SUB-ADMIN","ADVISOR"))));
////
////        users.add( new Users("Ebrahim",true ,new HashSet<>
////                (Arrays.asList("CMO","CTO"))));
////
////        users.add( new Users("Altamas",false ,new HashSet<>
////                (Arrays.asList("MANAGER","CR","DEVELOPER"))));
////
////
////        // check the active user
////        Iterator<Users> iterator =  users.iterator();
////        while (iterator.hasNext()){
////            if(!iterator.next().isActive()){
////                iterator.remove();
////            }
////            System.out.println("```````Active users```````");
////            for (Users user : users){
////                System.out.println(user.getUserName());
////            }
////        }
////
////
////        // Count users as per role
////        Map<String ,Integer>roleCount = new HashMap<>();
////        for (Users user : users){
////            for (String role : user.getRoles()){
////                roleCount.put(role ,roleCount.getOrDefault(role ,0)+1);
//////                System.out.println();
////
////            }
////            System.out.println("All users");
////            for (Map.Entry<String,Integer> ent : roleCount.entrySet()){
////                System.out.println(ent.getKey() + " : " + ent.getValue());
////            }
////
////        }
////
////
////    }
////}
//        List <String> users = new ArrayList<>();
//        users.add( new Users("Demo",true ,  new HashSet<>(Arrays.asList("Developer"))));
//
//    }}
