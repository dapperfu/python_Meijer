package Gd;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class V5 extends Q5 {

    /* renamed from: c, reason: collision with root package name */
    private final transient P5 f11882c;

    /* renamed from: d, reason: collision with root package name */
    private final transient N5 f11883d;

    @Override // Gd.M4
    final int a(Object[] objArr, int i10) {
        return this.f11883d.a(objArr, 0);
    }

    @Override // Gd.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11882c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f11883d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11882c.size();
    }

    V5(P5 p52, N5 n52) {
        this.f11882c = p52;
        this.f11883d = n52;
    }
}
