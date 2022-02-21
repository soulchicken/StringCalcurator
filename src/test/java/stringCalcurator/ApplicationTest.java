package stringCalcurator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void main() {}

    @Test
    void inputNull() {
        assertFalse(Application.inputNull(""));
        assertTrue(Application.inputNull("1"));
    }

    @Test
    void findCustom() {
        assertEquals(Application.findCustom("//;\n1;2;3"),";");
        assertEquals(Application.findCustom("1;2;3"),null);
    }

}