package org.petrovic.integration;

import org.junit.Test;
import org.petrovic.ss.App;

public class LongIntegrationTest {
    @Test
    public void longIntegrationTestMethod() {
        System.out.println("longIntegrationTestMethod()");

        // verify we can call main sourceset code
        new App().sayHello();
    }
}
