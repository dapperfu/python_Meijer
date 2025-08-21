package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C8787lg0 extends C10179yh0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC9963wg0 f77463b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8787lg0(AbstractC9963wg0 abstractC9963wg0, Map map) {
        super(map);
        this.f77463b = abstractC9963wg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f81105a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f81105a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f81105a.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.C10179yh0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8680kg0(this, this.f81105a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f81105a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f77463b.f80358e -= size;
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        C9110oh0.b(iterator());
    }
}
