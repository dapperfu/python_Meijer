package Dd;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class A0 extends AbstractC3214m0 {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC3202l0 f5145c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f5146d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f5147e = 1;

    @Override // Dd.AbstractC3118e0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5145c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // Dd.AbstractC3214m0
    final AbstractC3178j0 m() {
        return new C3358z0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5147e;
    }

    A0(AbstractC3202l0 abstractC3202l0, Object[] objArr, int i10, int i11) {
        this.f5145c = abstractC3202l0;
        this.f5146d = objArr;
    }

    @Override // Dd.AbstractC3118e0
    final int a(Object[] objArr, int i10) {
        return l().a(objArr, i10);
    }

    @Override // Dd.AbstractC3118e0
    /* renamed from: h */
    public final H0 iterator() {
        return l().listIterator(0);
    }

    @Override // Dd.AbstractC3118e0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return l().listIterator(0);
    }
}
