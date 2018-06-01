package com.github.mattgotta.helloworld;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrinterTest extends Matchers {

    @Test
    public void testPrintlnHelloWorld() {
        assertThat(Printer.printlnHelloWorld(), is(true));
    }
}
