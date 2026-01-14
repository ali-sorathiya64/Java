package exceptions_handling;



class BookUnavailableException extends Exception{
    BookUnavailableException(String message ){
        super(message);


    }
}
class InValidMemberExeption extends  Exception{
    InValidMemberExeption(String message){
        super(message);
    }
}

class lib  {
    int avbBooks =3 ;
    void issuingBooks (int borrowBooks ,String memberName) throws Exception {
        if(avbBooks < borrowBooks){
            throw  new BookUnavailableException("Not enough book available");
        }
        if ( borrowBooks<=0){
            throw  new BookUnavailableException("You have to request atleast one");
        }
        if (memberName.isEmpty() && memberName=="N"){

        }


    }
}
public class CustomExceptions {



    public static void main(String[] args) {
        lib l = new lib();
        lib l1 =new lib();
        try{
            l.issuingBooks(2 ,null);
           l1 .issuingBooks(5,"john");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }

    }
}
