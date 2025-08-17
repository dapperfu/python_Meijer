package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.ads.wg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC9838wg0 extends AbstractC10159zg0 implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private final transient Map f79517d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f79518e;

    abstract Collection g();

    abstract Collection h(Collection collection);

    abstract Collection i(Object obj, Collection collection);

    @Override // com.google.android.gms.internal.ads.InterfaceC6627Ch0
    public final int zze() {
        return this.f79518e;
    }

    static /* bridge */ /* synthetic */ void p(AbstractC9838wg0 abstractC9838wg0, Object obj) {
        Object objRemove;
        try {
            objRemove = abstractC9838wg0.f79517d.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC9838wg0.f79518e -= size;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6627Ch0
    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f79517d.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f79518e++;
            return true;
        }
        Collection collectionG = g();
        if (!collectionG.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f79518e++;
        this.f79517d.put(obj, collectionG);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10159zg0
    final Collection b() {
        return new C10052yg0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10159zg0
    final Iterator c() {
        return new C8022fg0(this);
    }

    final List k(Object obj, List list, C9517tg0 c9517tg0) {
        return list instanceof RandomAccess ? new C8983og0(this, obj, list, c9517tg0) : new C9731vg0(this, obj, list, c9517tg0);
    }

    final Map m() {
        Map map = this.f79517d;
        return map instanceof NavigableMap ? new C8769mg0(this, (NavigableMap) map) : map instanceof SortedMap ? new C9197qg0(this, (SortedMap) map) : new C8342ig0(this, map);
    }

    final Set n() {
        Map map = this.f79517d;
        return map instanceof NavigableMap ? new C8876ng0(this, (NavigableMap) map) : map instanceof SortedMap ? new C9303rg0(this, (SortedMap) map) : new C8662lg0(this, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6627Ch0
    public final void zzp() {
        Iterator it = this.f79517d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f79517d.clear();
        this.f79518e = 0;
    }

    protected AbstractC9838wg0(Map map) {
        C6657Df0.e(map.isEmpty());
        this.f79517d = map;
    }
}
