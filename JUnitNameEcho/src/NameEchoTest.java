import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NameEchoTest {

@Test
void testProcessName() {
assertEquals("John DOE", NameEcho.processName("John Doe"));
assertEquals("John DOE", NameEcho.processName("John dOE"));
assertEquals("John SMITH", NameEcho.processName("John Smith"));
assertEquals("John", NameEcho.processName("John"));
assertEquals("", NameEcho.processName(""));
}

@Test
void testProcessSecondSurname() {
assertEquals("John Doe", NameEcho.processSecondSurname("John Doe"));
assertEquals("John dOE", NameEcho.processSecondSurname("John dOE"));
assertEquals("John Smith", NameEcho.processSecondSurname("John Smith"));
assertEquals("John", NameEcho.processSecondSurname("John"));
assertEquals("", NameEcho.processSecondSurname(""));
}

}