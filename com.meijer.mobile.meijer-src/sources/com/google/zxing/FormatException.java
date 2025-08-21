package com.google.zxing;

/* loaded from: classes8.dex */
public final class FormatException extends ReaderException {

    /* renamed from: c, reason: collision with root package name */
    private static final FormatException f91602c;

    private FormatException() {
    }

    static {
        FormatException formatException = new FormatException();
        f91602c = formatException;
        formatException.setStackTrace(ReaderException.f91605b);
    }

    private FormatException(Throwable th2) {
        super(th2);
    }

    public static FormatException a() {
        return ReaderException.f91604a ? new FormatException() : f91602c;
    }

    public static FormatException b(Throwable th2) {
        return ReaderException.f91604a ? new FormatException(th2) : f91602c;
    }
}
