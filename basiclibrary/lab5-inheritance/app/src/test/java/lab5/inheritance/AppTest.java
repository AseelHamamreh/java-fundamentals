/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab5.inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");

        Main Test1 = new Main();
        assertNotNull(Test1.toString(), "main should print something");
    }
}

