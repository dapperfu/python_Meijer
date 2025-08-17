package Ce;

import java.util.NoSuchElementException;

/* renamed from: Ce.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3009a<E> extends z0<E> {

    /* renamed from: a, reason: collision with root package name */
    private final int f4018a;

    /* renamed from: b, reason: collision with root package name */
    private int f4019b;

    protected AbstractC3009a(int i10) {
        this(i10, 0);
    }

    protected abstract E a(int i10);

    protected AbstractC3009a(int i10, int i11) {
        Be.p.t(i11, i10);
        this.f4018a = i10;
        this.f4019b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4019b < this.f4018a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4019b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4019b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4019b - 1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f4019b;
            this.f4019b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f4019b - 1;
            this.f4019b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
