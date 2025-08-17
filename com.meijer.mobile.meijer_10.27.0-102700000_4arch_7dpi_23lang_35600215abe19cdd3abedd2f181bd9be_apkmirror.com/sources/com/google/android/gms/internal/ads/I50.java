package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class I50 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9608uX f67549a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W80 f67550b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K80 f67551c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ J50 f67552d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ M50 f67553e;

    I50(M50 m50, InterfaceC9608uX interfaceC9608uX, W80 w80, K80 k80, J50 j50) {
        this.f67549a = interfaceC9608uX;
        this.f67550b = w80;
        this.f67551c = k80;
        this.f67552d = j50;
        this.f67553e = m50;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        W80 w80;
        if (((Boolean) Mc.A.c().a(C8659lf.f75976G5)).booleanValue()) {
            Pc.p0.l("Rewarded ad failed to load", th2);
        }
        DL dl2 = (DL) this.f67553e.f68522e.zzd();
        final Mc.W0 w0B = dl2 == null ? V60.b(th2, null) : dl2.zzb().a(th2);
        synchronized (this.f67553e) {
            try {
                if (dl2 != null) {
                    dl2.a().g0(w0B);
                    this.f67553e.f68519b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.G50
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f67092a.f67553e.f68521d.g0(w0B);
                        }
                    });
                } else {
                    this.f67553e.f68521d.g0(w0B);
                    this.f67553e.j(this.f67552d).zzh().zzb().c().zzh();
                }
                R60.b(w0B.f19159a, th2, "RewardedAdLoader.onFailure");
                this.f67549a.zza();
                if (!((Boolean) C8021fg.f74136c.e()).booleanValue() || (w80 = this.f67550b) == null) {
                    Z80 z80 = this.f67553e.f68524g;
                    K80 k80 = this.f67551c;
                    k80.i(w0B);
                    k80.e(th2);
                    k80.r0(false);
                    z80.b(k80.zzm());
                } else {
                    w80.c(w0B);
                    K80 k802 = this.f67551c;
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
        C10024yL c10024yL = (C10024yL) obj;
        synchronized (this.f67553e) {
            try {
                c10024yL.e().d(this.f67553e.f68521d);
                this.f67549a.zzb(c10024yL);
                M50 m50 = this.f67553e;
                Executor executor = m50.f68519b;
                final B50 b50 = m50.f68521d;
                Objects.requireNonNull(b50);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.H50
                    @Override // java.lang.Runnable
                    public final void run() {
                        b50.zzs();
                    }
                });
                this.f67553e.f68521d.q();
                if (!((Boolean) C8021fg.f74136c.e()).booleanValue() || (w80 = this.f67550b) == null) {
                    Z80 z80 = this.f67553e.f68524g;
                    K80 k80 = this.f67551c;
                    k80.d(c10024yL.g().f75749b);
                    k80.L(c10024yL.c().zzg());
                    k80.r0(true);
                    z80.b(k80.zzm());
                } else {
                    w80.g(c10024yL.g().f75749b);
                    w80.e(c10024yL.c().zzg());
                    K80 k802 = this.f67551c;
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
