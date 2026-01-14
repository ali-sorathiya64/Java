package FunctionalPrograming;

@FunctionalInterface
interface BookAction{
    void add();

}
interface  Sum {
    int add(int a , int b);
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        //Step 1
        BookAction action = new BookAction() {
            @Override
            public void add() {
                System.out.println("Action 1 performed");

            }
        };

        //step 2
        BookAction action2 =() -> {System.out.println("Action 2 performed"); };
        BookAction action3 =() -> System.out.println("Action 3 performed");
        Sum s1 = (a,b)->{

            return  a+b;

        };
   new Thread(()-> System.out.println("New Thread ")).start();

        action.add();
        action2.add();
        action3.add();
        System.out.println("sum of a two number is " + s1.add(10,20));



    }
}
