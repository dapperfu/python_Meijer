package com.google.maps.android.collections;

import Kd.C3945c;
import Md.C4192s;
import Md.C4193t;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class PolygonManager extends MapObjectManager<C4192s, Collection> implements C3945c.u {

    public class Collection extends MapObjectManager.Collection {
        private C3945c.u mPolygonClickListener;

        public void addAll(java.util.Collection<C4193t> collection) {
            Iterator<C4193t> it = collection.iterator();
            while (it.hasNext()) {
                addPolygon(it.next());
            }
        }

        public Collection() {
            super();
        }

        public C4192s addPolygon(C4193t c4193t) {
            C4192s c4192sD = PolygonManager.this.mMap.d(c4193t);
            super.add(c4192sD);
            return c4192sD;
        }

        public void setOnPolygonClickListener(C3945c.u uVar) {
            this.mPolygonClickListener = uVar;
        }

        public void addAll(java.util.Collection<C4193t> collection, boolean z10) {
            Iterator<C4193t> it = collection.iterator();
            while (it.hasNext()) {
                addPolygon(it.next()).l(z10);
            }
        }

        public java.util.Collection<C4192s> getPolygons() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<C4192s> it = getPolygons().iterator();
            while (it.hasNext()) {
                it.next().l(false);
            }
        }

        public boolean remove(C4192s c4192s) {
            return super.remove((Collection) c4192s);
        }

        public void showAll() {
            Iterator<C4192s> it = getPolygons().iterator();
            while (it.hasNext()) {
                it.next().l(true);
            }
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // Kd.C3945c.u
    public void onPolygonClick(C4192s c4192s) {
        Collection collection = (Collection) this.mAllObjects.get(c4192s);
        if (collection == null || collection.mPolygonClickListener == null) {
            return;
        }
        collection.mPolygonClickListener.onPolygonClick(c4192s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(C4192s c4192s) {
        c4192s.a();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void setListenersOnUiThread() {
        C3945c c3945c = this.mMap;
        if (c3945c != null) {
            c3945c.R(this);
        }
    }

    public PolygonManager(C3945c c3945c) {
        super(c3945c);
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
    public /* bridge */ /* synthetic */ boolean remove(C4192s c4192s) {
        return super.remove(c4192s);
    }
}
