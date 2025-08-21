package Fd;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
abstract class V implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    int f9576a;

    /* renamed from: b, reason: collision with root package name */
    int f9577b;

    /* renamed from: c, reason: collision with root package name */
    int f9578c = -1;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Z f9579d;

    abstract Object a(int i10);

    /* synthetic */ V(Z z10, U u10) {
        this.f9579d = z10;
        this.f9576a = z10.f9710e;
        this.f9577b = z10.i();
    }

    private final void c() {
        if (this.f9579d.f9710e != this.f9576a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9577b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (hasNext()) {
            int i10 = this.f9577b;
            this.f9578c = i10;
            Object objA = a(i10);
            this.f9577b = this.f9579d.j(this.f9577b);
            return objA;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        c();
        if (this.f9578c >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3513t.e(z10, "no calls to next() since the last call to remove()");
        this.f9576a += 32;
        int i10 = this.f9578c;
        Z z11 = this.f9579d;
        z11.remove(Z.k(z11, i10));
        this.f9577b--;
        this.f9578c = -1;
    }
}
