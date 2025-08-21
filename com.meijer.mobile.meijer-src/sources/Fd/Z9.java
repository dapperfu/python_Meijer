package Fd;

/* loaded from: classes6.dex */
public final class Z9 {

    /* renamed from: a, reason: collision with root package name */
    private static X9 f10011a;

    public static synchronized N9 a(F9 f92) {
        try {
            if (f10011a == null) {
                f10011a = new X9(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (N9) f10011a.b(f92);
    }

    public static synchronized N9 b(String str) {
        return a(F9.d(str).c());
    }
}
