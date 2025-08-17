package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9342s {

    /* renamed from: a, reason: collision with root package name */
    private final C8808n f78100a;

    /* renamed from: f, reason: collision with root package name */
    private C9113ps f78105f;

    /* renamed from: h, reason: collision with root package name */
    private long f78107h;

    /* renamed from: j, reason: collision with root package name */
    private final RH0 f78109j;

    /* renamed from: b, reason: collision with root package name */
    private final C8594l f78101b = new C8594l();

    /* renamed from: c, reason: collision with root package name */
    private final MT f78102c = new MT(10);

    /* renamed from: d, reason: collision with root package name */
    private final MT f78103d = new MT(10);

    /* renamed from: e, reason: collision with root package name */
    private final C10025yM f78104e = new C10025yM(16);

    /* renamed from: g, reason: collision with root package name */
    private C9113ps f78106g = C9113ps.f77644d;

    /* renamed from: i, reason: collision with root package name */
    private long f78108i = -9223372036854775807L;

    public final boolean d(long j10) {
        long j11 = this.f78108i;
        return j11 != -9223372036854775807L && j11 >= j10;
    }

    public final void a() {
        this.f78104e.c();
        this.f78108i = -9223372036854775807L;
        MT mt2 = this.f78103d;
        if (mt2.a() > 0) {
            Long l10 = (Long) e(mt2);
            l10.longValue();
            this.f78103d.d(0L, l10);
        }
        if (this.f78105f != null) {
            this.f78102c.e();
            return;
        }
        MT mt3 = this.f78102c;
        if (mt3.a() > 0) {
            this.f78105f = (C9113ps) e(mt3);
        }
    }

    public final void b(int i10, int i11) {
        this.f78105f = new C9113ps(i10, i11, 1.0f);
    }

    public final void c(long j10, long j11) throws zzib {
        while (true) {
            C10025yM c10025yM = this.f78104e;
            if (c10025yM.d()) {
                return;
            }
            MT mt2 = this.f78103d;
            long jA = c10025yM.a();
            Long l10 = (Long) mt2.c(jA);
            if (l10 != null && l10.longValue() != this.f78107h) {
                this.f78107h = l10.longValue();
                this.f78100a.f();
            }
            int iA = this.f78100a.a(jA, j10, j11, this.f78107h, false, this.f78101b);
            if (iA != 0 && iA != 1) {
                if (iA == 2 || iA == 3 || iA == 4) {
                    this.f78108i = jA;
                    this.f78104e.b();
                    RH0 rh0 = this.f78109j;
                    Iterator it = rh0.f69851b.f75309i.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC7847e) it.next()).a(rh0.f69851b);
                    }
                    C8086gC.b(null);
                    throw null;
                }
                return;
            }
            this.f78108i = jA;
            long jLongValue = Long.valueOf(this.f78104e.b()).longValue();
            C9113ps c9113ps = (C9113ps) this.f78102c.c(jLongValue);
            if (c9113ps != null && !c9113ps.equals(C9113ps.f77644d) && !c9113ps.equals(this.f78106g)) {
                this.f78106g = c9113ps;
                this.f78109j.a(c9113ps);
            }
            this.f78109j.b(iA == 0 ? -1L : this.f78101b.d(), jLongValue, this.f78100a.p());
        }
    }

    public C9342s(RH0 rh0, C8808n c8808n) {
        this.f78109j = rh0;
        this.f78100a = c8808n;
    }

    private static Object e(MT mt2) {
        boolean z10;
        if (mt2.a() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.d(z10);
        while (mt2.a() > 1) {
            mt2.b();
        }
        Object objB = mt2.b();
        objB.getClass();
        return objB;
    }
}
