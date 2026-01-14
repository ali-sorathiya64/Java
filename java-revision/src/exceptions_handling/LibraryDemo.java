package exceptions_handling;

 class  Library {
          int availableBooks =3;

     void borrowBook (int bookRequested) throws Exception {



           if (bookRequested>=availableBooks) {
               throw new Exception("Not enough books available");
           }

               if (bookRequested <=0){
                   throw new Exception("Atleast one book is mandatory for request");


           }}





 }



public class LibraryDemo {


    public static void main(String[] args)  {
        Library library = new Library();
        try {
            library.borrowBook(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Book issued successfully");
        }

    }

}


//     int availableBooks =3;
//
//     void borrowBook (int bookRequested){
//
//         int[] books={101,103,104};
//         try {
//             System.out.println("Books Requested : " + books[bookRequested]);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Exception occurred");
//
//         }
//         finally {
//             System.out.println("Always Executed");
//         }
//     }
// }
