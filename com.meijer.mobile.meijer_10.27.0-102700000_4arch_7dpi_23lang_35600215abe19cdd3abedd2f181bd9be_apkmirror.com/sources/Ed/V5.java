package Ed;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class V5 extends Q5 {

    /* renamed from: c, reason: collision with root package name */
    private final transient P5 f8330c;

    /* renamed from: d, reason: collision with root package name */
    private final transient N5 f8331d;

    @Override // Ed.M4
    final int a(Object[] objArr, int i10) {
        return this.f8331d.a(objArr, 0);
    }

    @Override // Ed.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8330c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f8331d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8330c.size();
    }

    V5(P5 p52, N5 n52) {
        this.f8330c = p52;
        this.f8331d = n52;
    }
}
