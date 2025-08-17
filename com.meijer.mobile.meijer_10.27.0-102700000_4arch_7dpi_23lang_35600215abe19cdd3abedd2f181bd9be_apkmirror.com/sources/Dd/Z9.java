package Dd;

/* loaded from: classes6.dex */
public final class Z9 {

    /* renamed from: a, reason: collision with root package name */
    private static X9 f5978a;

    public static synchronized N9 a(F9 f92) {
        try {
            if (f5978a == null) {
                f5978a = new X9(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (N9) f5978a.b(f92);
    }

    public static synchronized N9 b(String str) {
        return a(F9.d(str).c());
    }
}
