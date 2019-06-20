package com.virtualpairprogrammers.isbntools;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.fail;

public class ValidISBNTest {

    @Test
    public void checkAValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0148");
        assertTrue("first value", result);
    }

}
