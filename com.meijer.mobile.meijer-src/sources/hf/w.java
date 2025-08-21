package hf;

import java.util.function.Consumer;

/* loaded from: classes8.dex */
class w<E> extends h<E> {

    /* renamed from: b, reason: collision with root package name */
    private final i<E> f135435b;

    /* renamed from: c, reason: collision with root package name */
    private final k<? extends E> f135436c;

    w(i<E> iVar, k<? extends E> kVar) {
        this.f135435b = iVar;
        this.f135436c = kVar;
    }

    @Override // hf.k, hf.i
    int a(Object[] objArr, int i10) {
        return this.f135436c.a(objArr, i10);
    }

    @Override // hf.k, java.lang.Iterable
    public void forEach(Consumer<? super E> consumer) {
        this.f135436c.forEach(consumer);
    }

    @Override // java.util.List
    public E get(int i10) {
        return this.f135436c.get(i10);
    }

    @Override // hf.k, java.util.List
    /* renamed from: l */
    public AbstractC14514D<E> listIterator(int i10) {
        return this.f135436c.listIterator(i10);
    }

    @Override // hf.h
    i<E> q() {
        return this.f135435b;
    }

    w(i<E> iVar, Object[] objArr) {
        this(iVar, k.f(objArr));
    }
}
