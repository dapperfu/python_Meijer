package com.google.firebase.crashlytics.buildtools.reloc.afu.org.checkerframework.checker.formatter;

import com.google.firebase.crashlytics.buildtools.reloc.afu.org.checkerframework.checker.formatter.qual.ConversionCategory;
import java.util.IllegalFormatConversionException;

/* loaded from: classes8.dex */
public class FormatUtil$IllegalFormatConversionCategoryException extends IllegalFormatConversionException {

    /* renamed from: a, reason: collision with root package name */
    private final ConversionCategory f89529a;

    /* renamed from: b, reason: collision with root package name */
    private final ConversionCategory f89530b;

    @Override // java.util.IllegalFormatConversionException, java.lang.Throwable
    public String getMessage() {
        return String.format("Expected category %s but found %s.", this.f89529a, this.f89530b);
    }
}
