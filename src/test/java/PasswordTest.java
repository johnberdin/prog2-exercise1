import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordTest {


    @BeforeEach
    void setup(){
        System.out.println("Setup started");
        System.out.println("Setup finish");
    }

    @DisplayName("Testing password for the minimum length")
    @Test
    void checkPassword_tooSmall(){
        Boolean actual = Password.checkPassword("FH");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for the maximum length")
    @Test
    void checkPassword_tooBig(){
        Boolean actual = Password.checkPassword("FhCampusWienComputerScience");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for lowercase letters")
    @Test
    void checkPassword_LowerCaseLetters(){
        Boolean actual = Password.checkPassword("FHCAMPUSWIEN");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for uppercase letters")
    @Test
    void checkPassword_UpperCaseLetters(){
        Boolean actual = Password.checkPassword("fhcampuswien");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for invalid whitespaces")
    @Test
    void checkPassword_spaces(){
        Boolean actual = Password.checkPassword("fhcampusWien   ");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for invalid whitespaces with letters and numbers")
    @Test
    void checkPassword_spacesWithLettersAndNumbers(){
        Boolean actual = Password.checkPassword("FhCampusWien 00");
        Assertions.assertFalse(actual);
    }

    @DisplayName("Testing password for special characters")
    @Test
    void checkPassword_specialChars(){
        Boolean actual = Password.checkPassword("FhCampus0Wien!");
        Assertions.assertTrue(actual);
    }
}
