package o;

/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16034e {
    public abstract void a(Runnable runnable);

    public abstract boolean c();

    public abstract void d(Runnable runnable);

    public void b(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }
}
