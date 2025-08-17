package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C8662lg0 extends C10054yh0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC9838wg0 f76623b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8662lg0(AbstractC9838wg0 abstractC9838wg0, Map map) {
        super(map);
        this.f76623b = abstractC9838wg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f80265a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f80265a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f80265a.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.C10054yh0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8555kg0(this, this.f80265a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f80265a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f76623b.f79518e -= size;
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        C8985oh0.b(iterator());
    }
}
