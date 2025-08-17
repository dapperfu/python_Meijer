package com.google.crypto.tink.internal;

/* loaded from: classes7.dex */
public final class TinkBugException extends RuntimeException {

    public interface a<T> {
        T get() throws Exception;
    }

    public TinkBugException(String str) {
        super(str);
    }

    public TinkBugException(String str, Throwable th2) {
        super(str, th2);
    }

    public TinkBugException(Throwable th2) {
        super(th2);
    }

    public static <T> T a(a<T> aVar) {
        try {
            return aVar.get();
        } catch (Exception e10) {
            throw new TinkBugException(e10);
        }
    }
}
