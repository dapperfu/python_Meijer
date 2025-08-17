package Cd;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
abstract class a0 extends AbstractC3001t {

    /* renamed from: a, reason: collision with root package name */
    private final int f3795a;

    /* renamed from: b, reason: collision with root package name */
    private int f3796b;

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f3796b < this.f3795a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3796b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3796b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3796b - 1;
    }

    protected a0(int i10, int i11) {
        Y.b(i11, i10, "index");
        this.f3795a = i10;
        this.f3796b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f3796b;
            this.f3796b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f3796b - 1;
            this.f3796b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
