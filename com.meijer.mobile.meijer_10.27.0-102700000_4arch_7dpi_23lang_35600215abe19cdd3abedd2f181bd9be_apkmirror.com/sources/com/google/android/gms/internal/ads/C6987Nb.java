package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Nb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6987Nb {

    /* renamed from: b, reason: collision with root package name */
    int f68914b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f68913a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f68915c = new LinkedList();

    public final void a(C6920Lb c6920Lb) {
        synchronized (this.f68913a) {
            try {
                if (this.f68915c.size() >= 10) {
                    Qc.p.b("Queue is full, current size = " + this.f68915c.size());
                    this.f68915c.remove(0);
                }
                int i10 = this.f68914b;
                this.f68914b = i10 + 1;
                c6920Lb.g(i10);
                c6920Lb.k();
                this.f68915c.add(c6920Lb);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b(C6920Lb c6920Lb) {
        synchronized (this.f68913a) {
            try {
                Iterator it = this.f68915c.iterator();
                while (it.hasNext()) {
                    C6920Lb c6920Lb2 = (C6920Lb) it.next();
                    if (Lc.v.s().j().n()) {
                        if (!Lc.v.s().j().l() && !c6920Lb.equals(c6920Lb2) && c6920Lb2.d().equals(c6920Lb.d())) {
                            it.remove();
                            return true;
                        }
                    } else if (!c6920Lb.equals(c6920Lb2) && c6920Lb2.c().equals(c6920Lb.c())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(C6920Lb c6920Lb) {
        synchronized (this.f68913a) {
            try {
                return this.f68915c.contains(c6920Lb);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
