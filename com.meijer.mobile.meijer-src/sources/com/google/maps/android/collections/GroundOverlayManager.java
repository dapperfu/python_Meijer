package com.google.maps.android.collections;

import Md.C4110c;
import Od.C4462j;
import Od.C4463k;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class GroundOverlayManager extends MapObjectManager<C4462j, Collection> implements C4110c.h {

    public class Collection extends MapObjectManager.Collection {
        private C4110c.h mGroundOverlayClickListener;

        public void addAll(java.util.Collection<C4463k> collection) {
            Iterator<C4463k> it = collection.iterator();
            while (it.hasNext()) {
                addGroundOverlay(it.next());
            }
        }

        public Collection() {
            super();
        }

        public C4462j addGroundOverlay(C4463k c4463k) {
            C4462j c4462jB = GroundOverlayManager.this.mMap.b(c4463k);
            super.add(c4462jB);
            return c4462jB;
        }

        public void setOnGroundOverlayClickListener(C4110c.h hVar) {
            this.mGroundOverlayClickListener = hVar;
        }

        public void addAll(java.util.Collection<C4463k> collection, boolean z10) {
            Iterator<C4463k> it = collection.iterator();
            while (it.hasNext()) {
                addGroundOverlay(it.next()).k(z10);
            }
        }

        public java.util.Collection<C4462j> getGroundOverlays() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<C4462j> it = getGroundOverlays().iterator();
            while (it.hasNext()) {
                it.next().k(false);
            }
        }

        public boolean remove(C4462j c4462j) {
            return super.remove((Collection) c4462j);
        }

        public void showAll() {
            Iterator<C4462j> it = getGroundOverlays().iterator();
            while (it.hasNext()) {
                it.next().k(true);
            }
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // Md.C4110c.h
    public void onGroundOverlayClick(C4462j c4462j) {
        Collection collection = (Collection) this.mAllObjects.get(c4462j);
        if (collection == null || collection.mGroundOverlayClickListener == null) {
            return;
        }
        collection.mGroundOverlayClickListener.onGroundOverlayClick(c4462j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(C4462j c4462j) {
        c4462j.a();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void setListenersOnUiThread() {
        C4110c c4110c = this.mMap;
        if (c4110c != null) {
            c4110c.E(this);
        }
    }

    public GroundOverlayManager(C4110c c4110c) {
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
    public /* bridge */ /* synthetic */ boolean remove(C4462j c4462j) {
        return super.remove(c4462j);
    }
}
