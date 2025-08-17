package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6774Gs implements InterfaceC7550bA0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7990fH0 f67291a = new C7990fH0(true, 65536);

    /* renamed from: b, reason: collision with root package name */
    private long f67292b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    private long f67293c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    private long f67294d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    private long f67295e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    private int f67296f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f67297g;

    C6774Gs() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final boolean a(C7980fC0 c7980fC0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final boolean b(C7443aA0 c7443aA0) {
        long j10 = c7443aA0.f72368b;
        boolean z10 = true;
        char c10 = j10 > this.f67293c ? (char) 0 : j10 < this.f67292b ? (char) 2 : (char) 1;
        int iA = this.f67291a.a();
        int i10 = this.f67296f;
        if (c10 != 2 && (c10 != 1 || !this.f67297g || iA >= i10)) {
            z10 = false;
        }
        this.f67297g = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final void c(C7980fC0 c7980fC0) {
        j(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final long d(C7980fC0 c7980fC0) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final void e(C7980fC0 c7980fC0) {
        j(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final boolean f(C7443aA0 c7443aA0) {
        long j10 = c7443aA0.f72370d ? this.f67295e : this.f67294d;
        return j10 <= 0 || c7443aA0.f72368b >= j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final void g(C7980fC0 c7980fC0) {
        j(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final void i(C7443aA0 c7443aA0, C7775dG0 c7775dG0, PG0[] pg0Arr) {
        int i10;
        this.f67296f = 0;
        for (PG0 pg0 : pg0Arr) {
            if (pg0 != null) {
                int i11 = this.f67296f;
                int i12 = pg0.zzg().f79123c;
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
                this.f67296f = i11 + i10;
            }
        }
        this.f67291a.f(this.f67296f);
    }

    final void j(boolean z10) {
        this.f67296f = 0;
        this.f67297g = false;
        if (z10) {
            this.f67291a.e();
        }
    }

    public final synchronized void k(int i10) {
        this.f67294d = i10 * 1000;
    }

    public final synchronized void l(int i10) {
        this.f67295e = i10 * 1000;
    }

    public final synchronized void m(int i10) {
        this.f67293c = i10 * 1000;
    }

    public final synchronized void n(int i10) {
        this.f67292b = i10 * 1000;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final C7990fH0 zzk() {
        return this.f67291a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final /* synthetic */ boolean h(AbstractC7307Wl abstractC7307Wl, C7453aF0 c7453aF0, long j10) {
        C9917xL.f("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
