package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class U5 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9692u5 f71379a;

    /* renamed from: b, reason: collision with root package name */
    private final C8982nU f71380b;

    /* renamed from: c, reason: collision with root package name */
    private final C8124fQ f71381c = new C8124fQ(new byte[64], 64);

    /* renamed from: d, reason: collision with root package name */
    private boolean f71382d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f71383e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f71384f;

    public U5(InterfaceC9692u5 interfaceC9692u5, C8982nU c8982nU) {
        this.f71379a = interfaceC9692u5;
        this.f71380b = c8982nU;
    }

    public final void b() {
        this.f71384f = false;
        this.f71379a.zze();
    }

    public final void a(GQ gq2) throws zzbc {
        long jB;
        char c10;
        gq2.h(this.f71381c.f74940a, 0, 3);
        this.f71381c.l(0);
        this.f71381c.n(8);
        this.f71382d = this.f71381c.p();
        this.f71383e = this.f71381c.p();
        this.f71381c.n(6);
        C8124fQ c8124fQ = this.f71381c;
        gq2.h(c8124fQ.f74940a, 0, c8124fQ.d(8));
        this.f71381c.l(0);
        if (this.f71382d) {
            this.f71381c.n(4);
            long jD = this.f71381c.d(3);
            this.f71381c.n(1);
            int iD = this.f71381c.d(15) << 15;
            this.f71381c.n(1);
            long jD2 = this.f71381c.d(15);
            this.f71381c.n(1);
            if (this.f71384f || !this.f71383e) {
                c10 = 30;
            } else {
                this.f71381c.n(4);
                this.f71381c.n(1);
                int iD2 = this.f71381c.d(15) << 15;
                this.f71381c.n(1);
                long jD3 = this.f71381c.d(15);
                this.f71381c.n(1);
                c10 = 30;
                this.f71380b.b((this.f71381c.d(3) << 30) | iD2 | jD3);
                this.f71384f = true;
            }
            jB = this.f71380b.b((jD << c10) | iD | jD2);
        } else {
            jB = 0;
        }
        this.f71379a.b(jB, 4);
        this.f71379a.a(gq2);
        this.f71379a.zzc(false);
    }
}
