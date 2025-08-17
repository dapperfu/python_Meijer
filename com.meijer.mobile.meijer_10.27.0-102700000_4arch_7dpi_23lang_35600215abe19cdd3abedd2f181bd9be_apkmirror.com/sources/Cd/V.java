package Cd;

/* loaded from: classes6.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private static U f3792a;

    public static synchronized M a(I i10) {
        try {
            if (f3792a == null) {
                f3792a = new U(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (M) f3792a.b(i10);
    }

    public static synchronized M b(String str) {
        return a(I.d("common").c());
    }
}
