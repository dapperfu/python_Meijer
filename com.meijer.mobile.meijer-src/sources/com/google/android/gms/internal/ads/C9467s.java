package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9467s {

    /* renamed from: a, reason: collision with root package name */
    private final C8933n f78940a;

    /* renamed from: f, reason: collision with root package name */
    private C9238ps f78945f;

    /* renamed from: h, reason: collision with root package name */
    private long f78947h;

    /* renamed from: j, reason: collision with root package name */
    private final RH0 f78949j;

    /* renamed from: b, reason: collision with root package name */
    private final C8719l f78941b = new C8719l();

    /* renamed from: c, reason: collision with root package name */
    private final MT f78942c = new MT(10);

    /* renamed from: d, reason: collision with root package name */
    private final MT f78943d = new MT(10);

    /* renamed from: e, reason: collision with root package name */
    private final C10150yM f78944e = new C10150yM(16);

    /* renamed from: g, reason: collision with root package name */
    private C9238ps f78946g = C9238ps.f78484d;

    /* renamed from: i, reason: collision with root package name */
    private long f78948i = -9223372036854775807L;

    public final boolean d(long j10) {
        long j11 = this.f78948i;
        return j11 != -9223372036854775807L && j11 >= j10;
    }

    public final void a() {
        this.f78944e.c();
        this.f78948i = -9223372036854775807L;
        MT mt2 = this.f78943d;
        if (mt2.a() > 0) {
            Long l10 = (Long) e(mt2);
            l10.longValue();
            this.f78943d.d(0L, l10);
        }
        if (this.f78945f != null) {
            this.f78942c.e();
            return;
        }
        MT mt3 = this.f78942c;
        if (mt3.a() > 0) {
            this.f78945f = (C9238ps) e(mt3);
        }
    }

    public final void b(int i10, int i11) {
        this.f78945f = new C9238ps(i10, i11, 1.0f);
    }

    public final void c(long j10, long j11) throws zzib {
        while (true) {
            C10150yM c10150yM = this.f78944e;
            if (c10150yM.d()) {
                return;
            }
            MT mt2 = this.f78943d;
            long jA = c10150yM.a();
            Long l10 = (Long) mt2.c(jA);
            if (l10 != null && l10.longValue() != this.f78947h) {
                this.f78947h = l10.longValue();
                this.f78940a.f();
            }
            int iA = this.f78940a.a(jA, j10, j11, this.f78947h, false, this.f78941b);
            if (iA != 0 && iA != 1) {
                if (iA == 2 || iA == 3 || iA == 4) {
                    this.f78948i = jA;
                    this.f78944e.b();
                    RH0 rh0 = this.f78949j;
                    Iterator it = rh0.f70691b.f76149i.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC7972e) it.next()).a(rh0.f70691b);
                    }
                    C8211gC.b(null);
                    throw null;
                }
                return;
            }
            this.f78948i = jA;
            long jLongValue = Long.valueOf(this.f78944e.b()).longValue();
            C9238ps c9238ps = (C9238ps) this.f78942c.c(jLongValue);
            if (c9238ps != null && !c9238ps.equals(C9238ps.f78484d) && !c9238ps.equals(this.f78946g)) {
                this.f78946g = c9238ps;
                this.f78949j.a(c9238ps);
            }
            this.f78949j.b(iA == 0 ? -1L : this.f78941b.d(), jLongValue, this.f78940a.p());
        }
    }

    public C9467s(RH0 rh0, C8933n c8933n) {
        this.f78949j = rh0;
        this.f78940a = c8933n;
    }

    private static Object e(MT mt2) {
        boolean z10;
        if (mt2.a() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.d(z10);
        while (mt2.a() > 1) {
            mt2.b();
        }
        Object objB = mt2.b();
        objB.getClass();
        return objB;
    }
}
