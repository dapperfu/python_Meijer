package a3;

import d3.P;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: e, reason: collision with root package name */
    public static final N f43763e = new N(0, 0);

    /* renamed from: f, reason: collision with root package name */
    private static final String f43764f = P.y0(0);

    /* renamed from: g, reason: collision with root package name */
    private static final String f43765g = P.y0(1);

    /* renamed from: h, reason: collision with root package name */
    private static final String f43766h = P.y0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f43767a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43768b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final int f43769c;

    /* renamed from: d, reason: collision with root package name */
    public final float f43770d;

    public N(int i10, int i11) {
        this(i10, i11, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N) {
            N n10 = (N) obj;
            if (this.f43767a == n10.f43767a && this.f43768b == n10.f43768b && this.f43770d == n10.f43770d) {
                return true;
            }
        }
        return false;
    }

    public N(int i10, int i11, float f10) {
        this.f43767a = i10;
        this.f43768b = i11;
        this.f43769c = 0;
        this.f43770d = f10;
    }

    public int hashCode() {
        return ((((217 + this.f43767a) * 31) + this.f43768b) * 31) + Float.floatToRawIntBits(this.f43770d);
    }
}
