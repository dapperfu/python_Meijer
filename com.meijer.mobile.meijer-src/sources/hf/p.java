package hf;

import java.util.Set;

/* loaded from: classes8.dex */
final class p<E> extends n<E> {

    /* renamed from: c, reason: collision with root package name */
    private final Set<?> f135372c;

    /* renamed from: d, reason: collision with root package name */
    private final k<E> f135373d;

    @Override // hf.i, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f135372c.contains(obj);
    }

    @Override // hf.n
    E get(int i10) {
        return this.f135373d.get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f135373d.size();
    }

    p(Set<?> set, k<E> kVar) {
        this.f135372c = set;
        this.f135373d = kVar;
    }
}
