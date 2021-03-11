import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordTest {

    @BeforeAll
    static void setupAll(){
        System.out.println("Call setup before all");
    }

    @BeforeEach
    void setup(){
        System.out.println("Call setup");
    }


}
