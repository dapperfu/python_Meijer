package Fd;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class B0 extends AbstractC3436m0 {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC3424l0 f9198c;

    /* renamed from: d, reason: collision with root package name */
    private final transient AbstractC3400j0 f9199d;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // Fd.AbstractC3340e0
    final int a(Object[] objArr, int i10) {
        return this.f9199d.a(objArr, i10);
    }

    @Override // Fd.AbstractC3340e0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9198c.get(obj) != null;
    }

    @Override // Fd.AbstractC3340e0
    /* renamed from: h */
    public final H0 iterator() {
        return this.f9199d.listIterator(0);
    }

    @Override // Fd.AbstractC3340e0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f9199d.listIterator(0);
    }

    B0(AbstractC3424l0 abstractC3424l0, AbstractC3400j0 abstractC3400j0) {
        this.f9198c = abstractC3424l0;
        this.f9199d = abstractC3400j0;
    }
}
