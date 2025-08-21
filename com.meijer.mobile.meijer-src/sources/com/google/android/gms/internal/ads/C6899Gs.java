package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6899Gs implements InterfaceC7675bA0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8115fH0 f68131a = new C8115fH0(true, 65536);

    /* renamed from: b, reason: collision with root package name */
    private long f68132b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    private long f68133c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    private long f68134d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    private long f68135e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    private int f68136f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f68137g;

    C6899Gs() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final boolean a(C8105fC0 c8105fC0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final boolean b(C7568aA0 c7568aA0) {
        long j10 = c7568aA0.f73208b;
        boolean z10 = true;
        char c10 = j10 > this.f68133c ? (char) 0 : j10 < this.f68132b ? (char) 2 : (char) 1;
        int iA = this.f68131a.a();
        int i10 = this.f68136f;
        if (c10 != 2 && (c10 != 1 || !this.f68137g || iA >= i10)) {
            z10 = false;
        }
        this.f68137g = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final void c(C8105fC0 c8105fC0) {
        j(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final long d(C8105fC0 c8105fC0) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final void e(C8105fC0 c8105fC0) {
        j(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final boolean f(C7568aA0 c7568aA0) {
        long j10 = c7568aA0.f73210d ? this.f68135e : this.f68134d;
        return j10 <= 0 || c7568aA0.f73208b >= j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final void g(C8105fC0 c8105fC0) {
        j(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final void i(C7568aA0 c7568aA0, C7900dG0 c7900dG0, PG0[] pg0Arr) {
        int i10;
        this.f68136f = 0;
        for (PG0 pg0 : pg0Arr) {
            if (pg0 != null) {
                int i11 = this.f68136f;
                int i12 = pg0.zzg().f79963c;
                if (i12 == 0) {
                    i10 = 144310272;
                } else if (i12 == 1) {
                    i10 = 13107200;
                } else if (i12 != 2) {
                    i10 = 131072;
                    if (i12 != 3 && i12 != 5 && i12 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i10 = 131072000;
                }
                this.f68136f = i11 + i10;
            }
        }
        this.f68131a.f(this.f68136f);
    }

    final void j(boolean z10) {
        this.f68136f = 0;
        this.f68137g = false;
        if (z10) {
            this.f68131a.e();
        }
    }

    public final synchronized void k(int i10) {
        this.f68134d = i10 * 1000;
    }

    public final synchronized void l(int i10) {
        this.f68135e = i10 * 1000;
    }

    public final synchronized void m(int i10) {
        this.f68133c = i10 * 1000;
    }

    public final synchronized void n(int i10) {
        this.f68132b = i10 * 1000;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final C8115fH0 zzk() {
        return this.f68131a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final /* synthetic */ boolean h(AbstractC7432Wl abstractC7432Wl, C7578aF0 c7578aF0, long j10) {
        C10042xL.f("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
