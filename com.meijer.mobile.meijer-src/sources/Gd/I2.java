package Gd;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
abstract class I2 extends AbstractC3637d {

    /* renamed from: a, reason: collision with root package name */
    private final int f11713a;

    /* renamed from: b, reason: collision with root package name */
    private int f11714b;

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f11714b < this.f11713a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11714b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11714b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11714b - 1;
    }

    protected I2(int i10, int i11) {
        G1.b(i11, i10, "index");
        this.f11713a = i10;
        this.f11714b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f11714b;
            this.f11714b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f11714b - 1;
            this.f11714b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
