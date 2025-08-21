package hf;

import gf.C14359f;
import java.util.Collections;
import java.util.Spliterator;

/* renamed from: hf.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C14511A<E> extends k<E> {

    /* renamed from: b, reason: collision with root package name */
    final transient E f135338b;

    @Override // java.util.List
    public E get(int i10) {
        C14359f.f(i10, 1);
        return this.f135338b;
    }

    @Override // hf.k, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public k<E> subList(int i10, int i11) {
        C14359f.k(i10, i11, 1);
        return i10 == i11 ? k.m() : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return 1;
    }

    @Override // hf.k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC14513C<E> iterator() {
        return o.f(this.f135338b);
    }

    @Override // hf.k, hf.i, java.util.Collection, java.lang.Iterable, java.util.List
    public Spliterator<E> spliterator() {
        return Collections.singleton(this.f135338b).spliterator();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f135338b.toString() + ']';
    }

    C14511A(E e10) {
        this.f135338b = (E) C14359f.h(e10);
    }
}
