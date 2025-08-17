package Md;

/* renamed from: Md.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4183i extends C4180f {

    /* renamed from: e, reason: collision with root package name */
    public final C4177c f19426e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19427f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4183i(C4177c c4177c, float f10) {
        C4177c c4177c2 = (C4177c) com.google.android.gms.common.internal.r.m(c4177c, "bitmapDescriptor must not be null");
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        super(c4177c2, f10);
        this.f19426e = c4177c;
        this.f19427f = f10;
    }

    @Override // Md.C4180f
    public String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.f19426e) + " refWidth=" + this.f19427f + "]";
    }
}
