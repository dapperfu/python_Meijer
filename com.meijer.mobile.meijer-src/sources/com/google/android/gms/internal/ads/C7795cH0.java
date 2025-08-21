package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.cH0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7795cH0 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f73989a = new CopyOnWriteArrayList();

    public final void b(final int i10, final long j10, final long j11) {
        Iterator it = this.f73989a.iterator();
        while (it.hasNext()) {
            final C7689bH0 c7689bH0 = (C7689bH0) it.next();
            if (!c7689bH0.f73622c) {
                c7689bH0.f73620a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.aH0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c7689bH0.f73621b.O(i10, j10, j11);
                    }
                });
            }
        }
    }

    public final void c(InterfaceC7902dH0 interfaceC7902dH0) {
        Iterator it = this.f73989a.iterator();
        while (it.hasNext()) {
            C7689bH0 c7689bH0 = (C7689bH0) it.next();
            if (c7689bH0.f73621b == interfaceC7902dH0) {
                c7689bH0.c();
                this.f73989a.remove(c7689bH0);
            }
        }
    }

    public final void a(Handler handler, InterfaceC7902dH0 interfaceC7902dH0) {
        c(interfaceC7902dH0);
        this.f73989a.add(new C7689bH0(handler, interfaceC7902dH0));
    }
}
