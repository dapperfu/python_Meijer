package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.Hg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC6920Hg0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    int f68323a;

    /* renamed from: b, reason: collision with root package name */
    int f68324b;

    /* renamed from: c, reason: collision with root package name */
    int f68325c = -1;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7089Mg0 f68326d;

    abstract Object a(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f68324b >= 0;
    }

    /* synthetic */ AbstractC6920Hg0(C7089Mg0 c7089Mg0, C7056Lg0 c7056Lg0) {
        this.f68326d = c7089Mg0;
        this.f68323a = c7089Mg0.f69538e;
        this.f68324b = c7089Mg0.i();
    }

    private final void c() {
        if (this.f68326d.f69538e != this.f68323a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (hasNext()) {
            int i10 = this.f68324b;
            this.f68325c = i10;
            Object objA = a(i10);
            this.f68324b = this.f68326d.j(this.f68324b);
            return objA;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        c();
        if (this.f68325c >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C6782Df0.m(z10, "no calls to next() since the last call to remove()");
        this.f68323a += 32;
        int i10 = this.f68325c;
        C7089Mg0 c7089Mg0 = this.f68326d;
        c7089Mg0.remove(C7089Mg0.k(c7089Mg0, i10));
        this.f68324b--;
        this.f68325c = -1;
    }
}
