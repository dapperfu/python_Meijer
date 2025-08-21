package com.google.maps.android.collections;

import Md.C4110c;
import Od.C4470s;
import Od.C4471t;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class PolygonManager extends MapObjectManager<C4470s, Collection> implements C4110c.u {

    public class Collection extends MapObjectManager.Collection {
        private C4110c.u mPolygonClickListener;

        public void addAll(java.util.Collection<C4471t> collection) {
            Iterator<C4471t> it = collection.iterator();
            while (it.hasNext()) {
                addPolygon(it.next());
            }
        }

        public Collection() {
            super();
        }

        public C4470s addPolygon(C4471t c4471t) {
            C4470s c4470sD = PolygonManager.this.mMap.d(c4471t);
            super.add(c4470sD);
            return c4470sD;
        }

        public void setOnPolygonClickListener(C4110c.u uVar) {
            this.mPolygonClickListener = uVar;
        }

        public void addAll(java.util.Collection<C4471t> collection, boolean z10) {
            Iterator<C4471t> it = collection.iterator();
            while (it.hasNext()) {
                addPolygon(it.next()).l(z10);
            }
        }

        public java.util.Collection<C4470s> getPolygons() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<C4470s> it = getPolygons().iterator();
            while (it.hasNext()) {
                it.next().l(false);
            }
        }

        public boolean remove(C4470s c4470s) {
            return super.remove((Collection) c4470s);
        }

        public void showAll() {
            Iterator<C4470s> it = getPolygons().iterator();
            while (it.hasNext()) {
                it.next().l(true);
            }
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // Md.C4110c.u
    public void onPolygonClick(C4470s c4470s) {
        Collection collection = (Collection) this.mAllObjects.get(c4470s);
        if (collection == null || collection.mPolygonClickListener == null) {
            return;
        }
        collection.mPolygonClickListener.onPolygonClick(c4470s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(C4470s c4470s) {
        c4470s.a();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void setListenersOnUiThread() {
        C4110c c4110c = this.mMap;
        if (c4110c != null) {
            c4110c.R(this);
        }
    }

    public PolygonManager(C4110c c4110c) {
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
    public /* bridge */ /* synthetic */ boolean remove(C4470s c4470s) {
        return super.remove(c4470s);
    }
}
