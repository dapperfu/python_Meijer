package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC6646c;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Tc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7318Tc implements AbstractC6646c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7013Kc f71259a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7270Rq f71260b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7385Vc f71261c;

    C7318Tc(C7385Vc c7385Vc, C7013Kc c7013Kc, C7270Rq c7270Rq) {
        this.f71259a = c7013Kc;
        this.f71260b = c7270Rq;
        this.f71261c = c7385Vc;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnectionSuspended(int i10) {
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f71261c.f71734d) {
            try {
                C7385Vc c7385Vc = this.f71261c;
                if (c7385Vc.f71732b) {
                    return;
                }
                c7385Vc.f71732b = true;
                final C6979Jc c6979Jc = this.f71261c.f71731a;
                if (c6979Jc == null) {
                    return;
                }
                Xj0 xj0 = C7033Kq.f69014a;
                final C7013Kc c7013Kc = this.f71259a;
                final C7270Rq c7270Rq = this.f71260b;
                final com.google.common.util.concurrent.q qVarZza = xj0.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.Qc
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        C7318Tc c7318Tc = this.f70432a;
                        C6979Jc c6979Jc2 = c6979Jc;
                        C7270Rq c7270Rq2 = c7270Rq;
                        try {
                            C7080Mc c7080McD = c6979Jc2.d();
                            boolean zC = c6979Jc2.c();
                            C7013Kc c7013Kc2 = c7013Kc;
                            C6911Hc c6911HcT6 = zC ? c7080McD.t6(c7013Kc2) : c7080McD.m6(c7013Kc2);
                            if (!c6911HcT6.I0()) {
                                c7270Rq2.c(new RuntimeException("No entry contents."));
                                C7385Vc.e(c7318Tc.f71261c);
                                return;
                            }
                            C7284Sc c7284Sc = new C7284Sc(c7318Tc, c6911HcT6.b0(), 1);
                            int i10 = c7284Sc.read();
                            if (i10 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            c7284Sc.unread(i10);
                            c7270Rq2.b(C7451Xc.b(c7284Sc, c6911HcT6.r0(), c6911HcT6.U0(), c6911HcT6.B(), c6911HcT6.zzf()));
                        } catch (RemoteException e10) {
                            e = e10;
                            Sc.p.e("Unable to obtain a cache service instance.", e);
                            c7270Rq2.c(e);
                            C7385Vc.e(c7318Tc.f71261c);
                        } catch (IOException e11) {
                            e = e11;
                            Sc.p.e("Unable to obtain a cache service instance.", e);
                            c7270Rq2.c(e);
                            C7385Vc.e(c7318Tc.f71261c);
                        }
                    }
                });
                final C7270Rq c7270Rq2 = this.f71260b;
                c7270Rq2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.Rc
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (c7270Rq2.isCancelled()) {
                            qVarZza.cancel(true);
                        }
                    }
                }, C7033Kq.f69020g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
