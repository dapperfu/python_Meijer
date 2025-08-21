package Ee;

import java.util.NoSuchElementException;

/* renamed from: Ee.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3212a<E> extends z0<E> {

    /* renamed from: a, reason: collision with root package name */
    private final int f7330a;

    /* renamed from: b, reason: collision with root package name */
    private int f7331b;

    protected AbstractC3212a(int i10) {
        this(i10, 0);
    }

    protected abstract E a(int i10);

    protected AbstractC3212a(int i10, int i11) {
        De.p.t(i11, i10);
        this.f7330a = i10;
        this.f7331b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7331b < this.f7330a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7331b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7331b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7331b - 1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f7331b;
            this.f7331b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f7331b - 1;
            this.f7331b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
