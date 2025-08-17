package ff;

import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes7.dex */
class x<E> extends k<E> {

    /* renamed from: c, reason: collision with root package name */
    static final k<Object> f131091c = new x(new Object[0]);

    /* renamed from: b, reason: collision with root package name */
    final transient Object[] f131092b;

    @Override // ff.k, ff.i
    int a(Object[] objArr, int i10) {
        Object[] objArr2 = this.f131092b;
        System.arraycopy(objArr2, 0, objArr, i10, objArr2.length);
        return i10 + this.f131092b.length;
    }

    @Override // java.util.List
    public E get(int i10) {
        return (E) this.f131092b[i10];
    }

    @Override // ff.k, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC13884D<E> listIterator(int i10) {
        Object[] objArr = this.f131092b;
        return o.e(objArr, 0, objArr.length, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f131092b.length;
    }

    @Override // ff.k, ff.i, java.util.Collection, java.lang.Iterable, java.util.List
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this.f131092b, 1296);
    }

    x(Object[] objArr) {
        this.f131092b = objArr;
    }
}
