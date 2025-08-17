package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class WV implements KC {

    /* renamed from: a, reason: collision with root package name */
    boolean f71105a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8642lT f71106b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7145Rq f71107c;

    WV(XV xv2, C8642lT c8642lT, C7145Rq c7145Rq) {
        this.f71106b = c8642lT;
        this.f71107c = c7145Rq;
    }

    private final synchronized void b(Mc.W0 w02) {
        int i10 = 1;
        if (true == ((Boolean) Mc.A.c().a(C8659lf.f76535u5)).booleanValue()) {
            i10 = 3;
        }
        this.f71107c.c(new zzeda(i10, w02));
    }

    @Override // com.google.android.gms.internal.ads.KC
    public final synchronized void M0(Mc.W0 w02) {
        if (this.f71105a) {
            return;
        }
        this.f71105a = true;
        b(w02);
    }

    @Override // com.google.android.gms.internal.ads.KC
    public final synchronized void a(int i10, String str) {
        try {
            if (this.f71105a) {
                return;
            }
            this.f71105a = true;
            if (str == null) {
                str = XV.e(this.f71106b.f75825a, i10);
            }
            b(new Mc.W0(i10, str, "undefined", null, null));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.KC
    public final synchronized void zza(int i10) {
        if (this.f71105a) {
            return;
        }
        this.f71105a = true;
        b(new Mc.W0(i10, XV.e(this.f71106b.f75825a, i10), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.KC
    public final synchronized void zzd() {
        this.f71107c.b(null);
    }
}
