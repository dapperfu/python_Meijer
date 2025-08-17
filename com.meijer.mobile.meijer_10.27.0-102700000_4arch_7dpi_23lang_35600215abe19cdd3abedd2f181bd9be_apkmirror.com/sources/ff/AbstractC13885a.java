package ff;

import ef.C13655f;
import java.util.NoSuchElementException;

/* renamed from: ff.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
abstract class AbstractC13885a<E> extends AbstractC13884D<E> {

    /* renamed from: a, reason: collision with root package name */
    private final int f130995a;

    /* renamed from: b, reason: collision with root package name */
    private int f130996b;

    protected abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f130996b < this.f130995a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f130996b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f130996b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f130996b - 1;
    }

    protected AbstractC13885a(int i10, int i11) {
        C13655f.i(i11, i10);
        this.f130995a = i10;
        this.f130996b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f130996b;
            this.f130996b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f130996b - 1;
            this.f130996b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
