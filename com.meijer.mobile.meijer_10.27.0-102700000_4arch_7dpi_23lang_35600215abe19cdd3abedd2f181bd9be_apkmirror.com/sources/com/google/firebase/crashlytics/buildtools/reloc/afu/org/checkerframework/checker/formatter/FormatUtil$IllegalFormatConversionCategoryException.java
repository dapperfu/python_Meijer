package com.google.firebase.crashlytics.buildtools.reloc.afu.org.checkerframework.checker.formatter;

import com.google.firebase.crashlytics.buildtools.reloc.afu.org.checkerframework.checker.formatter.qual.ConversionCategory;
import java.util.IllegalFormatConversionException;

/* loaded from: classes7.dex */
public class FormatUtil$IllegalFormatConversionCategoryException extends IllegalFormatConversionException {

    /* renamed from: a, reason: collision with root package name */
    private final ConversionCategory f88689a;

    /* renamed from: b, reason: collision with root package name */
    private final ConversionCategory f88690b;

    @Override // java.util.IllegalFormatConversionException, java.lang.Throwable
    public String getMessage() {
        return String.format("Expected category %s but found %s.", this.f88689a, this.f88690b);
    }
}
