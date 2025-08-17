package e4;

import a3.t;
import androidx.recyclerview.widget.RecyclerView;
import d3.C13466a;
import e4.L;
import x3.F;
import x3.O;

/* loaded from: classes4.dex */
public final class t implements InterfaceC13621m {

    /* renamed from: a, reason: collision with root package name */
    private final d3.D f128541a;

    /* renamed from: b, reason: collision with root package name */
    private final F.a f128542b;

    /* renamed from: c, reason: collision with root package name */
    private final String f128543c;

    /* renamed from: d, reason: collision with root package name */
    private final int f128544d;

    /* renamed from: e, reason: collision with root package name */
    private final String f128545e;

    /* renamed from: f, reason: collision with root package name */
    private O f128546f;

    /* renamed from: g, reason: collision with root package name */
    private String f128547g;

    /* renamed from: h, reason: collision with root package name */
    private int f128548h;

    /* renamed from: i, reason: collision with root package name */
    private int f128549i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f128550j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f128551k;

    /* renamed from: l, reason: collision with root package name */
    private long f128552l;

    /* renamed from: m, reason: collision with root package name */
    private int f128553m;

    /* renamed from: n, reason: collision with root package name */
    private long f128554n;

    public t(String str) {
        this(null, 0, str);
    }

    @Override // e4.InterfaceC13621m
    public void c() {
        this.f128548h = 0;
        this.f128549i = 0;
        this.f128551k = false;
        this.f128554n = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
    }

    public t(String str, int i10, String str2) {
        this.f128548h = 0;
        d3.D d10 = new d3.D(4);
        this.f128541a = d10;
        d10.e()[0] = -1;
        this.f128542b = new F.a();
        this.f128554n = -9223372036854775807L;
        this.f128543c = str;
        this.f128544d = i10;
        this.f128545e = str2;
    }

    @Override // e4.InterfaceC13621m
    public void a(d3.D d10) {
        C13466a.i(this.f128546f);
        while (d10.a() > 0) {
            int i10 = this.f128548h;
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

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        this.f128554n = j10;
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
            if (this.f128551k && (b10 & 224) == 224) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f128551k = z10;
            if (z11) {
                d10.W(iF + 1);
                this.f128551k = false;
                this.f128541a.e()[1] = bArrE[iF];
                this.f128549i = 2;
                this.f128548h = 1;
                return;
            }
        }
        d10.W(iG);
    }

    private void g(d3.D d10) {
        boolean z10;
        int iMin = Math.min(d10.a(), this.f128553m - this.f128549i);
        this.f128546f.d(d10, iMin);
        int i10 = this.f128549i + iMin;
        this.f128549i = i10;
        if (i10 < this.f128553m) {
            return;
        }
        if (this.f128554n != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.g(z10);
        this.f128546f.c(this.f128554n, 1, this.f128553m, 0, null);
        this.f128554n += this.f128552l;
        this.f128549i = 0;
        this.f128548h = 0;
    }

    private void h(d3.D d10) {
        int iMin = Math.min(d10.a(), 4 - this.f128549i);
        d10.l(this.f128541a.e(), this.f128549i, iMin);
        int i10 = this.f128549i + iMin;
        this.f128549i = i10;
        if (i10 < 4) {
            return;
        }
        this.f128541a.W(0);
        if (!this.f128542b.a(this.f128541a.q())) {
            this.f128549i = 0;
            this.f128548h = 1;
            return;
        }
        this.f128553m = this.f128542b.f169072c;
        if (!this.f128550j) {
            this.f128552l = (r8.f169076g * 1000000) / r8.f169073d;
            this.f128546f.b(new t.b().f0(this.f128547g).U(this.f128545e).u0(this.f128542b.f169071b).k0(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT).R(this.f128542b.f169074e).v0(this.f128542b.f169073d).j0(this.f128543c).s0(this.f128544d).N());
            this.f128550j = true;
        }
        this.f128541a.W(0);
        this.f128546f.d(this.f128541a, 4);
        this.f128548h = 2;
    }

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f128547g = dVar.b();
        this.f128546f = rVar.t(dVar.c(), 1);
    }
}
