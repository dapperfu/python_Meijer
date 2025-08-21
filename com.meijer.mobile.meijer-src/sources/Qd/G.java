package Qd;

/* loaded from: classes6.dex */
public enum G {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* renamed from: a, reason: collision with root package name */
    private final int f28055a;

    public final int zza() {
        return this.f28055a;
    }

    G(int i10) {
        this.f28055a = i10;
    }

    public static G a(int i10) {
        for (G g10 : values()) {
            if (g10.f28055a == i10) {
                return g10;
            }
        }
        return UNKNOWN;
    }
}
