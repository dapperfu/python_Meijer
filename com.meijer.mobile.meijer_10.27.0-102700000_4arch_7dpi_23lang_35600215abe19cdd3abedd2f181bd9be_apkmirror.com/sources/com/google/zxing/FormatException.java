package com.google.zxing;

/* loaded from: classes7.dex */
public final class FormatException extends ReaderException {

    /* renamed from: c, reason: collision with root package name */
    private static final FormatException f90763c;

    private FormatException() {
    }

    static {
        FormatException formatException = new FormatException();
        f90763c = formatException;
        formatException.setStackTrace(ReaderException.f90766b);
    }

    private FormatException(Throwable th2) {
        super(th2);
    }

    public static FormatException a() {
        return ReaderException.f90765a ? new FormatException() : f90763c;
    }

    public static FormatException b(Throwable th2) {
        return ReaderException.f90765a ? new FormatException(th2) : f90763c;
    }
}
