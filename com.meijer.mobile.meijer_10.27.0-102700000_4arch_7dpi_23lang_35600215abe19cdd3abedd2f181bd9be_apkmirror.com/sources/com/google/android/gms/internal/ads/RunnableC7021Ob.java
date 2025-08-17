package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Ob, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC7021Ob implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7055Pb f69120a;

    RunnableC7021Ob(C7055Pb c7055Pb) {
        this.f69120a = c7055Pb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f69120a.f69368c) {
            C7055Pb c7055Pb = this.f69120a;
            if (c7055Pb.f69369d && c7055Pb.f69370e) {
                c7055Pb.f69369d = false;
                Qc.p.b("App went background");
                Iterator it = this.f69120a.f69371f.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC7089Qb) it.next()).a(false);
                    } catch (Exception e10) {
                        Qc.p.e("", e10);
                    }
                }
            } else {
                Qc.p.b("App is still foreground");
            }
        }
    }
}
