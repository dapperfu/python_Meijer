package Ed;

/* loaded from: classes6.dex */
public final class G5 {

    /* renamed from: a, reason: collision with root package name */
    private static F5 f8136a;

    public static synchronized C3590x5 a(AbstractC3555s5 abstractC3555s5) {
        try {
            if (f8136a == null) {
                f8136a = new F5(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C3590x5) f8136a.b(abstractC3555s5);
    }

    public static synchronized C3590x5 b(String str) {
        return a(AbstractC3555s5.d("vision-common").c());
    }
}
