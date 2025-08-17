package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.kF0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8519kF0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f75599a;

    /* renamed from: b, reason: collision with root package name */
    public final C7453aF0 f75600b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f75601c;

    private C8519kF0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C7453aF0 c7453aF0) {
        this.f75601c = copyOnWriteArrayList;
        this.f75599a = 0;
        this.f75600b = c7453aF0;
    }

    public final C8519kF0 a(int i10, C7453aF0 c7453aF0) {
        return new C8519kF0(this.f75601c, 0, c7453aF0);
    }

    public C8519kF0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void b(Handler handler, InterfaceC8626lF0 interfaceC8626lF0) {
        this.f75601c.add(new C8412jF0(handler, interfaceC8626lF0));
    }

    public final void c(final ME me2) {
        Iterator it = this.f75601c.iterator();
        while (it.hasNext()) {
            C8412jF0 c8412jF0 = (C8412jF0) it.next();
            final InterfaceC8626lF0 interfaceC8626lF0 = c8412jF0.f75428b;
            Handler handler = c8412jF0.f75427a;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.iF0
                @Override // java.lang.Runnable
                public final void run() {
                    me2.zza(interfaceC8626lF0);
                }
            };
            int i10 = OV.f69091a;
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
                ((InterfaceC8626lF0) obj).p(0, this.f73382a.f75600b, we0);
            }
        });
    }

    public final void e(final QE0 qe0, final WE0 we0) {
        c(new ME() { // from class: com.google.android.gms.internal.ads.hF0
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                ((InterfaceC8626lF0) obj).g(0, this.f74702a.f75600b, qe0, we0);
            }
        });
    }

    public final void f(final QE0 qe0, final WE0 we0) {
        c(new ME() { // from class: com.google.android.gms.internal.ads.fF0
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                ((InterfaceC8626lF0) obj).n(0, this.f74069a.f75600b, qe0, we0);
            }
        });
    }

    public final void g(final QE0 qe0, final WE0 we0, final IOException iOException, final boolean z10) {
        c(new ME() { // from class: com.google.android.gms.internal.ads.gF0
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                ((InterfaceC8626lF0) obj).z(0, this.f74286a.f75600b, qe0, we0, iOException, z10);
            }
        });
    }

    public final void h(final QE0 qe0, final WE0 we0) {
        c(new ME() { // from class: com.google.android.gms.internal.ads.eF0
            @Override // com.google.android.gms.internal.ads.ME
            public final void zza(Object obj) {
                ((InterfaceC8626lF0) obj).l(0, this.f73795a.f75600b, qe0, we0);
            }
        });
    }

    public final void i(InterfaceC8626lF0 interfaceC8626lF0) {
        Iterator it = this.f75601c.iterator();
        while (it.hasNext()) {
            C8412jF0 c8412jF0 = (C8412jF0) it.next();
            if (c8412jF0.f75428b == interfaceC8626lF0) {
                this.f75601c.remove(c8412jF0);
            }
        }
    }
}
