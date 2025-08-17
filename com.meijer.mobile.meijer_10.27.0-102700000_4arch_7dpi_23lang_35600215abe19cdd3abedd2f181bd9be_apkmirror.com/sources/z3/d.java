package z3;

import d3.D;
import d3.P;
import d3.r;

/* loaded from: classes2.dex */
final class d implements InterfaceC18378a {

    /* renamed from: a, reason: collision with root package name */
    public final int f171521a;

    /* renamed from: b, reason: collision with root package name */
    public final int f171522b;

    /* renamed from: c, reason: collision with root package name */
    public final int f171523c;

    /* renamed from: d, reason: collision with root package name */
    public final int f171524d;

    /* renamed from: e, reason: collision with root package name */
    public final int f171525e;

    /* renamed from: f, reason: collision with root package name */
    public final int f171526f;

    /* renamed from: g, reason: collision with root package name */
    public final int f171527g;

    public long a() {
        return P.V0(this.f171525e, this.f171523c * 1000000, this.f171524d);
    }

    public int b() {
        int i10 = this.f171521a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        r.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f171521a));
        return -1;
    }

    private d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f171521a = i10;
        this.f171522b = i11;
        this.f171523c = i12;
        this.f171524d = i13;
        this.f171525e = i14;
        this.f171526f = i15;
        this.f171527g = i16;
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

    @Override // z3.InterfaceC18378a
    public int getType() {
        return 1752331379;
    }
}
