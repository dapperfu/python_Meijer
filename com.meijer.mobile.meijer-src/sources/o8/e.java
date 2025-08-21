package o8;

import i8.x;

/* loaded from: classes4.dex */
class e implements g {

    /* renamed from: d, reason: collision with root package name */
    private static final String f153760d = x.f137411a + "SafeXamarinCrashProcessor";

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f153761a;

    /* renamed from: b, reason: collision with root package name */
    private final String f153762b;

    /* renamed from: c, reason: collision with root package name */
    private final int f153763c;

    @Override // o8.g
    public f a() {
        try {
            return new i(this.f153762b, this.f153763c).a();
        } catch (Exception e10) {
            if (x.f137412b) {
                z8.f.v(f153760d, "invalid Xamarin crash", e10);
            }
            return new c(this.f153761a, this.f153763c).a();
        }
    }

    public e(Throwable th2, String str, int i10) {
        this.f153761a = th2;
        this.f153762b = str;
        this.f153763c = i10;
    }
}
