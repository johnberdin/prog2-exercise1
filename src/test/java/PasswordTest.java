import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordTest {


    @BeforeEach
    void setup(){
        System.out.println("Setup started");
        System.out.println("Setup finish");
    }

    @Test
    void checkPassword_tooSmall(){
        Boolean actual = Password.checkPassword("pass");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_tooBig(){
        Boolean actual = Password.checkPassword("aaaaaaaaaaaaaaaaaaaaaaaaaa");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_LowerCaseLetters(){
        Boolean actual = Password.checkPassword("ABCDEERAE1RADA");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_UpperCaseLetters(){
        Boolean actual = Password.checkPassword("aaaaaaaaaaaaaa");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_spaces(){
        Boolean actual = Password.checkPassword("             ");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_spacesWithLettersAndNumbers(){
        Boolean actual = Password.checkPassword("    a  v 2 A    ");
        Assertions.assertFalse(actual);
    }

}
