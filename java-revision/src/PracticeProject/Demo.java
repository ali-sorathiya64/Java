package PracticeProject;

public class Demo {
    public static void main(String[] args) throws Exception {


        int a[]={10,20,30,40};
        try {
            System.out.println(a[5]);

        } catch (Exception e) {
           throw new Exception("This is an Array error");

        }
        finally {
            System.out.println("Always execute");
        }
    }
}