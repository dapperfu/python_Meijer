package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Ob, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC7146Ob implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7180Pb f69960a;

    RunnableC7146Ob(C7180Pb c7180Pb) {
        this.f69960a = c7180Pb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f69960a.f70208c) {
            C7180Pb c7180Pb = this.f69960a;
            if (c7180Pb.f70209d && c7180Pb.f70210e) {
                c7180Pb.f70209d = false;
                Sc.p.b("App went background");
                Iterator it = this.f69960a.f70211f.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC7214Qb) it.next()).a(false);
                    } catch (Exception e10) {
                        Sc.p.e("", e10);
                    }
                }
            } else {
                Sc.p.b("App is still foreground");
            }
        }
    }
}
