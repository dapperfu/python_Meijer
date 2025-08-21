package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ig0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C8467ig0 extends AbstractC6684Ah0 {

    /* renamed from: c, reason: collision with root package name */
    final transient Map f75834c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC9963wg0 f75835d;

    C8467ig0(AbstractC9963wg0 abstractC9963wg0, Map map) {
        this.f75835d = abstractC9963wg0;
        this.f75834c = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6684Ah0
    protected final Set a() {
        return new C8254gg0(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC9963wg0 abstractC9963wg0 = this.f75835d;
        if (this.f75834c == abstractC9963wg0.f80357d) {
            abstractC9963wg0.zzp();
        } else {
            C9110oh0.b(new C8361hg0(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f75834c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f75834c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) C6718Bh0.a(this.f75834c, obj);
        if (collection == null) {
            return null;
        }
        return this.f75835d.i(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f75834c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f75835d.f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f75834c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionG = this.f75835d.g();
        collectionG.addAll(collection);
        this.f75835d.f80358e -= collection.size();
        collection.clear();
        return collectionG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f75834c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f75834c.toString();
    }

    final Map.Entry b(Map.Entry entry) {
        Object key = entry.getKey();
        return new C7616ah0(key, this.f75835d.i(key, (Collection) entry.getValue()));
    }
}
