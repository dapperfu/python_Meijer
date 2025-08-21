package Gd;

/* loaded from: classes6.dex */
public final class K5 {

    /* renamed from: a, reason: collision with root package name */
    private static K5 f11757a;

    public static synchronized K5 a() {
        try {
            if (f11757a == null) {
                f11757a = new K5();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11757a;
    }

    public static final boolean b() {
        return J5.a("mlkit-dev-profiling");
    }

    private K5() {
    }
}
