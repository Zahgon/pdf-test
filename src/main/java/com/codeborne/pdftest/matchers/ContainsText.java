package com.codeborne.pdftest.matchers;

import com.codeborne.pdftest.PDF;
import org.hamcrest.Description;
import java.util.Arrays;

public class ContainsText extends PDFMatcher {

    private final String text;

    private final String[] texts;

    public ContainsText(String text, String... texts) {
        this.text = text;
        this.texts = texts;
    }

    @Override
    protected boolean matchesSafely(PDF item) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void describeMismatchSafely(PDF item, Description mismatchDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void describeTo(Description description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
