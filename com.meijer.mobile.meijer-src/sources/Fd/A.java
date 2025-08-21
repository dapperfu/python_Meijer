package Fd;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
final class A extends AbstractC3514t0 {

    /* renamed from: c, reason: collision with root package name */
    final transient Map f9176c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ I f9177d;

    A(I i10, Map map) {
        this.f9177d = i10;
        this.f9176c = map;
    }

    @Override // Fd.AbstractC3514t0
    protected final Set a() {
        return new C3568y(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection get(Object obj) {
        Collection collection = (Collection) C3525u0.a(this.f9176c, obj);
        if (collection == null) {
            return null;
        }
        return this.f9177d.e(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        I i10 = this.f9177d;
        if (this.f9176c == i10.f9284c) {
            i10.l();
        } else {
            C3448n0.a(new C3579z(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return C3525u0.b(this.f9176c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f9176c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f9176c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f9177d.zzw();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f9176c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionD = this.f9177d.d();
        collectionD.addAll(collection);
        this.f9177d.f9285d -= collection.size();
        collection.clear();
        return collectionD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9176c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f9176c.toString();
    }
}
