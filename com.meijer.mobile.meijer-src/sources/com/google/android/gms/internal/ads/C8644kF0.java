package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.kF0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8644kF0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f76439a;

    /* renamed from: b, reason: collision with root package name */
    public final C7578aF0 f76440b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f76441c;

    private C8644kF0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C7578aF0 c7578aF0) {
        this.f76441c = copyOnWriteArrayList;
        this.f76439a = 0;
        this.f76440b = c7578aF0;
    }

    public final C8644kF0 a(int i10, C7578aF0 c7578aF0) {
        return new C8644kF0(this.f76441c, 0, c7578aF0);
    }

    public C8644kF0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void b(Handler handler, InterfaceC8751lF0 interfaceC8751lF0) {
        this.f76441c.add(new C8537jF0(handler, interfaceC8751lF0));
    }

    public final void c(final ME me2) {
        Iterator it = this.f76441c.iterator();
        while (it.hasNext()) {
            C8537jF0 c8537jF0 = (C8537jF0) it.next();
            final InterfaceC8751lF0 interfaceC8751lF0 = c8537jF0.f76268b;
            Handler handler = c8537jF0.f76267a;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.iF0
                @Override // java.lang.Runnable
                public final void run() {
                    me2.zza(interfaceC8751lF0);
                }
            };
            int i10 = OV.f69931a;
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }
    }

    public final void d(final WE0 we0) {
        c(new ME() { // from class: com.google.android.gms.internal.ads.dF0
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                ((InterfaceC8751lF0) obj).p(0, this.f74222a.f76440b, we0);
            }
        });
    }

    public final void e(final QE0 qe0, final WE0 we0) {
        c(new ME() { // from class: com.google.android.gms.internal.ads.hF0
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                ((InterfaceC8751lF0) obj).g(0, this.f75542a.f76440b, qe0, we0);
            }
        });
    }

    public final void f(final QE0 qe0, final WE0 we0) {
        c(new ME() { // from class: com.google.android.gms.internal.ads.fF0
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                ((InterfaceC8751lF0) obj).n(0, this.f74909a.f76440b, qe0, we0);
            }
        });
    }

    public final void g(final QE0 qe0, final WE0 we0, final IOException iOException, final boolean z10) {
        c(new ME() { // from class: com.google.android.gms.internal.ads.gF0
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                ((InterfaceC8751lF0) obj).z(0, this.f75126a.f76440b, qe0, we0, iOException, z10);
            }
        });
    }

    public final void h(final QE0 qe0, final WE0 we0) {
        c(new ME() { // from class: com.google.android.gms.internal.ads.eF0
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                ((InterfaceC8751lF0) obj).l(0, this.f74635a.f76440b, qe0, we0);
            }
        });
    }

    public final void i(InterfaceC8751lF0 interfaceC8751lF0) {
        Iterator it = this.f76441c.iterator();
        while (it.hasNext()) {
            C8537jF0 c8537jF0 = (C8537jF0) it.next();
            if (c8537jF0.f76268b == interfaceC8751lF0) {
                this.f76441c.remove(c8537jF0);
            }
        }
    }
}
