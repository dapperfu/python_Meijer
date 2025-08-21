package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Y40 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9733uX f72311a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W80 f72312b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K80 f72313c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC8647kH f72314d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Z40 f72315e;

    Y40(Z40 z40, InterfaceC9733uX interfaceC9733uX, W80 w80, K80 k80, AbstractC8647kH abstractC8647kH) {
        this.f72311a = interfaceC9733uX;
        this.f72312b = w80;
        this.f72313c = k80;
        this.f72314d = abstractC8647kH;
        this.f72315e = z40;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        W80 w80;
        if (((Boolean) Oc.A.c().a(C8784lf.f76816G5)).booleanValue()) {
            Rc.p0.l("Interstitial ad failed to load", th2);
        }
        final Oc.W0 w0A = this.f72314d.a().a(th2);
        synchronized (this.f72315e) {
            try {
                this.f72315e.f72831i = null;
                this.f72314d.b().C(w0A);
                if (((Boolean) Oc.A.c().a(C8784lf.f77126c8)).booleanValue()) {
                    this.f72315e.f72824b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.U40
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f71377a.f72315e.f72826d.C(w0A);
                        }
                    });
                    this.f72315e.f72824b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.V40
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f71620a.f72315e.f72827e.C(w0A);
                        }
                    });
                }
                R60.b(w0A.f23346a, th2, "InterstitialAdLoader.onFailure");
                this.f72311a.zza();
                if (!((Boolean) C8146fg.f74976c.e()).booleanValue() || (w80 = this.f72312b) == null) {
                    Z80 z80 = this.f72315e.f72829g;
                    K80 k80 = this.f72313c;
                    k80.i(w0A);
                    k80.e(th2);
                    k80.s0(false);
                    z80.b(k80.zzm());
                } else {
                    w80.c(w0A);
                    K80 k802 = this.f72313c;
                    k802.e(th2);
                    k802.s0(false);
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
        synchronized (this.f72315e) {
            try {
                this.f72315e.f72831i = null;
                AbstractC7718bf abstractC7718bf = C8784lf.f77126c8;
                if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
                    C8534jE c8534jEE = fg2.e();
                    c8534jEE.a(this.f72315e.f72826d);
                    c8534jEE.d(this.f72315e.f72827e);
                }
                this.f72311a.zzb(fg2);
                if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
                    this.f72315e.f72824b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.W40
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f71844a.f72315e.f72826d.zzs();
                        }
                    });
                    this.f72315e.f72824b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.X40
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f72093a.f72315e.f72827e.zzs();
                        }
                    });
                }
                if (!((Boolean) C8146fg.f74976c.e()).booleanValue() || (w80 = this.f72312b) == null) {
                    Z80 z80 = this.f72315e.f72829g;
                    K80 k80 = this.f72313c;
                    k80.d(fg2.g().f76589b);
                    k80.L(fg2.c().zzg());
                    k80.s0(true);
                    z80.b(k80.zzm());
                } else {
                    w80.g(fg2.g().f76589b);
                    w80.e(fg2.c().zzg());
                    K80 k802 = this.f72313c;
                    k802.s0(true);
                    w80.a(k802);
                    w80.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
