package Ee;

import java.util.ListIterator;

/* loaded from: classes6.dex */
abstract class x0<F, T> extends w0<F, T> implements ListIterator<T> {
    private ListIterator<? extends F> c() {
        return (ListIterator) this.f7434a;
    }

    @Override // java.util.ListIterator
    public void add(T t10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void set(T t10) {
        throw new UnsupportedOperationException();
    }

    x0(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return a(c().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }
}
