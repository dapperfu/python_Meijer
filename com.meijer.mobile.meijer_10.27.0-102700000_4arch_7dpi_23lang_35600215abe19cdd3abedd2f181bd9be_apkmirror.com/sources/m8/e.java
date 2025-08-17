package m8;

import g8.x;

/* loaded from: classes4.dex */
class e implements g {

    /* renamed from: d, reason: collision with root package name */
    private static final String f149973d = x.f133195a + "SafeXamarinCrashProcessor";

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f149974a;

    /* renamed from: b, reason: collision with root package name */
    private final String f149975b;

    /* renamed from: c, reason: collision with root package name */
    private final int f149976c;

    @Override // m8.g
    public f a() {
        try {
            return new i(this.f149975b, this.f149976c).a();
        } catch (Exception e10) {
            if (x.f133196b) {
                x8.f.v(f149973d, "invalid Xamarin crash", e10);
            }
            return new c(this.f149974a, this.f149976c).a();
        }
    }

    public e(Throwable th2, String str, int i10) {
        this.f149974a = th2;
        this.f149975b = str;
        this.f149976c = i10;
    }
}
