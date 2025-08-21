package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class BX implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9733uX f66387a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W80 f66388b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K80 f66389c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ GH f66390d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ CX f66391e;

    BX(CX cx, InterfaceC9733uX interfaceC9733uX, W80 w80, K80 k80, GH gh2) {
        this.f66387a = interfaceC9733uX;
        this.f66388b = w80;
        this.f66389c = k80;
        this.f66390d = gh2;
        this.f66391e = cx;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        W80 w80;
        if (((Boolean) Oc.A.c().a(C8784lf.f76816G5)).booleanValue()) {
            Rc.p0.l("Native ad failed to load", th2);
        }
        final Oc.W0 w0A = this.f66390d.a().a(th2);
        this.f66390d.b().C(w0A);
        this.f66391e.f66642b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.AX
            @Override // java.lang.Runnable
            public final void run() {
                this.f65972a.f66391e.f66644d.a().C(w0A);
            }
        });
        R60.b(w0A.f23346a, th2, "NativeAdLoader.onFailure");
        this.f66387a.zza();
        if (((Boolean) C8146fg.f74976c.e()).booleanValue() && (w80 = this.f66388b) != null) {
            w80.c(w0A);
            K80 k80 = this.f66389c;
            k80.e(th2);
            k80.s0(false);
            w80.a(k80);
            w80.h();
            return;
        }
        CX cx = this.f66391e;
        K80 k802 = this.f66389c;
        Z80 z80 = cx.f66645e;
        k802.i(w0A);
        k802.e(th2);
        k802.s0(false);
        z80.b(k802.zzm());
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        W80 w80;
        C6702Az c6702Az = (C6702Az) obj;
        synchronized (this.f66391e) {
            try {
                c6702Az.e().a(this.f66391e.f66644d.d());
                this.f66387a.zzb(c6702Az);
                this.f66391e.f66642b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zX
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81283a.f66391e.f66644d.b().zzs();
                    }
                });
                if (!((Boolean) C8146fg.f74976c.e()).booleanValue() || (w80 = this.f66388b) == null) {
                    Z80 z80 = this.f66391e.f66645e;
                    K80 k80 = this.f66389c;
                    k80.d(c6702Az.g().f76589b);
                    k80.L(c6702Az.c().zzg());
                    k80.s0(true);
                    z80.b(k80.zzm());
                } else {
                    w80.g(c6702Az.g().f76589b);
                    w80.e(c6702Az.c().zzg());
                    K80 k802 = this.f66389c;
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
