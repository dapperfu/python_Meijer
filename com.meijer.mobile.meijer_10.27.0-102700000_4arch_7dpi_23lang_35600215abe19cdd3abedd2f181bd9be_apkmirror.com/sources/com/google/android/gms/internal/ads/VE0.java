package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class VE0 extends C7881eG0 {

    /* renamed from: l, reason: collision with root package name */
    private final boolean f70825l;

    /* renamed from: m, reason: collision with root package name */
    private final C9954xl f70826m;

    /* renamed from: n, reason: collision with root package name */
    private final C7306Wk f70827n;

    /* renamed from: o, reason: collision with root package name */
    private SE0 f70828o;

    /* renamed from: p, reason: collision with root package name */
    private RE0 f70829p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f70830q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f70831r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f70832s;

    public final AbstractC7307Wl I() {
        return this.f70828o;
    }

    @Override // com.google.android.gms.internal.ads.C7881eG0, com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void a(YE0 ye0) {
        ((RE0) ye0).l();
        if (ye0 == this.f70829p) {
            this.f70829p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.HE0, com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.HE0, com.google.android.gms.internal.ads.AbstractC10121zE0
    public final void y() {
        this.f70831r = false;
        this.f70830q = false;
        super.y();
    }

    private final Object K(Object obj) {
        return (this.f70828o.f70062d == null || !obj.equals(SE0.f70060e)) ? obj : this.f70828o.f70062d;
    }

    private final boolean L(long j10) {
        RE0 re0 = this.f70829p;
        int iA = this.f70828o.a(re0.f69806a.f72382a);
        if (iA == -1) {
            return false;
        }
        SE0 se0 = this.f70828o;
        C7306Wk c7306Wk = this.f70827n;
        se0.d(iA, c7306Wk, false);
        long j11 = c7306Wk.f71151d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        re0.j(j10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.C7881eG0
    protected final C7453aF0 F(C7453aF0 c7453aF0) {
        Object obj = this.f70828o.f70062d;
        Object obj2 = c7453aF0.f72382a;
        if (obj != null && this.f70828o.f70062d.equals(obj2)) {
            obj2 = SE0.f70060e;
        }
        return c7453aF0.a(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.C7881eG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void G(com.google.android.gms.internal.ads.AbstractC7307Wl r15) {
        /*
            r14 = this;
            boolean r0 = r14.f70831r
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.SE0 r0 = r14.f70828o
            com.google.android.gms.internal.ads.SE0 r15 = r0.p(r15)
            r14.f70828o = r15
            com.google.android.gms.internal.ads.RE0 r15 = r14.f70829p
            if (r15 == 0) goto L9e
            long r2 = r15.e()
            r14.L(r2)
            goto L9e
        L1a:
            boolean r0 = r15.o()
            if (r0 == 0) goto L36
            boolean r0 = r14.f70832s
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.SE0 r0 = r14.f70828o
            com.google.android.gms.internal.ads.SE0 r15 = r0.p(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.C9954xl.f79844o
            java.lang.Object r2 = com.google.android.gms.internal.ads.SE0.f70060e
            com.google.android.gms.internal.ads.SE0 r15 = com.google.android.gms.internal.ads.SE0.r(r15, r0, r2)
        L33:
            r14.f70828o = r15
            goto L9e
        L36:
            com.google.android.gms.internal.ads.xl r0 = r14.f70826m
            r2 = 0
            r3 = 0
            r15.e(r2, r0, r3)
            com.google.android.gms.internal.ads.xl r0 = r14.f70826m
            java.lang.Object r0 = r0.f79846a
            com.google.android.gms.internal.ads.RE0 r5 = r14.f70829p
            if (r5 == 0) goto L62
            long r6 = r5.h()
            com.google.android.gms.internal.ads.SE0 r8 = r14.f70828o
            com.google.android.gms.internal.ads.Wk r9 = r14.f70827n
            com.google.android.gms.internal.ads.aF0 r5 = r5.f69806a
            java.lang.Object r5 = r5.f72382a
            r8.n(r5, r9)
            com.google.android.gms.internal.ads.SE0 r5 = r14.f70828o
            com.google.android.gms.internal.ads.xl r8 = r14.f70826m
            r5.e(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.xl r9 = r14.f70826m
            com.google.android.gms.internal.ads.Wk r10 = r14.f70827n
            r11 = 0
            r8 = r15
            android.util.Pair r15 = r8.l(r9, r10, r11, r12)
            java.lang.Object r2 = r15.first
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r3 = r15.longValue()
            boolean r15 = r14.f70832s
            if (r15 == 0) goto L82
            com.google.android.gms.internal.ads.SE0 r15 = r14.f70828o
            com.google.android.gms.internal.ads.SE0 r15 = r15.p(r8)
            goto L86
        L82:
            com.google.android.gms.internal.ads.SE0 r15 = com.google.android.gms.internal.ads.SE0.r(r8, r0, r2)
        L86:
            r14.f70828o = r15
            com.google.android.gms.internal.ads.RE0 r15 = r14.f70829p
            if (r15 == 0) goto L9e
            boolean r0 = r14.L(r3)
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.aF0 r15 = r15.f69806a
            java.lang.Object r0 = r15.f72382a
            java.lang.Object r0 = r14.K(r0)
            com.google.android.gms.internal.ads.aF0 r1 = r15.a(r0)
        L9e:
            r15 = 1
            r14.f70832s = r15
            r14.f70831r = r15
            com.google.android.gms.internal.ads.SE0 r15 = r14.f70828o
            r14.x(r15)
            if (r1 == 0) goto Lb2
            com.google.android.gms.internal.ads.RE0 r15 = r14.f70829p
            r15.getClass()
            r15.i(r1)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.VE0.G(com.google.android.gms.internal.ads.Wl):void");
    }

    @Override // com.google.android.gms.internal.ads.C7881eG0
    public final void H() {
        if (this.f70825l) {
            return;
        }
        this.f70830q = true;
        B(null, this.f73798k);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final RE0 h(C7453aF0 c7453aF0, C7990fH0 c7990fH0, long j10) {
        RE0 re0 = new RE0(c7453aF0, c7990fH0, j10);
        re0.m(this.f73798k);
        if (this.f70831r) {
            re0.i(c7453aF0.a(K(c7453aF0.f72382a)));
            return re0;
        }
        this.f70829p = re0;
        if (!this.f70830q) {
            this.f70830q = true;
            B(null, this.f73798k);
        }
        return re0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10121zE0, com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void b(H7 h72) {
        if (this.f70832s) {
            this.f70828o = this.f70828o.p(new C7562bG0(this.f70828o.f68846b, h72));
        } else {
            this.f70828o = SE0.q(h72);
        }
        this.f73798k.b(h72);
    }

    public VE0(InterfaceC7666cF0 interfaceC7666cF0, boolean z10) {
        boolean z11;
        super(interfaceC7666cF0);
        if (z10) {
            interfaceC7666cF0.zzv();
            z11 = true;
        } else {
            z11 = false;
        }
        this.f70825l = z11;
        this.f70826m = new C9954xl();
        this.f70827n = new C7306Wk();
        interfaceC7666cF0.m();
        this.f70828o = SE0.q(interfaceC7666cF0.k());
    }
}
