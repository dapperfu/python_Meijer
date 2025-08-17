package zt;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Dt.g f173291a;

    /* renamed from: b, reason: collision with root package name */
    private final tt.d f173292b;

    /* renamed from: c, reason: collision with root package name */
    private final At.a f173293c;

    public final boolean a() {
        if (this.f173291a.a()) {
            return false;
        }
        return Boolean.parseBoolean(this.f173292b.f162096a.getProperty("allow.liberal.place.events.when.wifi.off", "false")) || this.f173293c.d() == Ct.a.ULTRA_LOW_BATTERY_CONSUMPTION;
    }

    public k(Dt.g gVar, tt.d dVar, At.a aVar) {
        this.f173291a = gVar;
        this.f173292b = dVar;
        this.f173293c = aVar;
    }
}
