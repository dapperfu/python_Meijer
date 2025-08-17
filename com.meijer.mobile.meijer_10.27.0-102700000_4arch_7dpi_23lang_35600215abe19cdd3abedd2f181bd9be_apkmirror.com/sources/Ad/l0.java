package Ad;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
abstract class l0 extends t0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f266a;

    /* renamed from: b, reason: collision with root package name */
    private int f267b;

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f267b < this.f266a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f267b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f267b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f267b - 1;
    }

    protected l0(int i10, int i11) {
        j0.b(i11, i10, "index");
        this.f266a = i10;
        this.f267b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f267b;
            this.f267b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f267b - 1;
            this.f267b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
