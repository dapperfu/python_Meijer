package Od;

/* renamed from: Od.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4461i extends C4458f {

    /* renamed from: e, reason: collision with root package name */
    public final C4455c f23613e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23614f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4461i(C4455c c4455c, float f10) {
        C4455c c4455c2 = (C4455c) com.google.android.gms.common.internal.r.m(c4455c, "bitmapDescriptor must not be null");
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        super(c4455c2, f10);
        this.f23613e = c4455c;
        this.f23614f = f10;
    }

    @Override // Od.C4458f
    public String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.f23613e) + " refWidth=" + this.f23614f + "]";
    }
}
