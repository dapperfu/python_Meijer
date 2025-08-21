package Gd;

/* loaded from: classes6.dex */
public final class G5 {

    /* renamed from: a, reason: collision with root package name */
    private static F5 f11688a;

    public static synchronized C3782x5 a(AbstractC3747s5 abstractC3747s5) {
        try {
            if (f11688a == null) {
                f11688a = new F5(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C3782x5) f11688a.b(abstractC3747s5);
    }

    public static synchronized C3782x5 b(String str) {
        return a(AbstractC3747s5.d("vision-common").c());
    }
}
