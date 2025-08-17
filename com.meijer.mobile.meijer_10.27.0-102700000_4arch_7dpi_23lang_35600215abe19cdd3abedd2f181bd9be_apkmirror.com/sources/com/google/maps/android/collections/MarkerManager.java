package com.google.maps.android.collections;

import Kd.C3945c;
import Md.C4176b;
import Md.C4188n;
import Md.C4189o;
import android.view.View;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class MarkerManager extends MapObjectManager<C4188n, Collection> implements C3945c.j, C3945c.p, C3945c.q, C3945c.b, C3945c.l {

    public class Collection extends MapObjectManager.Collection {
        private C3945c.b mInfoWindowAdapter;
        private C3945c.j mInfoWindowClickListener;
        private C3945c.l mInfoWindowLongClickListener;
        private C3945c.p mMarkerClickListener;
        private C3945c.q mMarkerDragListener;

        public void addAll(java.util.Collection<C4189o> collection) {
            Iterator<C4189o> it = collection.iterator();
            while (it.hasNext()) {
                addMarker(it.next());
            }
        }

        public C4188n addMarker(C4189o c4189o) {
            C4188n c4188nC = MarkerManager.this.mMap.c(c4189o);
            super.add(c4188nC);
            return c4188nC;
        }

        public Collection() {
            super();
        }

        public void setInfoWindowAdapter(C3945c.b bVar) {
            this.mInfoWindowAdapter = bVar;
        }

        public void setOnInfoWindowClickListener(C3945c.j jVar) {
            this.mInfoWindowClickListener = jVar;
        }

        public void setOnInfoWindowLongClickListener(C3945c.l lVar) {
            this.mInfoWindowLongClickListener = lVar;
        }

        public void setOnMarkerClickListener(C3945c.p pVar) {
            this.mMarkerClickListener = pVar;
        }

        public void setOnMarkerDragListener(C3945c.q qVar) {
            this.mMarkerDragListener = qVar;
        }

        public void addAll(java.util.Collection<C4189o> collection, boolean z10) {
            Iterator<C4189o> it = collection.iterator();
            while (it.hasNext()) {
                addMarker(it.next()).s(z10);
            }
        }

        public C4188n addMarker(C4176b c4176b) {
            C4188n c4188nC = MarkerManager.this.mMap.c(c4176b);
            super.add(c4188nC);
            return c4188nC;
        }

        public java.util.Collection<C4188n> getMarkers() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<C4188n> it = getMarkers().iterator();
            while (it.hasNext()) {
                it.next().s(false);
            }
        }

        public boolean remove(C4188n c4188n) {
            return super.remove((Collection) c4188n);
        }

        public void showAll() {
            Iterator<C4188n> it = getMarkers().iterator();
            while (it.hasNext()) {
                it.next().s(true);
            }
        }
    }

    @Override // Kd.C3945c.b
    public View getInfoContents(C4188n c4188n) {
        Collection collection = (Collection) this.mAllObjects.get(c4188n);
        if (collection == null || collection.mInfoWindowAdapter == null) {
            return null;
        }
        return collection.mInfoWindowAdapter.getInfoContents(c4188n);
    }

    @Override // Kd.C3945c.b
    public View getInfoWindow(C4188n c4188n) {
        Collection collection = (Collection) this.mAllObjects.get(c4188n);
        if (collection == null || collection.mInfoWindowAdapter == null) {
            return null;
        }
        return collection.mInfoWindowAdapter.getInfoWindow(c4188n);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // Kd.C3945c.j
    public void onInfoWindowClick(C4188n c4188n) {
        Collection collection = (Collection) this.mAllObjects.get(c4188n);
        if (collection == null || collection.mInfoWindowClickListener == null) {
            return;
        }
        collection.mInfoWindowClickListener.onInfoWindowClick(c4188n);
    }

    @Override // Kd.C3945c.l
    public void onInfoWindowLongClick(C4188n c4188n) {
        Collection collection = (Collection) this.mAllObjects.get(c4188n);
        if (collection == null || collection.mInfoWindowLongClickListener == null) {
            return;
        }
        collection.mInfoWindowLongClickListener.onInfoWindowLongClick(c4188n);
    }

    @Override // Kd.C3945c.p
    public boolean onMarkerClick(C4188n c4188n) {
        Collection collection = (Collection) this.mAllObjects.get(c4188n);
        if (collection == null || collection.mMarkerClickListener == null) {
            return false;
        }
        return collection.mMarkerClickListener.onMarkerClick(c4188n);
    }

    @Override // Kd.C3945c.q
    public void onMarkerDrag(C4188n c4188n) {
        Collection collection = (Collection) this.mAllObjects.get(c4188n);
        if (collection == null || collection.mMarkerDragListener == null) {
            return;
        }
        collection.mMarkerDragListener.onMarkerDrag(c4188n);
    }

    @Override // Kd.C3945c.q
    public void onMarkerDragEnd(C4188n c4188n) {
        Collection collection = (Collection) this.mAllObjects.get(c4188n);
        if (collection == null || collection.mMarkerDragListener == null) {
            return;
        }
        collection.mMarkerDragListener.onMarkerDragEnd(c4188n);
    }

    @Override // Kd.C3945c.q
    public void onMarkerDragStart(C4188n c4188n) {
        Collection collection = (Collection) this.mAllObjects.get(c4188n);
        if (collection == null || collection.mMarkerDragListener == null) {
            return;
        }
        collection.mMarkerDragListener.onMarkerDragStart(c4188n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(C4188n c4188n) {
        c4188n.g();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void setListenersOnUiThread() {
        C3945c c3945c = this.mMap;
        if (c3945c != null) {
            c3945c.G(this);
            this.mMap.I(this);
            this.mMap.M(this);
            this.mMap.N(this);
            this.mMap.q(this);
        }
    }

    public MarkerManager(C3945c c3945c) {
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
    public /* bridge */ /* synthetic */ boolean remove(C4188n c4188n) {
        return super.remove(c4188n);
    }
}
