package com.google.zxing;

/* loaded from: classes8.dex */
public abstract class ReaderException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected static boolean f91604a;

    /* renamed from: b, reason: collision with root package name */
    protected static final StackTraceElement[] f91605b;

    ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    static {
        f91604a = System.getProperty("surefire.test.class.path") != null;
        f91605b = new StackTraceElement[0];
    }

    ReaderException(Throwable th2) {
        super(th2);
    }
}
