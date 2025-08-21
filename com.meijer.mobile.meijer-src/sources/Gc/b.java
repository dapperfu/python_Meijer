package Gc;

/* loaded from: classes4.dex */
public enum b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* renamed from: a, reason: collision with root package name */
    private final int f11317a;

    public int b() {
        return this.f11317a;
    }

    b(int i10) {
        this.f11317a = i10;
    }

    public static b a(int i10) {
        for (b bVar : values()) {
            if (bVar.b() == i10) {
                return bVar;
            }
        }
        return null;
    }
}
