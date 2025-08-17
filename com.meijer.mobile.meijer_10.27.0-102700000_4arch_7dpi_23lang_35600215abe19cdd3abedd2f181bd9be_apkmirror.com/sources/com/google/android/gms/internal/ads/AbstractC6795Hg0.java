package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.Hg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC6795Hg0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    int f67483a;

    /* renamed from: b, reason: collision with root package name */
    int f67484b;

    /* renamed from: c, reason: collision with root package name */
    int f67485c = -1;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6964Mg0 f67486d;

    abstract Object a(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67484b >= 0;
    }

    /* synthetic */ AbstractC6795Hg0(C6964Mg0 c6964Mg0, C6931Lg0 c6931Lg0) {
        this.f67486d = c6964Mg0;
        this.f67483a = c6964Mg0.f68698e;
        this.f67484b = c6964Mg0.i();
    }

    private final void c() {
        if (this.f67486d.f68698e != this.f67483a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (hasNext()) {
            int i10 = this.f67484b;
            this.f67485c = i10;
            Object objA = a(i10);
            this.f67484b = this.f67486d.j(this.f67484b);
            return objA;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        c();
        if (this.f67485c >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C6657Df0.m(z10, "no calls to next() since the last call to remove()");
        this.f67483a += 32;
        int i10 = this.f67485c;
        C6964Mg0 c6964Mg0 = this.f67486d;
        c6964Mg0.remove(C6964Mg0.k(c6964Mg0, i10));
        this.f67484b--;
        this.f67485c = -1;
    }
}
