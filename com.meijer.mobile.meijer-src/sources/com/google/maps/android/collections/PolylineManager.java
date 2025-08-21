package com.google.maps.android.collections;

import Md.C4110c;
import Od.C4472u;
import Od.C4473v;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class PolylineManager extends MapObjectManager<C4472u, Collection> implements C4110c.v {

    public class Collection extends MapObjectManager.Collection {
        private C4110c.v mPolylineClickListener;

        public void addAll(java.util.Collection<C4473v> collection) {
            Iterator<C4473v> it = collection.iterator();
            while (it.hasNext()) {
                addPolyline(it.next());
            }
        }

        public Collection() {
            super();
        }

        public C4472u addPolyline(C4473v c4473v) {
            C4472u c4472uE = PolylineManager.this.mMap.e(c4473v);
            super.add(c4472uE);
            return c4472uE;
        }

        public void setOnPolylineClickListener(C4110c.v vVar) {
            this.mPolylineClickListener = vVar;
        }

        public void addAll(java.util.Collection<C4473v> collection, boolean z10) {
            Iterator<C4473v> it = collection.iterator();
            while (it.hasNext()) {
                addPolyline(it.next()).l(z10);
            }
        }

        public java.util.Collection<C4472u> getPolylines() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<C4472u> it = getPolylines().iterator();
            while (it.hasNext()) {
                it.next().l(false);
            }
        }

        public boolean remove(C4472u c4472u) {
            return super.remove((Collection) c4472u);
        }

        public void showAll() {
            Iterator<C4472u> it = getPolylines().iterator();
            while (it.hasNext()) {
                it.next().l(true);
            }
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // Md.C4110c.v
    public void onPolylineClick(C4472u c4472u) {
        Collection collection = (Collection) this.mAllObjects.get(c4472u);
        if (collection == null || collection.mPolylineClickListener == null) {
            return;
        }
        collection.mPolylineClickListener.onPolylineClick(c4472u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(C4472u c4472u) {
        c4472u.a();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void setListenersOnUiThread() {
        C4110c c4110c = this.mMap;
        if (c4110c != null) {
            c4110c.S(this);
        }
    }

    public PolylineManager(C4110c c4110c) {
        super(c4110c);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public Collection newCollection() {
        return new Collection();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(C4472u c4472u) {
        return super.remove(c4472u);
    }
}
