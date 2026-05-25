package com.codeborne.pdftest.matchers;

import com.codeborne.pdftest.PDF;
import org.hamcrest.Description;

public class DoesNotContainExactText extends PDFMatcher {

    private final String substring;

    public DoesNotContainExactText(String substring) {
        this.substring = substring;
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
