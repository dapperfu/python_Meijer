package Cd;

/* loaded from: classes6.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private static X f3794a;

    public static synchronized X a() {
        try {
            if (f3794a == null) {
                f3794a = new X();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f3794a;
    }

    private X() {
    }

    public static void b() {
        W.a();
    }
}
