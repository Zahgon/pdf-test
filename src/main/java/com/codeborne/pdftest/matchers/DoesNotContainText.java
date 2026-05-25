package com.codeborne.pdftest.matchers;

import com.codeborne.pdftest.PDF;
import org.hamcrest.Description;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoesNotContainText extends PDFMatcher {

    private final String text;

    private final String[] texts;

    public DoesNotContainText(String text, String... texts) {
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
