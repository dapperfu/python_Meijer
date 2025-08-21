package fsimpl;

import java.lang.Thread;

/* renamed from: fsimpl.au, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14094au implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f132966a;

    /* renamed from: b, reason: collision with root package name */
    private final R f132967b;

    C14094au(R r10) {
        this.f132967b = r10;
        a(Thread.getDefaultUncaughtExceptionHandler());
    }

    Thread.UncaughtExceptionHandler a() {
        return this.f132966a;
    }

    void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f132966a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        try {
            this.f132967b.a(thread, th2);
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f132966a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            }
        }
    }
}
