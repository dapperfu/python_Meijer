package Dd;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class B0 extends AbstractC3214m0 {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC3202l0 f5165c;

    /* renamed from: d, reason: collision with root package name */
    private final transient AbstractC3178j0 f5166d;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // Dd.AbstractC3118e0
    final int a(Object[] objArr, int i10) {
        return this.f5166d.a(objArr, i10);
    }

    @Override // Dd.AbstractC3118e0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5165c.get(obj) != null;
    }

    @Override // Dd.AbstractC3118e0
    /* renamed from: h */
    public final H0 iterator() {
        return this.f5166d.listIterator(0);
    }

    @Override // Dd.AbstractC3118e0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f5166d.listIterator(0);
    }

    B0(AbstractC3202l0 abstractC3202l0, AbstractC3178j0 abstractC3178j0) {
        this.f5165c = abstractC3202l0;
        this.f5166d = abstractC3178j0;
    }
}
