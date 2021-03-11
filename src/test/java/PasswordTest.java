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
    void checkPassword_hasNoLowerCaseLetters(){
        Boolean actual = Password.checkPassword("ABCDEERAERADA");
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPassword_hasNoUpperCaseLetters(){
        Boolean actual = Password.checkPassword("a123aaaa2131");
        Assertions.assertFalse(actual);
    }
}
