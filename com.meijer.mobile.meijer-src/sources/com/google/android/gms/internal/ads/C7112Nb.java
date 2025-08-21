package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Nb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7112Nb {

    /* renamed from: b, reason: collision with root package name */
    int f69754b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f69753a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f69755c = new LinkedList();

    public final void a(C7045Lb c7045Lb) {
        synchronized (this.f69753a) {
            try {
                if (this.f69755c.size() >= 10) {
                    Sc.p.b("Queue is full, current size = " + this.f69755c.size());
                    this.f69755c.remove(0);
                }
                int i10 = this.f69754b;
                this.f69754b = i10 + 1;
                c7045Lb.g(i10);
                c7045Lb.k();
                this.f69755c.add(c7045Lb);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b(C7045Lb c7045Lb) {
        synchronized (this.f69753a) {
            try {
                Iterator it = this.f69755c.iterator();
                while (it.hasNext()) {
                    C7045Lb c7045Lb2 = (C7045Lb) it.next();
                    if (Nc.v.s().j().n()) {
                        if (!Nc.v.s().j().l() && !c7045Lb.equals(c7045Lb2) && c7045Lb2.d().equals(c7045Lb.d())) {
                            it.remove();
                            return true;
                        }
                    } else if (!c7045Lb.equals(c7045Lb2) && c7045Lb2.c().equals(c7045Lb.c())) {
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

    public final boolean c(C7045Lb c7045Lb) {
        synchronized (this.f69753a) {
            try {
                return this.f69755c.contains(c7045Lb);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
