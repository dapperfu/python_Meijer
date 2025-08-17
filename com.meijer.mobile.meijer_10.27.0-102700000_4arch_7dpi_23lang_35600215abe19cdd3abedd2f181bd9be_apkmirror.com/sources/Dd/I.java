package Dd;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes6.dex */
abstract class I extends K implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private final transient Map f5251c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f5252d;

    abstract Collection d();

    abstract Collection e(Object obj, Collection collection);

    static /* bridge */ /* synthetic */ void k(I i10, Object obj) {
        Object objRemove;
        try {
            objRemove = i10.f5251c.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            i10.f5252d -= size;
        }
    }

    @Override // Dd.InterfaceC3314v0
    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f5251c.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f5252d++;
            return true;
        }
        Collection collectionD = d();
        if (!collectionD.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f5252d++;
        this.f5251c.put(obj, collectionD);
        return true;
    }

    @Override // Dd.K
    final Map b() {
        return new A(this, this.f5251c);
    }

    @Override // Dd.K
    final Set c() {
        return new C(this, this.f5251c);
    }

    public final Collection g(Object obj) {
        Collection collectionD = (Collection) this.f5251c.get(obj);
        if (collectionD == null) {
            collectionD = d();
        }
        return e(obj, collectionD);
    }

    final List h(Object obj, List list, F f10) {
        return list instanceof RandomAccess ? new D(this, obj, list, f10) : new H(this, obj, list, f10);
    }

    public final void l() {
        Iterator it = this.f5251c.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f5251c.clear();
        this.f5252d = 0;
    }

    protected I(Map map) {
        C3291t.c(map.isEmpty());
        this.f5251c = map;
    }
}
