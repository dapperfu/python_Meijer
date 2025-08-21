package H;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f13260a;

    static Executor a() {
        if (f13260a != null) {
            return f13260a;
        }
        synchronized (b.class) {
            try {
                if (f13260a == null) {
                    f13260a = new b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f13260a;
    }

    b() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
