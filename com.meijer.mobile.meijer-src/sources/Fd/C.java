package Fd;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class C extends C3492r0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I f9207b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(I i10, Map map) {
        super(map);
        this.f9207b = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f10265a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f10265a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f10265a.keySet().hashCode();
    }

    @Override // Fd.C3492r0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new B(this, this.f10265a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f10265a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f9207b.f9285d -= size;
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        C3448n0.a(iterator());
    }
}
