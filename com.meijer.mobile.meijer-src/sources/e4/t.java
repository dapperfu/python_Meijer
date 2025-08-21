package e4;

import a3.t;
import androidx.recyclerview.widget.RecyclerView;
import d3.C13599a;
import e4.L;
import x3.F;
import x3.O;

/* loaded from: classes4.dex */
public final class t implements InterfaceC13770m {

    /* renamed from: a, reason: collision with root package name */
    private final d3.D f129877a;

    /* renamed from: b, reason: collision with root package name */
    private final F.a f129878b;

    /* renamed from: c, reason: collision with root package name */
    private final String f129879c;

    /* renamed from: d, reason: collision with root package name */
    private final int f129880d;

    /* renamed from: e, reason: collision with root package name */
    private final String f129881e;

    /* renamed from: f, reason: collision with root package name */
    private O f129882f;

    /* renamed from: g, reason: collision with root package name */
    private String f129883g;

    /* renamed from: h, reason: collision with root package name */
    private int f129884h;

    /* renamed from: i, reason: collision with root package name */
    private int f129885i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f129886j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f129887k;

    /* renamed from: l, reason: collision with root package name */
    private long f129888l;

    /* renamed from: m, reason: collision with root package name */
    private int f129889m;

    /* renamed from: n, reason: collision with root package name */
    private long f129890n;

    public t(String str) {
        this(null, 0, str);
    }

    @Override // e4.InterfaceC13770m
    public void c() {
        this.f129884h = 0;
        this.f129885i = 0;
        this.f129887k = false;
        this.f129890n = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13770m
    public void d(boolean z10) {
    }

    public t(String str, int i10, String str2) {
        this.f129884h = 0;
        d3.D d10 = new d3.D(4);
        this.f129877a = d10;
        d10.e()[0] = -1;
        this.f129878b = new F.a();
        this.f129890n = -9223372036854775807L;
        this.f129879c = str;
        this.f129880d = i10;
        this.f129881e = str2;
    }

    @Override // e4.InterfaceC13770m
    public void a(d3.D d10) {
        C13599a.i(this.f129882f);
        while (d10.a() > 0) {
            int i10 = this.f129884h;
            if (i10 == 0) {
                b(d10);
            } else if (i10 == 1) {
                h(d10);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                g(d10);
            }
        }
    }

    @Override // e4.InterfaceC13770m
    public void e(long j10, int i10) {
        this.f129890n = j10;
    }

    private void b(d3.D d10) {
        boolean z10;
        boolean z11;
        byte[] bArrE = d10.e();
        int iG = d10.g();
        for (int iF = d10.f(); iF < iG; iF++) {
            byte b10 = bArrE[iF];
            if ((b10 & 255) == 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f129887k && (b10 & 224) == 224) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f129887k = z10;
            if (z11) {
                d10.W(iF + 1);
                this.f129887k = false;
                this.f129877a.e()[1] = bArrE[iF];
                this.f129885i = 2;
                this.f129884h = 1;
                return;
            }
        }
        d10.W(iG);
    }

    private void g(d3.D d10) {
        boolean z10;
        int iMin = Math.min(d10.a(), this.f129889m - this.f129885i);
        this.f129882f.d(d10, iMin);
        int i10 = this.f129885i + iMin;
        this.f129885i = i10;
        if (i10 < this.f129889m) {
            return;
        }
        if (this.f129890n != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.g(z10);
        this.f129882f.c(this.f129890n, 1, this.f129889m, 0, null);
        this.f129890n += this.f129888l;
        this.f129885i = 0;
        this.f129884h = 0;
    }

    private void h(d3.D d10) {
        int iMin = Math.min(d10.a(), 4 - this.f129885i);
        d10.l(this.f129877a.e(), this.f129885i, iMin);
        int i10 = this.f129885i + iMin;
        this.f129885i = i10;
        if (i10 < 4) {
            return;
        }
        this.f129877a.W(0);
        if (!this.f129878b.a(this.f129877a.q())) {
            this.f129885i = 0;
            this.f129884h = 1;
            return;
        }
        this.f129889m = this.f129878b.f170160c;
        if (!this.f129886j) {
            this.f129888l = (r8.f170164g * 1000000) / r8.f170161d;
            this.f129882f.b(new t.b().f0(this.f129883g).U(this.f129881e).u0(this.f129878b.f170159b).k0(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT).R(this.f129878b.f170162e).v0(this.f129878b.f170161d).j0(this.f129879c).s0(this.f129880d).N());
            this.f129886j = true;
        }
        this.f129877a.W(0);
        this.f129882f.d(this.f129877a, 4);
        this.f129884h = 2;
    }

    @Override // e4.InterfaceC13770m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f129883g = dVar.b();
        this.f129882f = rVar.t(dVar.c(), 1);
    }
}
