package Dd;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
abstract class V implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    int f5543a;

    /* renamed from: b, reason: collision with root package name */
    int f5544b;

    /* renamed from: c, reason: collision with root package name */
    int f5545c = -1;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Z f5546d;

    abstract Object a(int i10);

    /* synthetic */ V(Z z10, U u10) {
        this.f5546d = z10;
        this.f5543a = z10.f5677e;
        this.f5544b = z10.i();
    }

    private final void c() {
        if (this.f5546d.f5677e != this.f5543a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5544b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (hasNext()) {
            int i10 = this.f5544b;
            this.f5545c = i10;
            Object objA = a(i10);
            this.f5544b = this.f5546d.j(this.f5544b);
            return objA;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        c();
        if (this.f5545c >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3291t.e(z10, "no calls to next() since the last call to remove()");
        this.f5543a += 32;
        int i10 = this.f5545c;
        Z z11 = this.f5546d;
        z11.remove(Z.k(z11, i10));
        this.f5544b--;
        this.f5545c = -1;
    }
}
