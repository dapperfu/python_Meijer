package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class U5 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9567u5 f70539a;

    /* renamed from: b, reason: collision with root package name */
    private final C8857nU f70540b;

    /* renamed from: c, reason: collision with root package name */
    private final C7999fQ f70541c = new C7999fQ(new byte[64], 64);

    /* renamed from: d, reason: collision with root package name */
    private boolean f70542d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f70543e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f70544f;

    public U5(InterfaceC9567u5 interfaceC9567u5, C8857nU c8857nU) {
        this.f70539a = interfaceC9567u5;
        this.f70540b = c8857nU;
    }

    public final void b() {
        this.f70544f = false;
        this.f70539a.zze();
    }

    public final void a(GQ gq2) throws zzbc {
        long jB;
        char c10;
        gq2.h(this.f70541c.f74100a, 0, 3);
        this.f70541c.l(0);
        this.f70541c.n(8);
        this.f70542d = this.f70541c.p();
        this.f70543e = this.f70541c.p();
        this.f70541c.n(6);
        C7999fQ c7999fQ = this.f70541c;
        gq2.h(c7999fQ.f74100a, 0, c7999fQ.d(8));
        this.f70541c.l(0);
        if (this.f70542d) {
            this.f70541c.n(4);
            long jD = this.f70541c.d(3);
            this.f70541c.n(1);
            int iD = this.f70541c.d(15) << 15;
            this.f70541c.n(1);
            long jD2 = this.f70541c.d(15);
            this.f70541c.n(1);
            if (this.f70544f || !this.f70543e) {
                c10 = 30;
            } else {
                this.f70541c.n(4);
                this.f70541c.n(1);
                int iD2 = this.f70541c.d(15) << 15;
                this.f70541c.n(1);
                long jD3 = this.f70541c.d(15);
                this.f70541c.n(1);
                c10 = 30;
                this.f70540b.b((this.f70541c.d(3) << 30) | iD2 | jD3);
                this.f70544f = true;
            }
            jB = this.f70540b.b((jD << c10) | iD | jD2);
        } else {
            jB = 0;
        }
        this.f70539a.b(jB, 4);
        this.f70539a.a(gq2);
        this.f70539a.zzc(false);
    }
}
