package Cd;

import java.util.Iterator;

/* renamed from: Cd.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C2997o extends AbstractC2992j {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC2991i f3821c;

    /* renamed from: d, reason: collision with root package name */
    private final transient AbstractC2988f f3822d;

    @Override // Cd.AbstractC2985c
    final int a(Object[] objArr, int i10) {
        return this.f3822d.a(objArr, 0);
    }

    @Override // Cd.AbstractC2985c, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3821c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f3822d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3821c.size();
    }

    C2997o(AbstractC2991i abstractC2991i, AbstractC2988f abstractC2988f) {
        this.f3821c = abstractC2991i;
        this.f3822d = abstractC2988f;
    }
}
