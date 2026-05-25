package com.codeborne.pdftest.assertj;

import com.codeborne.pdftest.PDF;
import com.codeborne.pdftest.Spaces;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Strings;
import java.util.regex.Pattern;

public class PdfAssert extends AbstractAssert<PdfAssert, PDF> {

    private final Strings strings = Strings.instance();

    public PdfAssert(PDF actual) {
        super(actual, PdfAssert.class);
    }

    public PdfAssert containsText(String text, String... texts) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PdfAssert doesNotContainText(String text, String... texts) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PdfAssert containsExactText(String substring) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PdfAssert doesNotContainExactText(String substring) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PdfAssert containsTextCaseInsensitive(String substring) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PdfAssert matchesText(String regex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PdfAssert matchesText(Pattern regex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
