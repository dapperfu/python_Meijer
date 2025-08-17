package com.google.firebase.crashlytics.buildtools.reloc.org.checkerframework.checker.formatter;

import com.google.firebase.crashlytics.buildtools.reloc.org.checkerframework.checker.formatter.qual.ConversionCategory;
import java.util.IllegalFormatConversionException;

/* loaded from: classes7.dex */
public class FormatUtil$IllegalFormatConversionCategoryException extends IllegalFormatConversionException {

    /* renamed from: a, reason: collision with root package name */
    private final ConversionCategory f88703a;

    /* renamed from: b, reason: collision with root package name */
    private final ConversionCategory f88704b;

    @Override // java.util.IllegalFormatConversionException, java.lang.Throwable
    public String getMessage() {
        return String.format("Expected category %s but found %s.", this.f88703a, this.f88704b);
    }
}
