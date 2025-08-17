package ff;

import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes7.dex */
final class y<E> extends l<E> {

    /* renamed from: g, reason: collision with root package name */
    static final y<Object> f131093g = new y<>(new Object[0], 0, null, 0);

    /* renamed from: c, reason: collision with root package name */
    private final transient Object[] f131094c;

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f131095d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f131096e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f131097f;

    @Override // ff.l
    boolean n() {
        return true;
    }

    @Override // ff.i
    int a(Object[] objArr, int i10) {
        Object[] objArr2 = this.f131094c;
        System.arraycopy(objArr2, 0, objArr, i10, objArr2.length);
        return i10 + this.f131094c.length;
    }

    @Override // ff.i, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f131095d;
        if (obj == null || objArr == null) {
            return false;
        }
        int iB = g.b(obj);
        while (true) {
            int i10 = iB & this.f131096e;
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

    @Override // ff.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public AbstractC13883C<E> iterator() {
        return o.d(this.f131094c);
    }

    @Override // ff.l, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f131097f;
    }

    @Override // ff.l
    k<E> l() {
        return this.f131095d == null ? k.m() : new w(this, this.f131094c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f131094c.length;
    }

    @Override // ff.i, java.util.Collection, java.lang.Iterable, java.util.List
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this.f131094c, 1297);
    }

    y(Object[] objArr, int i10, Object[] objArr2, int i11) {
        this.f131094c = objArr;
        this.f131095d = objArr2;
        this.f131096e = i11;
        this.f131097f = i10;
    }
}
