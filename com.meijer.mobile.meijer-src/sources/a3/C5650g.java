package a3;

/* renamed from: a3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5650g {

    /* renamed from: a, reason: collision with root package name */
    public final int f44647a;

    /* renamed from: b, reason: collision with root package name */
    public final float f44648b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5650g.class == obj.getClass()) {
            C5650g c5650g = (C5650g) obj;
            if (this.f44647a == c5650g.f44647a && Float.compare(c5650g.f44648b, this.f44648b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f44647a) * 31) + Float.floatToIntBits(this.f44648b);
    }

    public C5650g(int i10, float f10) {
        this.f44647a = i10;
        this.f44648b = f10;
    }
}
