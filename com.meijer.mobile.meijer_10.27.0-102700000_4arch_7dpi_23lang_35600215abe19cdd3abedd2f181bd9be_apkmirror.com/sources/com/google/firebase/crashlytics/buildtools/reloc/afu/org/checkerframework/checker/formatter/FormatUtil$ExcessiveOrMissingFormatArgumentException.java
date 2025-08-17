package com.google.firebase.crashlytics.buildtools.reloc.afu.org.checkerframework.checker.formatter;

import java.util.MissingFormatArgumentException;

/* loaded from: classes7.dex */
public class FormatUtil$ExcessiveOrMissingFormatArgumentException extends MissingFormatArgumentException {

    /* renamed from: a, reason: collision with root package name */
    private final int f88687a;

    /* renamed from: b, reason: collision with root package name */
    private final int f88688b;

    @Override // java.util.MissingFormatArgumentException, java.lang.Throwable
    public String getMessage() {
        return String.format("Expected %d arguments but found %d.", Integer.valueOf(this.f88687a), Integer.valueOf(this.f88688b));
    }
}
