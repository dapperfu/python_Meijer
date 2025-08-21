package a3;

import d3.P;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: e, reason: collision with root package name */
    public static final N f44581e = new N(0, 0);

    /* renamed from: f, reason: collision with root package name */
    private static final String f44582f = P.y0(0);

    /* renamed from: g, reason: collision with root package name */
    private static final String f44583g = P.y0(1);

    /* renamed from: h, reason: collision with root package name */
    private static final String f44584h = P.y0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f44585a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44586b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final int f44587c;

    /* renamed from: d, reason: collision with root package name */
    public final float f44588d;

    public N(int i10, int i11) {
        this(i10, i11, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N) {
            N n10 = (N) obj;
            if (this.f44585a == n10.f44585a && this.f44586b == n10.f44586b && this.f44588d == n10.f44588d) {
                return true;
            }
        }
        return false;
    }

    public N(int i10, int i11, float f10) {
        this.f44585a = i10;
        this.f44586b = i11;
        this.f44587c = 0;
        this.f44588d = f10;
    }

    public int hashCode() {
        return ((((217 + this.f44585a) * 31) + this.f44586b) * 31) + Float.floatToRawIntBits(this.f44588d);
    }
}
