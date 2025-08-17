package Ed;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class U5 extends Q5 {

    /* renamed from: c, reason: collision with root package name */
    private final transient P5 f8315c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f8316d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f8317e;

    @Override // Ed.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f8315c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // Ed.Q5
    final N5 l() {
        return new T5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8317e;
    }

    U5(P5 p52, Object[] objArr, int i10, int i11) {
        this.f8315c = p52;
        this.f8316d = objArr;
        this.f8317e = i11;
    }

    @Override // Ed.M4
    final int a(Object[] objArr, int i10) {
        return k().a(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }
}
