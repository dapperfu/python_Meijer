package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8089f40 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W80 f74862a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K80 f74863b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC7278Ry f74864c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8303h40 f74865d;

    C8089f40(C8303h40 c8303h40, W80 w80, K80 k80, AbstractC7278Ry abstractC7278Ry) {
        this.f74862a = w80;
        this.f74863b = k80;
        this.f74864c = abstractC7278Ry;
        this.f74865d = c8303h40;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        W80 w80;
        if (((Boolean) Oc.A.c().a(C8784lf.f76816G5)).booleanValue()) {
            Rc.p0.l("Banner ad failed to load", th2);
        }
        synchronized (this.f74865d) {
            try {
                Oc.W0 w0A = this.f74864c.d().a(th2);
                this.f74865d.f75438n = w0A;
                this.f74864c.e().C(w0A);
                R60.b(w0A.f23346a, th2, "BannerAdLoader.onFailure");
                C8303h40 c8303h40 = this.f74865d;
                if (c8303h40.f75437m) {
                    c8303h40.s();
                    C8303h40 c8303h402 = this.f74865d;
                    c8303h402.f75432h.R0(c8303h402.f75434j.a());
                }
                if (!((Boolean) C8146fg.f74976c.e()).booleanValue() || (w80 = this.f74862a) == null) {
                    Z80 z80 = this.f74865d.f75433i;
                    K80 k80 = this.f74863b;
                    k80.i(w0A);
                    k80.e(th2);
                    k80.s0(false);
                    z80.b(k80.zzm());
                } else {
                    w80.c(w0A);
                    K80 k802 = this.f74863b;
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
        AbstractC8929my abstractC8929my = (AbstractC8929my) obj;
        synchronized (this.f74865d) {
            try {
                C8303h40 c8303h40 = this.f74865d;
                if (c8303h40.f75437m) {
                    c8303h40.p();
                }
                if (!((Boolean) C8146fg.f74976c.e()).booleanValue() || (w80 = this.f74862a) == null) {
                    Z80 z80 = this.f74865d.f75433i;
                    K80 k80 = this.f74863b;
                    k80.d(abstractC8929my.g().f76589b);
                    k80.L(abstractC8929my.c().zzg());
                    k80.s0(true);
                    z80.b(k80.zzm());
                } else {
                    w80.g(abstractC8929my.g().f76589b);
                    w80.e(abstractC8929my.c().zzg());
                    K80 k802 = this.f74863b;
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
