package contornos.ud3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void isNotValidLongitud() {
        assertEquals(false, PasswordValidator.isValid("hola"));
    }

    @Test
    void isValid() {
        assertEquals(true, PasswordValidator.isValid("Ho1xxxxxx"));
    }
}