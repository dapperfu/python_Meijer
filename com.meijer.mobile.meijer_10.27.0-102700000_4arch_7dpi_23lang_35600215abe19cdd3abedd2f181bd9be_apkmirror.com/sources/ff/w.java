package ff;

import java.util.function.Consumer;

/* loaded from: classes7.dex */
class w<E> extends h<E> {

    /* renamed from: b, reason: collision with root package name */
    private final i<E> f131089b;

    /* renamed from: c, reason: collision with root package name */
    private final k<? extends E> f131090c;

    w(i<E> iVar, k<? extends E> kVar) {
        this.f131089b = iVar;
        this.f131090c = kVar;
    }

    @Override // ff.k, ff.i
    int a(Object[] objArr, int i10) {
        return this.f131090c.a(objArr, i10);
    }

    @Override // ff.k, java.lang.Iterable
    public void forEach(Consumer<? super E> consumer) {
        this.f131090c.forEach(consumer);
    }

    @Override // java.util.List
    public E get(int i10) {
        return this.f131090c.get(i10);
    }

    @Override // ff.k, java.util.List
    /* renamed from: l */
    public AbstractC13884D<E> listIterator(int i10) {
        return this.f131090c.listIterator(i10);
    }

    @Override // ff.h
    i<E> q() {
        return this.f131089b;
    }

    w(i<E> iVar, Object[] objArr) {
        this(iVar, k.f(objArr));
    }
}
