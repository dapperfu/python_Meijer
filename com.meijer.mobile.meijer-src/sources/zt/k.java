package zt;

/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Dt.g f173252a;

    /* renamed from: b, reason: collision with root package name */
    private final tt.d f173253b;

    /* renamed from: c, reason: collision with root package name */
    private final At.a f173254c;

    public final boolean a() {
        if (this.f173252a.a()) {
            return false;
        }
        return Boolean.parseBoolean(this.f173253b.f163398a.getProperty("allow.liberal.place.events.when.wifi.off", "false")) || this.f173254c.d() == Ct.a.ULTRA_LOW_BATTERY_CONSUMPTION;
    }

    public k(Dt.g gVar, tt.d dVar, At.a aVar) {
        this.f173252a = gVar;
        this.f173253b = dVar;
        this.f173254c = aVar;
    }
}
