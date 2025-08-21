package Ed;

import java.util.Iterator;

/* renamed from: Ed.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3200o extends AbstractC3195j {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC3194i f7133c;

    /* renamed from: d, reason: collision with root package name */
    private final transient AbstractC3191f f7134d;

    @Override // Ed.AbstractC3188c
    final int a(Object[] objArr, int i10) {
        return this.f7134d.a(objArr, 0);
    }

    @Override // Ed.AbstractC3188c, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7133c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f7134d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7133c.size();
    }

    C3200o(AbstractC3194i abstractC3194i, AbstractC3191f abstractC3191f) {
        this.f7133c = abstractC3194i;
        this.f7134d = abstractC3191f;
    }
}
