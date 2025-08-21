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
    private final HC f71896a;

    /* renamed from: b, reason: collision with root package name */
    private final QH f71897b;

    /* renamed from: c, reason: collision with root package name */
    private final UJ f71898c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f71899d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque f71900e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f71901f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f71902g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f71903h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f71904i;

    public WK(Looper looper, HC hc2, UJ uj2) {
        this(new CopyOnWriteArraySet(), looper, hc2, uj2, true);
    }

    private WK(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, HC hc2, UJ uj2, boolean z10) {
        this.f71896a = hc2;
        this.f71899d = copyOnWriteArraySet;
        this.f71898c = uj2;
        this.f71902g = new Object();
        this.f71900e = new ArrayDeque();
        this.f71901f = new ArrayDeque();
        this.f71897b = hc2.a(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.rI
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                WK.g(this.f78833a, message);
                return true;
            }
        });
        this.f71904i = z10;
    }

    public static /* synthetic */ boolean g(WK wk2, Message message) {
        Iterator it = wk2.f71899d.iterator();
        while (it.hasNext()) {
            ((C9827vK) it.next()).b(wk2.f71898c);
            if (wk2.f71897b.zzg(1)) {
                break;
            }
        }
        return true;
    }

    private final void h() {
        if (this.f71904i) {
            C8211gC.f(Thread.currentThread() == this.f71897b.zza().getThread());
        }
    }

    public final WK a(Looper looper, UJ uj2) {
        return new WK(this.f71899d, looper, this.f71896a, uj2, this.f71904i);
    }

    public final void b(Object obj) {
        synchronized (this.f71902g) {
            try {
                if (this.f71903h) {
                    return;
                }
                this.f71899d.add(new C9827vK(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        h();
        if (!this.f71901f.isEmpty()) {
            if (!this.f71897b.zzg(1)) {
                QH qh2 = this.f71897b;
                qh2.d(qh2.zzb(1));
            }
            boolean zIsEmpty = this.f71900e.isEmpty();
            this.f71900e.addAll(this.f71901f);
            this.f71901f.clear();
            if (zIsEmpty) {
                while (!this.f71900e.isEmpty()) {
                    ((Runnable) this.f71900e.peekFirst()).run();
                    this.f71900e.removeFirst();
                }
            }
        }
    }

    public final void d(final int i10, final InterfaceC9612tJ interfaceC9612tJ) {
        h();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f71899d);
        this.f71901f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.SI
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    InterfaceC9612tJ interfaceC9612tJ2 = interfaceC9612tJ;
                    ((C9827vK) it.next()).a(i10, interfaceC9612tJ2);
                }
            }
        });
    }

    public final void e() {
        h();
        synchronized (this.f71902g) {
            this.f71903h = true;
        }
        Iterator it = this.f71899d.iterator();
        while (it.hasNext()) {
            ((C9827vK) it.next()).c(this.f71898c);
        }
        this.f71899d.clear();
    }

    public final void f(Object obj) {
        h();
        Iterator it = this.f71899d.iterator();
        while (it.hasNext()) {
            C9827vK c9827vK = (C9827vK) it.next();
            if (c9827vK.f79881a.equals(obj)) {
                c9827vK.c(this.f71898c);
                this.f71899d.remove(c9827vK);
            }
        }
    }
}
