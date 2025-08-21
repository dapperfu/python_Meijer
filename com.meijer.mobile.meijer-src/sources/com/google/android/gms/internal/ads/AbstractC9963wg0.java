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
abstract class AbstractC9963wg0 extends AbstractC10284zg0 implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private final transient Map f80357d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f80358e;

    abstract Collection g();

    abstract Collection h(Collection collection);

    abstract Collection i(Object obj, Collection collection);

    @Override // com.google.android.gms.internal.ads.InterfaceC6752Ch0
    public final int zze() {
        return this.f80358e;
    }

    static /* bridge */ /* synthetic */ void p(AbstractC9963wg0 abstractC9963wg0, Object obj) {
        Object objRemove;
        try {
            objRemove = abstractC9963wg0.f80357d.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC9963wg0.f80358e -= size;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6752Ch0
    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f80357d.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f80358e++;
            return true;
        }
        Collection collectionG = g();
        if (!collectionG.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f80358e++;
        this.f80357d.put(obj, collectionG);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10284zg0
    final Collection b() {
        return new C10177yg0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10284zg0
    final Iterator c() {
        return new C8147fg0(this);
    }

    final List k(Object obj, List list, C9642tg0 c9642tg0) {
        return list instanceof RandomAccess ? new C9108og0(this, obj, list, c9642tg0) : new C9856vg0(this, obj, list, c9642tg0);
    }

    final Map m() {
        Map map = this.f80357d;
        return map instanceof NavigableMap ? new C8894mg0(this, (NavigableMap) map) : map instanceof SortedMap ? new C9322qg0(this, (SortedMap) map) : new C8467ig0(this, map);
    }

    final Set n() {
        Map map = this.f80357d;
        return map instanceof NavigableMap ? new C9001ng0(this, (NavigableMap) map) : map instanceof SortedMap ? new C9428rg0(this, (SortedMap) map) : new C8787lg0(this, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6752Ch0
    public final void zzp() {
        Iterator it = this.f80357d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f80357d.clear();
        this.f80358e = 0;
    }

    protected AbstractC9963wg0(Map map) {
        C6782Df0.e(map.isEmpty());
        this.f80357d = map;
    }
}
