package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class I50 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9733uX f68389a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W80 f68390b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K80 f68391c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ J50 f68392d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ M50 f68393e;

    I50(M50 m50, InterfaceC9733uX interfaceC9733uX, W80 w80, K80 k80, J50 j50) {
        this.f68389a = interfaceC9733uX;
        this.f68390b = w80;
        this.f68391c = k80;
        this.f68392d = j50;
        this.f68393e = m50;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        W80 w80;
        if (((Boolean) Oc.A.c().a(C8784lf.f76816G5)).booleanValue()) {
            Rc.p0.l("Rewarded ad failed to load", th2);
        }
        DL dl2 = (DL) this.f68393e.f69362e.zzd();
        final Oc.W0 w0B = dl2 == null ? V60.b(th2, null) : dl2.zzb().a(th2);
        synchronized (this.f68393e) {
            try {
                if (dl2 != null) {
                    dl2.a().C(w0B);
                    this.f68393e.f69359b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.G50
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f67932a.f68393e.f69361d.C(w0B);
                        }
                    });
                } else {
                    this.f68393e.f69361d.C(w0B);
                    this.f68393e.j(this.f68392d).zzh().zzb().c().zzh();
                }
                R60.b(w0B.f23346a, th2, "RewardedAdLoader.onFailure");
                this.f68389a.zza();
                if (!((Boolean) C8146fg.f74976c.e()).booleanValue() || (w80 = this.f68390b) == null) {
                    Z80 z80 = this.f68393e.f69364g;
                    K80 k80 = this.f68391c;
                    k80.i(w0B);
                    k80.e(th2);
                    k80.s0(false);
                    z80.b(k80.zzm());
                } else {
                    w80.c(w0B);
                    K80 k802 = this.f68391c;
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
        C10149yL c10149yL = (C10149yL) obj;
        synchronized (this.f68393e) {
            try {
                c10149yL.e().d(this.f68393e.f69361d);
                this.f68389a.zzb(c10149yL);
                M50 m50 = this.f68393e;
                Executor executor = m50.f69359b;
                final B50 b50 = m50.f69361d;
                Objects.requireNonNull(b50);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.H50
                    @Override // java.lang.Runnable
                    public final void run() {
                        b50.zzs();
                    }
                });
                this.f68393e.f69361d.q();
                if (!((Boolean) C8146fg.f74976c.e()).booleanValue() || (w80 = this.f68390b) == null) {
                    Z80 z80 = this.f68393e.f69364g;
                    K80 k80 = this.f68391c;
                    k80.d(c10149yL.g().f76589b);
                    k80.L(c10149yL.c().zzg());
                    k80.s0(true);
                    z80.b(k80.zzm());
                } else {
                    w80.g(c10149yL.g().f76589b);
                    w80.e(c10149yL.c().zzg());
                    K80 k802 = this.f68391c;
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
