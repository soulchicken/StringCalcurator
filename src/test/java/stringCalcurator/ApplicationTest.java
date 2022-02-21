package stringCalcurator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    Application app = new Application();
    @Test
    void main() {
    }

    @Test
    void inputNull() {
        assertEquals(app.inputNull(""),false);
        assertEquals(app.inputNull("1"),true);
    }
}