package com.codeborne.pdftest.matchers;

import com.codeborne.pdftest.PDF;
import org.hamcrest.Description;
import java.util.regex.Pattern;

public class MatchesText extends PDFMatcher {

    private final Pattern expectedText;

    public MatchesText(Pattern expectedText) {
        this.expectedText = expectedText;
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
