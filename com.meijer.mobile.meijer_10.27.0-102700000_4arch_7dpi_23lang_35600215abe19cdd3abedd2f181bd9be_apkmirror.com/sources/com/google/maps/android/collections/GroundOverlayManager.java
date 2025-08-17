package com.google.maps.android.collections;

import Kd.C3945c;
import Md.C4184j;
import Md.C4185k;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class GroundOverlayManager extends MapObjectManager<C4184j, Collection> implements C3945c.h {

    public class Collection extends MapObjectManager.Collection {
        private C3945c.h mGroundOverlayClickListener;

        public void addAll(java.util.Collection<C4185k> collection) {
            Iterator<C4185k> it = collection.iterator();
            while (it.hasNext()) {
                addGroundOverlay(it.next());
            }
        }

        public Collection() {
            super();
        }

        public C4184j addGroundOverlay(C4185k c4185k) {
            C4184j c4184jB = GroundOverlayManager.this.mMap.b(c4185k);
            super.add(c4184jB);
            return c4184jB;
        }

        public void setOnGroundOverlayClickListener(C3945c.h hVar) {
            this.mGroundOverlayClickListener = hVar;
        }

        public void addAll(java.util.Collection<C4185k> collection, boolean z10) {
            Iterator<C4185k> it = collection.iterator();
            while (it.hasNext()) {
                addGroundOverlay(it.next()).k(z10);
            }
        }

        public java.util.Collection<C4184j> getGroundOverlays() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<C4184j> it = getGroundOverlays().iterator();
            while (it.hasNext()) {
                it.next().k(false);
            }
        }

        public boolean remove(C4184j c4184j) {
            return super.remove((Collection) c4184j);
        }

        public void showAll() {
            Iterator<C4184j> it = getGroundOverlays().iterator();
            while (it.hasNext()) {
                it.next().k(true);
            }
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // Kd.C3945c.h
    public void onGroundOverlayClick(C4184j c4184j) {
        Collection collection = (Collection) this.mAllObjects.get(c4184j);
        if (collection == null || collection.mGroundOverlayClickListener == null) {
            return;
        }
        collection.mGroundOverlayClickListener.onGroundOverlayClick(c4184j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(C4184j c4184j) {
        c4184j.a();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void setListenersOnUiThread() {
        C3945c c3945c = this.mMap;
        if (c3945c != null) {
            c3945c.E(this);
        }
    }

    public GroundOverlayManager(C3945c c3945c) {
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
    public /* bridge */ /* synthetic */ boolean remove(C4184j c4184j) {
        return super.remove(c4184j);
    }
}
