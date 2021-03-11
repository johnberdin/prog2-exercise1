public class Password {


    public static Boolean checkPassword(String password){

        if(password.length() < 8 || password.length() > 25){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
