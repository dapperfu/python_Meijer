package com.google.firebase.crashlytics.buildtools.reloc.afu.org.checkerframework.checker.formatter;

import java.util.MissingFormatArgumentException;

/* loaded from: classes8.dex */
public class FormatUtil$ExcessiveOrMissingFormatArgumentException extends MissingFormatArgumentException {

    /* renamed from: a, reason: collision with root package name */
    private final int f89527a;

    /* renamed from: b, reason: collision with root package name */
    private final int f89528b;

    @Override // java.util.MissingFormatArgumentException, java.lang.Throwable
    public String getMessage() {
        return String.format("Expected %d arguments but found %d.", Integer.valueOf(this.f89527a), Integer.valueOf(this.f89528b));
    }
}
