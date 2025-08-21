package Ee;

import java.util.Iterator;

/* loaded from: classes6.dex */
abstract class w0<F, T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    final Iterator<? extends F> f7434a;

    abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7434a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f7434a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7434a.remove();
    }

    w0(Iterator<? extends F> it) {
        this.f7434a = (Iterator) De.p.q(it);
    }
}
