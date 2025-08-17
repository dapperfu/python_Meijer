package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Y40 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9608uX f71471a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W80 f71472b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K80 f71473c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC8522kH f71474d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Z40 f71475e;

    Y40(Z40 z40, InterfaceC9608uX interfaceC9608uX, W80 w80, K80 k80, AbstractC8522kH abstractC8522kH) {
        this.f71471a = interfaceC9608uX;
        this.f71472b = w80;
        this.f71473c = k80;
        this.f71474d = abstractC8522kH;
        this.f71475e = z40;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        W80 w80;
        if (((Boolean) Mc.A.c().a(C8659lf.f75976G5)).booleanValue()) {
            Pc.p0.l("Interstitial ad failed to load", th2);
        }
        final Mc.W0 w0A = this.f71474d.a().a(th2);
        synchronized (this.f71475e) {
            try {
                this.f71475e.f71991i = null;
                this.f71474d.b().g0(w0A);
                if (((Boolean) Mc.A.c().a(C8659lf.f76286c8)).booleanValue()) {
                    this.f71475e.f71984b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.U40
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f70537a.f71475e.f71986d.g0(w0A);
                        }
                    });
                    this.f71475e.f71984b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.V40
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f70780a.f71475e.f71987e.g0(w0A);
                        }
                    });
                }
                R60.b(w0A.f19159a, th2, "InterstitialAdLoader.onFailure");
                this.f71471a.zza();
                if (!((Boolean) C8021fg.f74136c.e()).booleanValue() || (w80 = this.f71472b) == null) {
                    Z80 z80 = this.f71475e.f71989g;
                    K80 k80 = this.f71473c;
                    k80.i(w0A);
                    k80.e(th2);
                    k80.r0(false);
                    z80.b(k80.zzm());
                } else {
                    w80.c(w0A);
                    K80 k802 = this.f71473c;
                    k802.e(th2);
                    k802.r0(false);
                    w80.a(k802);
                    w80.h();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        W80 w80;
        FG fg2 = (FG) obj;
        synchronized (this.f71475e) {
            try {
                this.f71475e.f71991i = null;
                AbstractC7593bf abstractC7593bf = C8659lf.f76286c8;
                if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
                    C8409jE c8409jEE = fg2.e();
                    c8409jEE.a(this.f71475e.f71986d);
                    c8409jEE.d(this.f71475e.f71987e);
                }
                this.f71471a.zzb(fg2);
                if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
                    this.f71475e.f71984b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.W40
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f71004a.f71475e.f71986d.zzs();
                        }
                    });
                    this.f71475e.f71984b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.X40
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f71253a.f71475e.f71987e.zzs();
                        }
                    });
                }
                if (!((Boolean) C8021fg.f74136c.e()).booleanValue() || (w80 = this.f71472b) == null) {
                    Z80 z80 = this.f71475e.f71989g;
                    K80 k80 = this.f71473c;
                    k80.d(fg2.g().f75749b);
                    k80.L(fg2.c().zzg());
                    k80.r0(true);
                    z80.b(k80.zzm());
                } else {
                    w80.g(fg2.g().f75749b);
                    w80.e(fg2.c().zzg());
                    K80 k802 = this.f71473c;
                    k802.r0(true);
                    w80.a(k802);
                    w80.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
