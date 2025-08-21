package hf;

import gf.C14359f;
import java.util.NoSuchElementException;

/* renamed from: hf.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC14515a<E> extends AbstractC14514D<E> {

    /* renamed from: a, reason: collision with root package name */
    private final int f135341a;

    /* renamed from: b, reason: collision with root package name */
    private int f135342b;

    protected abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f135342b < this.f135341a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f135342b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f135342b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f135342b - 1;
    }

    protected AbstractC14515a(int i10, int i11) {
        C14359f.i(i11, i10);
        this.f135341a = i10;
        this.f135342b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f135342b;
            this.f135342b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f135342b - 1;
            this.f135342b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
