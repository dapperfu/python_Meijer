package H;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f11928a;

    static Executor a() {
        if (f11928a != null) {
            return f11928a;
        }
        synchronized (b.class) {
            try {
                if (f11928a == null) {
                    f11928a = new b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f11928a;
    }

    b() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
