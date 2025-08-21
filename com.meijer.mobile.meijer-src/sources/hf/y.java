package hf;

import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes8.dex */
final class y<E> extends l<E> {

    /* renamed from: g, reason: collision with root package name */
    static final y<Object> f135439g = new y<>(new Object[0], 0, null, 0);

    /* renamed from: c, reason: collision with root package name */
    private final transient Object[] f135440c;

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f135441d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f135442e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f135443f;

    @Override // hf.l
    boolean n() {
        return true;
    }

    @Override // hf.i
    int a(Object[] objArr, int i10) {
        Object[] objArr2 = this.f135440c;
        System.arraycopy(objArr2, 0, objArr, i10, objArr2.length);
        return i10 + this.f135440c.length;
    }

    @Override // hf.i, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f135441d;
        if (obj == null || objArr == null) {
            return false;
        }
        int iB = g.b(obj);
        while (true) {
            int i10 = iB & this.f135442e;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iB = i10 + 1;
        }
    }

    @Override // hf.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public AbstractC14513C<E> iterator() {
        return o.d(this.f135440c);
    }

    @Override // hf.l, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f135443f;
    }

    @Override // hf.l
    k<E> l() {
        return this.f135441d == null ? k.m() : new w(this, this.f135440c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f135440c.length;
    }

    @Override // hf.i, java.util.Collection, java.lang.Iterable, java.util.List
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this.f135440c, 1297);
    }

    y(Object[] objArr, int i10, Object[] objArr2, int i11) {
        this.f135440c = objArr;
        this.f135441d = objArr2;
        this.f135442e = i11;
        this.f135443f = i10;
    }
}
