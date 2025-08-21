package Fd;

/* renamed from: Fd.aa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3302aa {

    /* renamed from: a, reason: collision with root package name */
    private static C3302aa f10036a;

    public static synchronized C3302aa a() {
        try {
            if (f10036a == null) {
                f10036a = new C3302aa();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f10036a;
    }

    private C3302aa() {
    }
}
