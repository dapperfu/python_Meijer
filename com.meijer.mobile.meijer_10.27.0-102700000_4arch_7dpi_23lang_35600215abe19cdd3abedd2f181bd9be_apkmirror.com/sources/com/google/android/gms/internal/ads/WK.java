package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes6.dex */
public final class WK {

    /* renamed from: a, reason: collision with root package name */
    private final HC f71056a;

    /* renamed from: b, reason: collision with root package name */
    private final QH f71057b;

    /* renamed from: c, reason: collision with root package name */
    private final UJ f71058c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f71059d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque f71060e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f71061f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f71062g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f71063h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f71064i;

    public WK(Looper looper, HC hc2, UJ uj2) {
        this(new CopyOnWriteArraySet(), looper, hc2, uj2, true);
    }

    private WK(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, HC hc2, UJ uj2, boolean z10) {
        this.f71056a = hc2;
        this.f71059d = copyOnWriteArraySet;
        this.f71058c = uj2;
        this.f71062g = new Object();
        this.f71060e = new ArrayDeque();
        this.f71061f = new ArrayDeque();
        this.f71057b = hc2.a(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.rI
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                WK.g(this.f77993a, message);
                return true;
            }
        });
        this.f71064i = z10;
    }

    public static /* synthetic */ boolean g(WK wk2, Message message) {
        Iterator it = wk2.f71059d.iterator();
        while (it.hasNext()) {
            ((C9702vK) it.next()).b(wk2.f71058c);
            if (wk2.f71057b.zzg(1)) {
                break;
            }
        }
        return true;
    }

    private final void h() {
        if (this.f71064i) {
            C8086gC.f(Thread.currentThread() == this.f71057b.zza().getThread());
        }
    }

    public final WK a(Looper looper, UJ uj2) {
        return new WK(this.f71059d, looper, this.f71056a, uj2, this.f71064i);
    }

    public final void b(Object obj) {
        synchronized (this.f71062g) {
            try {
                if (this.f71063h) {
                    return;
                }
                this.f71059d.add(new C9702vK(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        h();
        if (!this.f71061f.isEmpty()) {
            if (!this.f71057b.zzg(1)) {
                QH qh2 = this.f71057b;
                qh2.d(qh2.zzb(1));
            }
            boolean zIsEmpty = this.f71060e.isEmpty();
            this.f71060e.addAll(this.f71061f);
            this.f71061f.clear();
            if (zIsEmpty) {
                while (!this.f71060e.isEmpty()) {
                    ((Runnable) this.f71060e.peekFirst()).run();
                    this.f71060e.removeFirst();
                }
            }
        }
    }

    public final void d(final int i10, final InterfaceC9487tJ interfaceC9487tJ) {
        h();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f71059d);
        this.f71061f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.SI
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    InterfaceC9487tJ interfaceC9487tJ2 = interfaceC9487tJ;
                    ((C9702vK) it.next()).a(i10, interfaceC9487tJ2);
                }
            }
        });
    }

    public final void e() {
        h();
        synchronized (this.f71062g) {
            this.f71063h = true;
        }
        Iterator it = this.f71059d.iterator();
        while (it.hasNext()) {
            ((C9702vK) it.next()).c(this.f71058c);
        }
        this.f71059d.clear();
    }

    public final void f(Object obj) {
        h();
        Iterator it = this.f71059d.iterator();
        while (it.hasNext()) {
            C9702vK c9702vK = (C9702vK) it.next();
            if (c9702vK.f79041a.equals(obj)) {
                c9702vK.c(this.f71058c);
                this.f71059d.remove(c9702vK);
            }
        }
    }
}
