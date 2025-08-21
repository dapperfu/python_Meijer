package Fd;

import java.util.NoSuchElementException;

/* renamed from: Fd.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3546w extends I0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f10345a;

    /* renamed from: b, reason: collision with root package name */
    private int f10346b;

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f10346b < this.f10345a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10346b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10346b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10346b - 1;
    }

    protected AbstractC3546w(int i10, int i11) {
        C3513t.b(i11, i10, "index");
        this.f10345a = i10;
        this.f10346b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f10346b;
            this.f10346b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f10346b - 1;
            this.f10346b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
