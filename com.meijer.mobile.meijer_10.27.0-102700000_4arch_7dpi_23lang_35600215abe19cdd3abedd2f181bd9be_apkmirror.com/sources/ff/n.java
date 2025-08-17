package ff;

import ef.C13655f;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes7.dex */
abstract class n<E> extends l<E> {

    class a extends h<E> {
        a() {
        }

        @Override // java.util.List
        public E get(int i10) {
            return (E) n.this.get(i10);
        }

        @Override // ff.h
        i<E> q() {
            return n.this;
        }

        @Override // ff.h, java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return n.this.size();
        }
    }

    abstract E get(int i10);

    @Override // ff.l
    k<E> l() {
        return new a();
    }

    n() {
    }

    @Override // ff.i
    int a(Object[] objArr, int i10) {
        return f().a(objArr, i10);
    }

    @Override // ff.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public AbstractC13883C<E> iterator() {
        return f().iterator();
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer<? super E> consumer) {
        C13655f.h(consumer);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            consumer.accept(get(i10));
        }
    }

    @Override // ff.i, java.util.Collection, java.lang.Iterable, java.util.List
    public Spliterator<E> spliterator() {
        return f.a(size(), 1297, new IntFunction() { // from class: ff.m
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return this.f131019a.get(i10);
            }
        });
    }
}
