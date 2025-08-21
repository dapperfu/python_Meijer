package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10117y30 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9733uX f80796a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W80 f80797b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K80 f80798c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10224z30 f80799d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ B30 f80800e;

    C10117y30(B30 b30, InterfaceC9733uX interfaceC9733uX, W80 w80, K80 k80, C10224z30 c10224z30) {
        this.f80796a = interfaceC9733uX;
        this.f80797b = w80;
        this.f80798c = k80;
        this.f80799d = c10224z30;
        this.f80800e = b30;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        W80 w80;
        if (((Boolean) Oc.A.c().a(C8784lf.f76816G5)).booleanValue()) {
            Rc.p0.l("App open ad failed to load", th2);
        }
        InterfaceC7378Ux interfaceC7378Ux = (InterfaceC7378Ux) this.f80800e.f66255e.zzd();
        final Oc.W0 w0B = interfaceC7378Ux == null ? V60.b(th2, null) : interfaceC7378Ux.zzb().a(th2);
        synchronized (this.f80800e) {
            try {
                this.f80800e.f66260j = null;
                if (interfaceC7378Ux != null) {
                    interfaceC7378Ux.zzc().C(w0B);
                    if (((Boolean) Oc.A.c().a(C8784lf.f77112b8)).booleanValue()) {
                        this.f80800e.f66252b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.x30
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f80498a.f80800e.f66254d.C(w0B);
                            }
                        });
                    }
                } else {
                    this.f80800e.f66254d.C(w0B);
                    ((InterfaceC7378Ux) this.f80800e.l(this.f80799d).zzh()).zzb().c().zzh();
                }
                R60.b(w0B.f23346a, th2, "AppOpenAdLoader.onFailure");
                this.f80796a.zza();
                if (!((Boolean) C8146fg.f74976c.e()).booleanValue() || (w80 = this.f80797b) == null) {
                    Z80 z80 = this.f80800e.f66258h;
                    K80 k80 = this.f80798c;
                    k80.i(w0B);
                    k80.e(th2);
                    k80.s0(false);
                    z80.b(k80.zzm());
                } else {
                    w80.c(w0B);
                    K80 k802 = this.f80798c;
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
        C6702Az c6702Az = (C6702Az) obj;
        synchronized (this.f80800e) {
            try {
                this.f80800e.f66260j = null;
                if (((Boolean) Oc.A.c().a(C8784lf.f77112b8)).booleanValue()) {
                    c6702Az.e().b(this.f80800e.f66254d);
                }
                this.f80796a.zzb(c6702Az);
                if (!((Boolean) C8146fg.f74976c.e()).booleanValue() || (w80 = this.f80797b) == null) {
                    Z80 z80 = this.f80800e.f66258h;
                    K80 k80 = this.f80798c;
                    k80.d(c6702Az.g().f76589b);
                    k80.L(c6702Az.c().zzg());
                    k80.s0(true);
                    z80.b(k80.zzm());
                } else {
                    w80.g(c6702Az.g().f76589b);
                    w80.e(c6702Az.c().zzg());
                    K80 k802 = this.f80798c;
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
