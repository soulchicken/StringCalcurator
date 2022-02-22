package stringCalcurator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void splitProcess() {
        assertEquals(Application.splitProcess("//;\n1;2;3"),6);
        assertEquals(Application.splitProcess("//!\n1!2,3"),6);
        assertEquals(Application.splitProcess("1,2,3"),6);
    }

    @Test
    void inputNull() {
        assertFalse(Application.inputNull(""));
        assertTrue(Application.inputNull("1"));
    }

    @Test
    void findCustom() {
        assertEquals(Application.findCustom("//;\n1;2;3"),";");
        assertNull(Application.findCustom("1;2;3"));
    }

    @Test
    void CutCustom() {
        assertEquals(Application.CutCustom("//;\n1;2;3",";"),"1;2;3");
        assertEquals(Application.CutCustom("1,2,3",null),"1,2,3");
    }

    @Test
    void splitString() {
        assertEquals(Application.printString("1;2;3",";"),"[1, 2, 3]");
        assertEquals(Application.printString("1:2,3",""),"[1, 2, 3]");
        assertEquals(Application.printString("1:2,3",null),"[1, 2, 3]");
        assertEquals(Application.printString("1,2;3",";"),"[1, 2, 3]");
    }
}