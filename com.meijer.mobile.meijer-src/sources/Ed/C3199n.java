package Ed;

import java.util.Iterator;
import java.util.Map;

/* renamed from: Ed.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3199n extends AbstractC3195j {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC3194i f7130c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f7131d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f7132e;

    @Override // Ed.AbstractC3188c, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7130c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // Ed.AbstractC3195j
    final AbstractC3191f l() {
        return new C3198m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7132e;
    }

    C3199n(AbstractC3194i abstractC3194i, Object[] objArr, int i10, int i11) {
        this.f7130c = abstractC3194i;
        this.f7131d = objArr;
        this.f7132e = i11;
    }

    @Override // Ed.AbstractC3188c
    final int a(Object[] objArr, int i10) {
        return k().a(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }
}
