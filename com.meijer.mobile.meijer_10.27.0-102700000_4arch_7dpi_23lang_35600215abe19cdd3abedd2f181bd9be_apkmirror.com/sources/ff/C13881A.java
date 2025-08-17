package ff;

import ef.C13655f;
import java.util.Collections;
import java.util.Spliterator;

/* renamed from: ff.A, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C13881A<E> extends k<E> {

    /* renamed from: b, reason: collision with root package name */
    final transient E f130992b;

    @Override // java.util.List
    public E get(int i10) {
        C13655f.f(i10, 1);
        return this.f130992b;
    }

    @Override // ff.k, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public k<E> subList(int i10, int i11) {
        C13655f.k(i10, i11, 1);
        return i10 == i11 ? k.m() : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return 1;
    }

    @Override // ff.k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC13883C<E> iterator() {
        return o.f(this.f130992b);
    }

    @Override // ff.k, ff.i, java.util.Collection, java.lang.Iterable, java.util.List
    public Spliterator<E> spliterator() {
        return Collections.singleton(this.f130992b).spliterator();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f130992b.toString() + ']';
    }

    C13881A(E e10) {
        this.f130992b = (E) C13655f.h(e10);
    }
}
