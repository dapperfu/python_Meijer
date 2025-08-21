package hf;

import gf.C14359f;

/* renamed from: hf.B, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C14512B<E> extends l<E> {

    /* renamed from: c, reason: collision with root package name */
    final transient E f135339c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f135340d;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // hf.i
    int a(Object[] objArr, int i10) {
        objArr[i10] = this.f135339c;
        return i10 + 1;
    }

    @Override // hf.i, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f135339c.equals(obj);
    }

    @Override // hf.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public AbstractC14513C<E> iterator() {
        return o.f(this.f135339c);
    }

    @Override // hf.l, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.f135340d;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f135339c.hashCode();
        this.f135340d = iHashCode;
        return iHashCode;
    }

    @Override // hf.l
    k<E> l() {
        return k.n(this.f135339c);
    }

    @Override // hf.l
    boolean n() {
        return this.f135340d != 0;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f135339c.toString() + ']';
    }

    C14512B(E e10) {
        this.f135339c = (E) C14359f.h(e10);
    }
}
