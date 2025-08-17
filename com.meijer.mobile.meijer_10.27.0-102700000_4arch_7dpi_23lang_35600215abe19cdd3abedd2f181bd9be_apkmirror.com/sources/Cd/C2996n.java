package Cd;

import java.util.Iterator;
import java.util.Map;

/* renamed from: Cd.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C2996n extends AbstractC2992j {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC2991i f3818c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f3819d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f3820e;

    @Override // Cd.AbstractC2985c, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f3818c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // Cd.AbstractC2992j
    final AbstractC2988f l() {
        return new C2995m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3820e;
    }

    C2996n(AbstractC2991i abstractC2991i, Object[] objArr, int i10, int i11) {
        this.f3818c = abstractC2991i;
        this.f3819d = objArr;
        this.f3820e = i11;
    }

    @Override // Cd.AbstractC2985c
    final int a(Object[] objArr, int i10) {
        return k().a(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }
}
