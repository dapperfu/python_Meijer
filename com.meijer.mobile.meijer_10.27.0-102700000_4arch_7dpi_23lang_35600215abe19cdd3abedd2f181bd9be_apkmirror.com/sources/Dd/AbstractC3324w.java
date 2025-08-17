package Dd;

import java.util.NoSuchElementException;

/* renamed from: Dd.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3324w extends I0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f6312a;

    /* renamed from: b, reason: collision with root package name */
    private int f6313b;

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f6313b < this.f6312a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6313b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6313b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6313b - 1;
    }

    protected AbstractC3324w(int i10, int i11) {
        C3291t.b(i11, i10, "index");
        this.f6312a = i10;
        this.f6313b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f6313b;
            this.f6313b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f6313b - 1;
            this.f6313b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
