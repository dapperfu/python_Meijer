package Ed;

/* loaded from: classes6.dex */
public final class K5 {

    /* renamed from: a, reason: collision with root package name */
    private static K5 f8205a;

    public static synchronized K5 a() {
        try {
            if (f8205a == null) {
                f8205a = new K5();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f8205a;
    }

    public static final boolean b() {
        return J5.a("mlkit-dev-profiling");
    }

    private K5() {
    }
}
