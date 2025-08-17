package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC6521c;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Tc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7193Tc implements AbstractC6521c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6888Kc f70419a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7145Rq f70420b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7260Vc f70421c;

    C7193Tc(C7260Vc c7260Vc, C6888Kc c6888Kc, C7145Rq c7145Rq) {
        this.f70419a = c6888Kc;
        this.f70420b = c7145Rq;
        this.f70421c = c7260Vc;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnectionSuspended(int i10) {
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f70421c.f70894d) {
            try {
                C7260Vc c7260Vc = this.f70421c;
                if (c7260Vc.f70892b) {
                    return;
                }
                c7260Vc.f70892b = true;
                final C6854Jc c6854Jc = this.f70421c.f70891a;
                if (c6854Jc == null) {
                    return;
                }
                Xj0 xj0 = C6908Kq.f68174a;
                final C6888Kc c6888Kc = this.f70419a;
                final C7145Rq c7145Rq = this.f70420b;
                final com.google.common.util.concurrent.q qVarZza = xj0.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.Qc
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        C7193Tc c7193Tc = this.f69592a;
                        C6854Jc c6854Jc2 = c6854Jc;
                        C7145Rq c7145Rq2 = c7145Rq;
                        try {
                            C6955Mc c6955McD = c6854Jc2.d();
                            boolean zC = c6854Jc2.c();
                            C6888Kc c6888Kc2 = c6888Kc;
                            C6786Hc c6786HcF6 = zC ? c6955McD.f6(c6888Kc2) : c6955McD.W5(c6888Kc2);
                            if (!c6786HcF6.K0()) {
                                c7145Rq2.c(new RuntimeException("No entry contents."));
                                C7260Vc.e(c7193Tc.f70421c);
                                return;
                            }
                            C7159Sc c7159Sc = new C7159Sc(c7193Tc, c6786HcF6.c0(), 1);
                            int i10 = c7159Sc.read();
                            if (i10 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            c7159Sc.unread(i10);
                            c7145Rq2.b(C7326Xc.b(c7159Sc, c6786HcF6.q0(), c6786HcF6.W0(), c6786HcF6.B(), c6786HcF6.zzf()));
                        } catch (RemoteException e10) {
                            e = e10;
                            Qc.p.e("Unable to obtain a cache service instance.", e);
                            c7145Rq2.c(e);
                            C7260Vc.e(c7193Tc.f70421c);
                        } catch (IOException e11) {
                            e = e11;
                            Qc.p.e("Unable to obtain a cache service instance.", e);
                            c7145Rq2.c(e);
                            C7260Vc.e(c7193Tc.f70421c);
                        }
                    }
                });
                final C7145Rq c7145Rq2 = this.f70420b;
                c7145Rq2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.Rc
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (c7145Rq2.isCancelled()) {
                            qVarZza.cancel(true);
                        }
                    }
                }, C6908Kq.f68180g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
