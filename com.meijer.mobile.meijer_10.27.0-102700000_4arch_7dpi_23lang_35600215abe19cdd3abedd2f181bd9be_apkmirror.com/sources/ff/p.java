package ff;

import java.util.Set;

/* loaded from: classes7.dex */
final class p<E> extends n<E> {

    /* renamed from: c, reason: collision with root package name */
    private final Set<?> f131026c;

    /* renamed from: d, reason: collision with root package name */
    private final k<E> f131027d;

    @Override // ff.i, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f131026c.contains(obj);
    }

    @Override // ff.n
    E get(int i10) {
        return this.f131027d.get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f131027d.size();
    }

    p(Set<?> set, k<E> kVar) {
        this.f131026c = set;
        this.f131027d = kVar;
    }
}
