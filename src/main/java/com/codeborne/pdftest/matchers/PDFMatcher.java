package com.codeborne.pdftest.matchers;

import com.codeborne.pdftest.PDF;
import com.codeborne.pdftest.Spaces;
import org.hamcrest.Description;
import org.hamcrest.SelfDescribing;
import org.hamcrest.TypeSafeMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

abstract class PDFMatcher extends TypeSafeMatcher<PDF> implements SelfDescribing {

    protected String reduceSpaces(String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void buildErrorMessage(Description description, String text, String[] texts) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
