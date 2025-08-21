package z3;

import d3.D;
import d3.P;
import d3.r;

/* loaded from: classes2.dex */
final class d implements InterfaceC18441a {

    /* renamed from: a, reason: collision with root package name */
    public final int f172317a;

    /* renamed from: b, reason: collision with root package name */
    public final int f172318b;

    /* renamed from: c, reason: collision with root package name */
    public final int f172319c;

    /* renamed from: d, reason: collision with root package name */
    public final int f172320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f172321e;

    /* renamed from: f, reason: collision with root package name */
    public final int f172322f;

    /* renamed from: g, reason: collision with root package name */
    public final int f172323g;

    public long a() {
        return P.V0(this.f172321e, this.f172319c * 1000000, this.f172320d);
    }

    public int b() {
        int i10 = this.f172317a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        r.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f172317a));
        return -1;
    }

    private d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f172317a = i10;
        this.f172318b = i11;
        this.f172319c = i12;
        this.f172320d = i13;
        this.f172321e = i14;
        this.f172322f = i15;
        this.f172323g = i16;
    }

    public static d c(D d10) {
        int iU = d10.u();
        d10.X(12);
        int iU2 = d10.u();
        int iU3 = d10.u();
        int iU4 = d10.u();
        d10.X(4);
        int iU5 = d10.u();
        int iU6 = d10.u();
        d10.X(4);
        return new d(iU, iU2, iU3, iU4, iU5, iU6, d10.u());
    }

    @Override // z3.InterfaceC18441a
    public int getType() {
        return 1752331379;
    }
}
