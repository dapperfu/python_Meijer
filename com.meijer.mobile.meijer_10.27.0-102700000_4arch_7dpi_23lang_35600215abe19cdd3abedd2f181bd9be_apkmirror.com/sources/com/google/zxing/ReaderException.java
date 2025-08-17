package com.google.zxing;

/* loaded from: classes7.dex */
public abstract class ReaderException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected static boolean f90765a;

    /* renamed from: b, reason: collision with root package name */
    protected static final StackTraceElement[] f90766b;

    ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    static {
        f90765a = System.getProperty("surefire.test.class.path") != null;
        f90766b = new StackTraceElement[0];
    }

    ReaderException(Throwable th2) {
        super(th2);
    }
}
