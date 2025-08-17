package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ig0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C8342ig0 extends AbstractC6559Ah0 {

    /* renamed from: c, reason: collision with root package name */
    final transient Map f74994c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC9838wg0 f74995d;

    C8342ig0(AbstractC9838wg0 abstractC9838wg0, Map map) {
        this.f74995d = abstractC9838wg0;
        this.f74994c = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6559Ah0
    protected final Set a() {
        return new C8129gg0(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC9838wg0 abstractC9838wg0 = this.f74995d;
        if (this.f74994c == abstractC9838wg0.f79517d) {
            abstractC9838wg0.zzp();
        } else {
            C8985oh0.b(new C8236hg0(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f74994c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f74994c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) C6593Bh0.a(this.f74994c, obj);
        if (collection == null) {
            return null;
        }
        return this.f74995d.i(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f74994c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f74995d.f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f74994c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionG = this.f74995d.g();
        collectionG.addAll(collection);
        this.f74995d.f79518e -= collection.size();
        collection.clear();
        return collectionG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f74994c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f74994c.toString();
    }

    final Map.Entry b(Map.Entry entry) {
        Object key = entry.getKey();
        return new C7491ah0(key, this.f74995d.i(key, (Collection) entry.getValue()));
    }
}
