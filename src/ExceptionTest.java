class FoolException extends Exception {
}

public class ExceptionTest {
    public void sayNick(String nick) throws FoolException{
 
            if("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("Your nickname is "+nick+".");
       
    }

    public static void main(String[] args) {
        ExceptionTest ex = new ExceptionTest();
        try {
        	ex.sayNick("fool");
        	ex.sayNick("genious");
        } catch (FoolException e) {
        	System.err.println("FoolException in main !!!");
        }
    
    }
}