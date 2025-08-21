package Ed;

/* loaded from: classes6.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private static U f7104a;

    public static synchronized M a(I i10) {
        try {
            if (f7104a == null) {
                f7104a = new U(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (M) f7104a.b(i10);
    }

    public static synchronized M b(String str) {
        return a(I.d("common").c());
    }
}
