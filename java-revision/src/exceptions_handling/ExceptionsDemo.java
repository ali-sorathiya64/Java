package exceptions_handling;



public class ExceptionsDemo {
    public static void main(String[] args) {
        int[] a ={10,20,30,40};
        try{

            System.out.println(a[5]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(" Exception caught : " +e);

        }
        finally {
            System.out.println("Always executes");
        }

    }
}
