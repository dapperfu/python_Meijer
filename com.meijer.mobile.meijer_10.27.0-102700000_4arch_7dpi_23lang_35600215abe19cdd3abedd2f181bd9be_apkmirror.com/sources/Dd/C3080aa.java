package Dd;

/* renamed from: Dd.aa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3080aa {

    /* renamed from: a, reason: collision with root package name */
    private static C3080aa f6003a;

    public static synchronized C3080aa a() {
        try {
            if (f6003a == null) {
                f6003a = new C3080aa();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f6003a;
    }

    private C3080aa() {
    }
}
