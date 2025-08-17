package fsimpl;

import java.lang.Thread;

/* renamed from: fsimpl.au, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13969au implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f131716a;

    /* renamed from: b, reason: collision with root package name */
    private final R f131717b;

    C13969au(R r10) {
        this.f131717b = r10;
        a(Thread.getDefaultUncaughtExceptionHandler());
    }

    Thread.UncaughtExceptionHandler a() {
        return this.f131716a;
    }

    void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f131716a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        try {
            this.f131717b.a(thread, th2);
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f131716a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            }
        }
    }
}
