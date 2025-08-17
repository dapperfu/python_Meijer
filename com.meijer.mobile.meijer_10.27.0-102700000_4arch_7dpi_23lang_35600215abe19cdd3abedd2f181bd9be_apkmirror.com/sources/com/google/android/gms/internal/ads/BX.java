package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class BX implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9608uX f65547a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W80 f65548b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K80 f65549c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ GH f65550d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ CX f65551e;

    BX(CX cx, InterfaceC9608uX interfaceC9608uX, W80 w80, K80 k80, GH gh2) {
        this.f65547a = interfaceC9608uX;
        this.f65548b = w80;
        this.f65549c = k80;
        this.f65550d = gh2;
        this.f65551e = cx;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        W80 w80;
        if (((Boolean) Mc.A.c().a(C8659lf.f75976G5)).booleanValue()) {
            Pc.p0.l("Native ad failed to load", th2);
        }
        final Mc.W0 w0A = this.f65550d.a().a(th2);
        this.f65550d.b().g0(w0A);
        this.f65551e.f65802b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.AX
            @Override // java.lang.Runnable
            public final void run() {
                this.f65132a.f65551e.f65804d.a().g0(w0A);
            }
        });
        R60.b(w0A.f19159a, th2, "NativeAdLoader.onFailure");
        this.f65547a.zza();
        if (((Boolean) C8021fg.f74136c.e()).booleanValue() && (w80 = this.f65548b) != null) {
            w80.c(w0A);
            K80 k80 = this.f65549c;
            k80.e(th2);
            k80.r0(false);
            w80.a(k80);
            w80.h();
            return;
        }
        CX cx = this.f65551e;
        K80 k802 = this.f65549c;
        Z80 z80 = cx.f65805e;
        k802.i(w0A);
        k802.e(th2);
        k802.r0(false);
        z80.b(k802.zzm());
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        W80 w80;
        C6577Az c6577Az = (C6577Az) obj;
        synchronized (this.f65551e) {
            try {
                c6577Az.e().a(this.f65551e.f65804d.d());
                this.f65547a.zzb(c6577Az);
                this.f65551e.f65802b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zX
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f80443a.f65551e.f65804d.b().zzs();
                    }
                });
                if (!((Boolean) C8021fg.f74136c.e()).booleanValue() || (w80 = this.f65548b) == null) {
                    Z80 z80 = this.f65551e.f65805e;
                    K80 k80 = this.f65549c;
                    k80.d(c6577Az.g().f75749b);
                    k80.L(c6577Az.c().zzg());
                    k80.r0(true);
                    z80.b(k80.zzm());
                } else {
                    w80.g(c6577Az.g().f75749b);
                    w80.e(c6577Az.c().zzg());
                    K80 k802 = this.f65549c;
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
