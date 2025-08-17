package Dd;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
final class A extends AbstractC3292t0 {

    /* renamed from: c, reason: collision with root package name */
    final transient Map f5143c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ I f5144d;

    A(I i10, Map map) {
        this.f5144d = i10;
        this.f5143c = map;
    }

    @Override // Dd.AbstractC3292t0
    protected final Set a() {
        return new C3346y(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection get(Object obj) {
        Collection collection = (Collection) C3303u0.a(this.f5143c, obj);
        if (collection == null) {
            return null;
        }
        return this.f5144d.e(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        I i10 = this.f5144d;
        if (this.f5143c == i10.f5251c) {
            i10.l();
        } else {
            C3226n0.a(new C3357z(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return C3303u0.b(this.f5143c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f5143c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f5143c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f5144d.zzw();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f5143c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionD = this.f5144d.d();
        collectionD.addAll(collection);
        this.f5144d.f5252d -= collection.size();
        collection.clear();
        return collectionD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5143c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f5143c.toString();
    }
}
