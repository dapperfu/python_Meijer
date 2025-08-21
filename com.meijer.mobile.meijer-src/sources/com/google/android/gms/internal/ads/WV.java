package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class WV implements KC {

    /* renamed from: a, reason: collision with root package name */
    boolean f71945a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8767lT f71946b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7270Rq f71947c;

    WV(XV xv2, C8767lT c8767lT, C7270Rq c7270Rq) {
        this.f71946b = c8767lT;
        this.f71947c = c7270Rq;
    }

    private final synchronized void b(Oc.W0 w02) {
        int i10 = 1;
        if (true == ((Boolean) Oc.A.c().a(C8784lf.f77375u5)).booleanValue()) {
            i10 = 3;
        }
        this.f71947c.c(new zzeda(i10, w02));
    }

    @Override // com.google.android.gms.internal.ads.KC
    public final synchronized void a(int i10, String str) {
        try {
            if (this.f71945a) {
                return;
            }
            this.f71945a = true;
            if (str == null) {
                str = XV.e(this.f71946b.f76665a, i10);
            }
            b(new Oc.W0(i10, str, "undefined", null, null));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.KC
    public final synchronized void k0(Oc.W0 w02) {
        if (this.f71945a) {
            return;
        }
        this.f71945a = true;
        b(w02);
    }

    @Override // com.google.android.gms.internal.ads.KC
    public final synchronized void zza(int i10) {
        if (this.f71945a) {
            return;
        }
        this.f71945a = true;
        b(new Oc.W0(i10, XV.e(this.f71946b.f76665a, i10), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.KC
    public final synchronized void zzd() {
        this.f71947c.b(null);
    }
}
