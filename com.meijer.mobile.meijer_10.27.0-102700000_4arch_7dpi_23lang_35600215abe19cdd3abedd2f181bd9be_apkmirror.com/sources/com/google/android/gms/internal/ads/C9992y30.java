package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9992y30 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9608uX f79956a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W80 f79957b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K80 f79958c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10099z30 f79959d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ B30 f79960e;

    C9992y30(B30 b30, InterfaceC9608uX interfaceC9608uX, W80 w80, K80 k80, C10099z30 c10099z30) {
        this.f79956a = interfaceC9608uX;
        this.f79957b = w80;
        this.f79958c = k80;
        this.f79959d = c10099z30;
        this.f79960e = b30;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        W80 w80;
        if (((Boolean) Mc.A.c().a(C8659lf.f75976G5)).booleanValue()) {
            Pc.p0.l("App open ad failed to load", th2);
        }
        InterfaceC7253Ux interfaceC7253Ux = (InterfaceC7253Ux) this.f79960e.f65415e.zzd();
        final Mc.W0 w0B = interfaceC7253Ux == null ? V60.b(th2, null) : interfaceC7253Ux.zzb().a(th2);
        synchronized (this.f79960e) {
            try {
                this.f79960e.f65420j = null;
                if (interfaceC7253Ux != null) {
                    interfaceC7253Ux.zzc().g0(w0B);
                    if (((Boolean) Mc.A.c().a(C8659lf.f76272b8)).booleanValue()) {
                        this.f79960e.f65412b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.x30
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f79658a.f79960e.f65414d.g0(w0B);
                            }
                        });
                    }
                } else {
                    this.f79960e.f65414d.g0(w0B);
                    ((InterfaceC7253Ux) this.f79960e.l(this.f79959d).zzh()).zzb().c().zzh();
                }
                R60.b(w0B.f19159a, th2, "AppOpenAdLoader.onFailure");
                this.f79956a.zza();
                if (!((Boolean) C8021fg.f74136c.e()).booleanValue() || (w80 = this.f79957b) == null) {
                    Z80 z80 = this.f79960e.f65418h;
                    K80 k80 = this.f79958c;
                    k80.i(w0B);
                    k80.e(th2);
                    k80.r0(false);
                    z80.b(k80.zzm());
                } else {
                    w80.c(w0B);
                    K80 k802 = this.f79958c;
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
        C6577Az c6577Az = (C6577Az) obj;
        synchronized (this.f79960e) {
            try {
                this.f79960e.f65420j = null;
                if (((Boolean) Mc.A.c().a(C8659lf.f76272b8)).booleanValue()) {
                    c6577Az.e().b(this.f79960e.f65414d);
                }
                this.f79956a.zzb(c6577Az);
                if (!((Boolean) C8021fg.f74136c.e()).booleanValue() || (w80 = this.f79957b) == null) {
                    Z80 z80 = this.f79960e.f65418h;
                    K80 k80 = this.f79958c;
                    k80.d(c6577Az.g().f75749b);
                    k80.L(c6577Az.c().zzg());
                    k80.r0(true);
                    z80.b(k80.zzm());
                } else {
                    w80.g(c6577Az.g().f75749b);
                    w80.e(c6577Az.c().zzg());
                    K80 k802 = this.f79958c;
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
