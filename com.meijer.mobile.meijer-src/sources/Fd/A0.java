package Fd;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class A0 extends AbstractC3436m0 {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC3424l0 f9178c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f9179d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f9180e = 1;

    @Override // Fd.AbstractC3340e0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f9178c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // Fd.AbstractC3436m0
    final AbstractC3400j0 m() {
        return new C3580z0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9180e;
    }

    A0(AbstractC3424l0 abstractC3424l0, Object[] objArr, int i10, int i11) {
        this.f9178c = abstractC3424l0;
        this.f9179d = objArr;
    }

    @Override // Fd.AbstractC3340e0
    final int a(Object[] objArr, int i10) {
        return l().a(objArr, i10);
    }

    @Override // Fd.AbstractC3340e0
    /* renamed from: h */
    public final H0 iterator() {
        return l().listIterator(0);
    }

    @Override // Fd.AbstractC3340e0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return l().listIterator(0);
    }
}
