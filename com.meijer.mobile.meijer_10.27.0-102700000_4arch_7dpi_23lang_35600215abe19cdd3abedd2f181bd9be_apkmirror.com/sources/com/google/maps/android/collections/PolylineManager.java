package com.google.maps.android.collections;

import Kd.C3945c;
import Md.C4194u;
import Md.C4195v;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class PolylineManager extends MapObjectManager<C4194u, Collection> implements C3945c.v {

    public class Collection extends MapObjectManager.Collection {
        private C3945c.v mPolylineClickListener;

        public void addAll(java.util.Collection<C4195v> collection) {
            Iterator<C4195v> it = collection.iterator();
            while (it.hasNext()) {
                addPolyline(it.next());
            }
        }

        public Collection() {
            super();
        }

        public C4194u addPolyline(C4195v c4195v) {
            C4194u c4194uE = PolylineManager.this.mMap.e(c4195v);
            super.add(c4194uE);
            return c4194uE;
        }

        public void setOnPolylineClickListener(C3945c.v vVar) {
            this.mPolylineClickListener = vVar;
        }

        public void addAll(java.util.Collection<C4195v> collection, boolean z10) {
            Iterator<C4195v> it = collection.iterator();
            while (it.hasNext()) {
                addPolyline(it.next()).l(z10);
            }
        }

        public java.util.Collection<C4194u> getPolylines() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<C4194u> it = getPolylines().iterator();
            while (it.hasNext()) {
                it.next().l(false);
            }
        }

        public boolean remove(C4194u c4194u) {
            return super.remove((Collection) c4194u);
        }

        public void showAll() {
            Iterator<C4194u> it = getPolylines().iterator();
            while (it.hasNext()) {
                it.next().l(true);
            }
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // Kd.C3945c.v
    public void onPolylineClick(C4194u c4194u) {
        Collection collection = (Collection) this.mAllObjects.get(c4194u);
        if (collection == null || collection.mPolylineClickListener == null) {
            return;
        }
        collection.mPolylineClickListener.onPolylineClick(c4194u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(C4194u c4194u) {
        c4194u.a();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void setListenersOnUiThread() {
        C3945c c3945c = this.mMap;
        if (c3945c != null) {
            c3945c.S(this);
        }
    }

    public PolylineManager(C3945c c3945c) {
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
    public /* bridge */ /* synthetic */ boolean remove(C4194u c4194u) {
        return super.remove(c4194u);
    }
}
