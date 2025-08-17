package Ed;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
abstract class I2 extends AbstractC3445d {

    /* renamed from: a, reason: collision with root package name */
    private final int f8161a;

    /* renamed from: b, reason: collision with root package name */
    private int f8162b;

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f8162b < this.f8161a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8162b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8162b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8162b - 1;
    }

    protected I2(int i10, int i11) {
        G1.b(i11, i10, "index");
        this.f8161a = i10;
        this.f8162b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f8162b;
            this.f8162b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f8162b - 1;
            this.f8162b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
