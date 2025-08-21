package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class VE0 extends C8006eG0 {

    /* renamed from: l, reason: collision with root package name */
    private final boolean f71665l;

    /* renamed from: m, reason: collision with root package name */
    private final C10079xl f71666m;

    /* renamed from: n, reason: collision with root package name */
    private final C7431Wk f71667n;

    /* renamed from: o, reason: collision with root package name */
    private SE0 f71668o;

    /* renamed from: p, reason: collision with root package name */
    private RE0 f71669p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f71670q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f71671r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f71672s;

    public final AbstractC7432Wl I() {
        return this.f71668o;
    }

    @Override // com.google.android.gms.internal.ads.C8006eG0, com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void a(YE0 ye0) {
        ((RE0) ye0).l();
        if (ye0 == this.f71669p) {
            this.f71669p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.HE0, com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.HE0, com.google.android.gms.internal.ads.AbstractC10246zE0
    public final void y() {
        this.f71671r = false;
        this.f71670q = false;
        super.y();
    }

    private final Object K(Object obj) {
        return (this.f71668o.f70902d == null || !obj.equals(SE0.f70900e)) ? obj : this.f71668o.f70902d;
    }

    private final boolean L(long j10) {
        RE0 re0 = this.f71669p;
        int iA = this.f71668o.a(re0.f70646a.f73222a);
        if (iA == -1) {
            return false;
        }
        SE0 se0 = this.f71668o;
        C7431Wk c7431Wk = this.f71667n;
        se0.d(iA, c7431Wk, false);
        long j11 = c7431Wk.f71991d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        re0.j(j10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.C8006eG0
    protected final C7578aF0 F(C7578aF0 c7578aF0) {
        Object obj = this.f71668o.f70902d;
        Object obj2 = c7578aF0.f73222a;
        if (obj != null && this.f71668o.f70902d.equals(obj2)) {
            obj2 = SE0.f70900e;
        }
        return c7578aF0.a(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.C8006eG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void G(com.google.android.gms.internal.ads.AbstractC7432Wl r15) {
        /*
            r14 = this;
            boolean r0 = r14.f71671r
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.SE0 r0 = r14.f71668o
            com.google.android.gms.internal.ads.SE0 r15 = r0.p(r15)
            r14.f71668o = r15
            com.google.android.gms.internal.ads.RE0 r15 = r14.f71669p
            if (r15 == 0) goto L9e
            long r2 = r15.e()
            r14.L(r2)
            goto L9e
        L1a:
            boolean r0 = r15.o()
            if (r0 == 0) goto L36
            boolean r0 = r14.f71672s
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.SE0 r0 = r14.f71668o
            com.google.android.gms.internal.ads.SE0 r15 = r0.p(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.C10079xl.f80684o
            java.lang.Object r2 = com.google.android.gms.internal.ads.SE0.f70900e
            com.google.android.gms.internal.ads.SE0 r15 = com.google.android.gms.internal.ads.SE0.r(r15, r0, r2)
        L33:
            r14.f71668o = r15
            goto L9e
        L36:
            com.google.android.gms.internal.ads.xl r0 = r14.f71666m
            r2 = 0
            r3 = 0
            r15.e(r2, r0, r3)
            com.google.android.gms.internal.ads.xl r0 = r14.f71666m
            java.lang.Object r0 = r0.f80686a
            com.google.android.gms.internal.ads.RE0 r5 = r14.f71669p
            if (r5 == 0) goto L62
            long r6 = r5.h()
            com.google.android.gms.internal.ads.SE0 r8 = r14.f71668o
            com.google.android.gms.internal.ads.Wk r9 = r14.f71667n
            com.google.android.gms.internal.ads.aF0 r5 = r5.f70646a
            java.lang.Object r5 = r5.f73222a
            r8.n(r5, r9)
            com.google.android.gms.internal.ads.SE0 r5 = r14.f71668o
            com.google.android.gms.internal.ads.xl r8 = r14.f71666m
            r5.e(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.xl r9 = r14.f71666m
            com.google.android.gms.internal.ads.Wk r10 = r14.f71667n
            r11 = 0
            r8 = r15
            android.util.Pair r15 = r8.l(r9, r10, r11, r12)
            java.lang.Object r2 = r15.first
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r3 = r15.longValue()
            boolean r15 = r14.f71672s
            if (r15 == 0) goto L82
            com.google.android.gms.internal.ads.SE0 r15 = r14.f71668o
            com.google.android.gms.internal.ads.SE0 r15 = r15.p(r8)
            goto L86
        L82:
            com.google.android.gms.internal.ads.SE0 r15 = com.google.android.gms.internal.ads.SE0.r(r8, r0, r2)
        L86:
            r14.f71668o = r15
            com.google.android.gms.internal.ads.RE0 r15 = r14.f71669p
            if (r15 == 0) goto L9e
            boolean r0 = r14.L(r3)
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.aF0 r15 = r15.f70646a
            java.lang.Object r0 = r15.f73222a
            java.lang.Object r0 = r14.K(r0)
            com.google.android.gms.internal.ads.aF0 r1 = r15.a(r0)
        L9e:
            r15 = 1
            r14.f71672s = r15
            r14.f71671r = r15
            com.google.android.gms.internal.ads.SE0 r15 = r14.f71668o
            r14.x(r15)
            if (r1 == 0) goto Lb2
            com.google.android.gms.internal.ads.RE0 r15 = r14.f71669p
            r15.getClass()
            r15.i(r1)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.VE0.G(com.google.android.gms.internal.ads.Wl):void");
    }

    @Override // com.google.android.gms.internal.ads.C8006eG0
    public final void H() {
        if (this.f71665l) {
            return;
        }
        this.f71670q = true;
        B(null, this.f74638k);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final RE0 h(C7578aF0 c7578aF0, C8115fH0 c8115fH0, long j10) {
        RE0 re0 = new RE0(c7578aF0, c8115fH0, j10);
        re0.m(this.f74638k);
        if (this.f71671r) {
            re0.i(c7578aF0.a(K(c7578aF0.f73222a)));
            return re0;
        }
        this.f71669p = re0;
        if (!this.f71670q) {
            this.f71670q = true;
            B(null, this.f74638k);
        }
        return re0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10246zE0, com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void b(H7 h72) {
        if (this.f71672s) {
            this.f71668o = this.f71668o.p(new C7687bG0(this.f71668o.f69686b, h72));
        } else {
            this.f71668o = SE0.q(h72);
        }
        this.f74638k.b(h72);
    }

    public VE0(InterfaceC7791cF0 interfaceC7791cF0, boolean z10) {
        boolean z11;
        super(interfaceC7791cF0);
        if (z10) {
            interfaceC7791cF0.zzv();
            z11 = true;
        } else {
            z11 = false;
        }
        this.f71665l = z11;
        this.f71666m = new C10079xl();
        this.f71667n = new C7431Wk();
        interfaceC7791cF0.m();
        this.f71668o = SE0.q(interfaceC7791cF0.k());
    }
}
