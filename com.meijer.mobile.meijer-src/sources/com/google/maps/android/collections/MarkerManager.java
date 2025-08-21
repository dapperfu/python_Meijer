package com.google.maps.android.collections;

import Md.C4110c;
import Od.C4454b;
import Od.C4466n;
import Od.C4467o;
import android.view.View;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class MarkerManager extends MapObjectManager<C4466n, Collection> implements C4110c.j, C4110c.p, C4110c.q, C4110c.b, C4110c.l {

    public class Collection extends MapObjectManager.Collection {
        private C4110c.b mInfoWindowAdapter;
        private C4110c.j mInfoWindowClickListener;
        private C4110c.l mInfoWindowLongClickListener;
        private C4110c.p mMarkerClickListener;
        private C4110c.q mMarkerDragListener;

        public void addAll(java.util.Collection<C4467o> collection) {
            Iterator<C4467o> it = collection.iterator();
            while (it.hasNext()) {
                addMarker(it.next());
            }
        }

        public C4466n addMarker(C4467o c4467o) {
            C4466n c4466nC = MarkerManager.this.mMap.c(c4467o);
            super.add(c4466nC);
            return c4466nC;
        }

        public Collection() {
            super();
        }

        public void setInfoWindowAdapter(C4110c.b bVar) {
            this.mInfoWindowAdapter = bVar;
        }

        public void setOnInfoWindowClickListener(C4110c.j jVar) {
            this.mInfoWindowClickListener = jVar;
        }

        public void setOnInfoWindowLongClickListener(C4110c.l lVar) {
            this.mInfoWindowLongClickListener = lVar;
        }

        public void setOnMarkerClickListener(C4110c.p pVar) {
            this.mMarkerClickListener = pVar;
        }

        public void setOnMarkerDragListener(C4110c.q qVar) {
            this.mMarkerDragListener = qVar;
        }

        public void addAll(java.util.Collection<C4467o> collection, boolean z10) {
            Iterator<C4467o> it = collection.iterator();
            while (it.hasNext()) {
                addMarker(it.next()).s(z10);
            }
        }

        public C4466n addMarker(C4454b c4454b) {
            C4466n c4466nC = MarkerManager.this.mMap.c(c4454b);
            super.add(c4466nC);
            return c4466nC;
        }

        public java.util.Collection<C4466n> getMarkers() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<C4466n> it = getMarkers().iterator();
            while (it.hasNext()) {
                it.next().s(false);
            }
        }

        public boolean remove(C4466n c4466n) {
            return super.remove((Collection) c4466n);
        }

        public void showAll() {
            Iterator<C4466n> it = getMarkers().iterator();
            while (it.hasNext()) {
                it.next().s(true);
            }
        }
    }

    @Override // Md.C4110c.b
    public View getInfoContents(C4466n c4466n) {
        Collection collection = (Collection) this.mAllObjects.get(c4466n);
        if (collection == null || collection.mInfoWindowAdapter == null) {
            return null;
        }
        return collection.mInfoWindowAdapter.getInfoContents(c4466n);
    }

    @Override // Md.C4110c.b
    public View getInfoWindow(C4466n c4466n) {
        Collection collection = (Collection) this.mAllObjects.get(c4466n);
        if (collection == null || collection.mInfoWindowAdapter == null) {
            return null;
        }
        return collection.mInfoWindowAdapter.getInfoWindow(c4466n);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // Md.C4110c.j
    public void onInfoWindowClick(C4466n c4466n) {
        Collection collection = (Collection) this.mAllObjects.get(c4466n);
        if (collection == null || collection.mInfoWindowClickListener == null) {
            return;
        }
        collection.mInfoWindowClickListener.onInfoWindowClick(c4466n);
    }

    @Override // Md.C4110c.l
    public void onInfoWindowLongClick(C4466n c4466n) {
        Collection collection = (Collection) this.mAllObjects.get(c4466n);
        if (collection == null || collection.mInfoWindowLongClickListener == null) {
            return;
        }
        collection.mInfoWindowLongClickListener.onInfoWindowLongClick(c4466n);
    }

    @Override // Md.C4110c.p
    public boolean onMarkerClick(C4466n c4466n) {
        Collection collection = (Collection) this.mAllObjects.get(c4466n);
        if (collection == null || collection.mMarkerClickListener == null) {
            return false;
        }
        return collection.mMarkerClickListener.onMarkerClick(c4466n);
    }

    @Override // Md.C4110c.q
    public void onMarkerDrag(C4466n c4466n) {
        Collection collection = (Collection) this.mAllObjects.get(c4466n);
        if (collection == null || collection.mMarkerDragListener == null) {
            return;
        }
        collection.mMarkerDragListener.onMarkerDrag(c4466n);
    }

    @Override // Md.C4110c.q
    public void onMarkerDragEnd(C4466n c4466n) {
        Collection collection = (Collection) this.mAllObjects.get(c4466n);
        if (collection == null || collection.mMarkerDragListener == null) {
            return;
        }
        collection.mMarkerDragListener.onMarkerDragEnd(c4466n);
    }

    @Override // Md.C4110c.q
    public void onMarkerDragStart(C4466n c4466n) {
        Collection collection = (Collection) this.mAllObjects.get(c4466n);
        if (collection == null || collection.mMarkerDragListener == null) {
            return;
        }
        collection.mMarkerDragListener.onMarkerDragStart(c4466n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(C4466n c4466n) {
        c4466n.g();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void setListenersOnUiThread() {
        C4110c c4110c = this.mMap;
        if (c4110c != null) {
            c4110c.G(this);
            this.mMap.I(this);
            this.mMap.M(this);
            this.mMap.N(this);
            this.mMap.q(this);
        }
    }

    public MarkerManager(C4110c c4110c) {
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
    public /* bridge */ /* synthetic */ boolean remove(C4466n c4466n) {
        return super.remove(c4466n);
    }
}
