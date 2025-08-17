package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.cH0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7670cH0 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f73149a = new CopyOnWriteArrayList();

    public final void b(final int i10, final long j10, final long j11) {
        Iterator it = this.f73149a.iterator();
        while (it.hasNext()) {
            final C7564bH0 c7564bH0 = (C7564bH0) it.next();
            if (!c7564bH0.f72782c) {
                c7564bH0.f72780a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.aH0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c7564bH0.f72781b.O(i10, j10, j11);
                    }
                });
            }
        }
    }

    public final void c(InterfaceC7777dH0 interfaceC7777dH0) {
        Iterator it = this.f73149a.iterator();
        while (it.hasNext()) {
            C7564bH0 c7564bH0 = (C7564bH0) it.next();
            if (c7564bH0.f72781b == interfaceC7777dH0) {
                c7564bH0.c();
                this.f73149a.remove(c7564bH0);
            }
        }
    }

    public final void a(Handler handler, InterfaceC7777dH0 interfaceC7777dH0) {
        c(interfaceC7777dH0);
        this.f73149a.add(new C7564bH0(handler, interfaceC7777dH0));
    }
}
