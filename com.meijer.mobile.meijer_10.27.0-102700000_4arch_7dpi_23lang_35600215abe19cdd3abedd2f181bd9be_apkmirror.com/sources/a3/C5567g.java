package a3;

/* renamed from: a3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5567g {

    /* renamed from: a, reason: collision with root package name */
    public final int f43829a;

    /* renamed from: b, reason: collision with root package name */
    public final float f43830b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5567g.class == obj.getClass()) {
            C5567g c5567g = (C5567g) obj;
            if (this.f43829a == c5567g.f43829a && Float.compare(c5567g.f43830b, this.f43830b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f43829a) * 31) + Float.floatToIntBits(this.f43830b);
    }

    public C5567g(int i10, float f10) {
        this.f43829a = i10;
        this.f43830b = f10;
    }
}
