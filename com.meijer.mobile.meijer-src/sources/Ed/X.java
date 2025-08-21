package Ed;

/* loaded from: classes6.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private static X f7106a;

    public static synchronized X a() {
        try {
            if (f7106a == null) {
                f7106a = new X();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f7106a;
    }

    private X() {
    }

    public static void b() {
        W.a();
    }
}
