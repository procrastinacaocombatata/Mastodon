package com.mastodon;

import com.mastodon.TestingAndDebugging.UIandUnitActivity;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class MeusTestes {
    private UIandUnitActivity tester = new UIandUnitActivity();
    @Test
    public void meuPrimeiroTeste() {
        // assert statements
        assertEquals("10 x 0 must be 0", 10, tester.multiply(10, 1));
        assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
        assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
    }
}

