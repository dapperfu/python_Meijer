package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7964f40 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W80 f74022a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K80 f74023b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC7153Ry f74024c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8178h40 f74025d;

    C7964f40(C8178h40 c8178h40, W80 w80, K80 k80, AbstractC7153Ry abstractC7153Ry) {
        this.f74022a = w80;
        this.f74023b = k80;
        this.f74024c = abstractC7153Ry;
        this.f74025d = c8178h40;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        W80 w80;
        if (((Boolean) Mc.A.c().a(C8659lf.f75976G5)).booleanValue()) {
            Pc.p0.l("Banner ad failed to load", th2);
        }
        synchronized (this.f74025d) {
            try {
                Mc.W0 w0A = this.f74024c.d().a(th2);
                this.f74025d.f74598n = w0A;
                this.f74024c.e().g0(w0A);
                R60.b(w0A.f19159a, th2, "BannerAdLoader.onFailure");
                C8178h40 c8178h40 = this.f74025d;
                if (c8178h40.f74597m) {
                    c8178h40.s();
                    C8178h40 c8178h402 = this.f74025d;
                    c8178h402.f74592h.R0(c8178h402.f74594j.a());
                }
                if (!((Boolean) C8021fg.f74136c.e()).booleanValue() || (w80 = this.f74022a) == null) {
                    Z80 z80 = this.f74025d.f74593i;
                    K80 k80 = this.f74023b;
                    k80.i(w0A);
                    k80.e(th2);
                    k80.r0(false);
                    z80.b(k80.zzm());
                } else {
                    w80.c(w0A);
                    K80 k802 = this.f74023b;
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
        AbstractC8804my abstractC8804my = (AbstractC8804my) obj;
        synchronized (this.f74025d) {
            try {
                C8178h40 c8178h40 = this.f74025d;
                if (c8178h40.f74597m) {
                    c8178h40.p();
                }
                if (!((Boolean) C8021fg.f74136c.e()).booleanValue() || (w80 = this.f74022a) == null) {
                    Z80 z80 = this.f74025d.f74593i;
                    K80 k80 = this.f74023b;
                    k80.d(abstractC8804my.g().f75749b);
                    k80.L(abstractC8804my.c().zzg());
                    k80.r0(true);
                    z80.b(k80.zzm());
                } else {
                    w80.g(abstractC8804my.g().f75749b);
                    w80.e(abstractC8804my.c().zzg());
                    K80 k802 = this.f74023b;
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
